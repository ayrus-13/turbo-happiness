package com.cg.jpalabtwo.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.jpalabtwo.dto.Author;
import com.cg.jpalabtwo.dto.Book;

public class AuthorBookDaoImpl implements AuthorBookDao {

	private static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("jpalabtwo");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();
	private static EntityTransaction tx=entityManager.getTransaction();

	
	public AuthorBookDaoImpl() {
		super();
	}


	public Author addAuthor(Author author) {
		tx.begin();
		author.getBookList().forEach(book -> {
			book.getAuthor().add(author);
		});
		entityManager.persist(author);
		tx.commit();
		return author;
	}


	public Author findAuthor(BigInteger authorId) {
		return entityManager.find(Author.class, authorId);
	}


	public Author removeAuthor(BigInteger authorId) {
		Author author = entityManager.find(Author.class, authorId);
		if (author!= null) {
			try{
				tx.begin();
			
			author.getBookList().forEach(book -> {
				book.getAuthor().remove(author);
			});
			entityManager.remove(author);
			tx.commit();
		
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
			return author;
	}


	public List<Author> findAllAuthor() {
		Query query = entityManager.createQuery("FROM Author");
		List<Author> authList = query.getResultList();
		return authList;
	}


	public Book addBook(Book book) {
		Query query = entityManager.createQuery("FROM Author");
		List<Author> authList = query.getResultList();
		return (Book) authList;
	}


	public Book findBook(BigInteger bookID) {
		return entityManager.find(Book.class, bookID);
	}


	public List<Book> findAllBook() {
		Query query = entityManager.createQuery("FROM Book");
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}


	public List<Book> findBookWithPrice(BigDecimal min, BigDecimal max) {
		Query query = entityManager.createQuery("FROM Book WHERE bookPrice BETWEEN :first AND :second");
		query.setParameter("first", min);
		query.setParameter("second", max);
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}


	public List<Book> findBookByAuthorName(String authorName) {
		Query query = entityManager.createQuery("FROM Author WHERE authorFirstName=:first");
		query.setParameter("first", authorName);
		Author author = (Author) query.getSingleResult();
		if(author != null)
			return author.getBookList();
		else
			return null;
	}
}

	