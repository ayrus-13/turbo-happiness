package com.cg.jpaone.dao;


import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.cg.jpaone.dto.Author;

public class AuthorDaoImpl implements AuthorDao {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction tx;

	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpalab");
		entityManager = entityManagerFactory.createEntityManager();
		tx = entityManager.getTransaction();
	}

	public AuthorDaoImpl() {
		super();
	}


	@Override
	public Author findAuthor(BigInteger authorId) {
		return entityManager.find(Author.class, authorId);
	}

	@Override
	public Author removeAuthor(BigInteger authorId) {
		Author author = entityManager.find(Author.class, authorId);
		entityManager.remove(author);
		return author;
	}


	@Override
	public Author addAuthor(Author author) {
		tx.begin();
		entityManager.persist(author);
		tx.commit();
		return author;
	}


	@Override
	public Author updateauthor(Author auth) {
		tx.begin();
		Author author = entityManager.find(Author.class, auth.getAuthorId());
		author.setFirstName(auth.getFirstName());
		author.setLastName(auth.getLastName());
		author.setMiddleName(auth.getMiddleName());
		tx.commit();
		return author;
	}

	
	
	

	

	
	
	
	


}
