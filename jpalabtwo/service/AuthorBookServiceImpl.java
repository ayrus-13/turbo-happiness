package com.cg.jpalabtwo.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.cg.jpalabtwo.dao.AuthorBookDao;
import com.cg.jpalabtwo.dao.AuthorBookDaoImpl;
import com.cg.jpalabtwo.dto.Author;
import com.cg.jpalabtwo.dto.Book;

public class AuthorBookServiceImpl implements AuthorBookService {
	
	AuthorBookDao authorDao=new AuthorBookDaoImpl();

	@Override
	public Author addAuthor(Author author) {
		return authorDao.addAuthor(author);
	}

	@Override
	public Author findAuthor(BigInteger authorId) {
		return authorDao.findAuthor(authorId);
	}

	@Override
	public Author removeAuthor(BigInteger authorId) {
		return authorDao.removeAuthor(authorId);
	}

	@Override
	public List<Author> findAllAuthor() {
		return authorDao.findAllAuthor();
	}

	@Override
	public Book addBook(Book book) {
		return authorDao.addBook(book);
	}

	@Override
	public Book findBook(BigInteger bookId) {
		return authorDao.findBook(bookId);
	}

	@Override
	public List<Book> findAllBook() {
		return authorDao.findAllBook();
	}

	@Override
	public List<Book> findBookWithPrice(BigDecimal min, BigDecimal max) {
		return authorDao.findBookWithPrice(min,max);
	}

	@Override
	public List<Book> findBookByAuthorName(String authorName) {
		return authorDao.findBookByAuthorName(authorName);

	}
}
	
	