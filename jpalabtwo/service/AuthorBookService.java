package com.cg.jpalabtwo.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.cg.jpalabtwo.dto.Author;
import com.cg.jpalabtwo.dto.Book;

public interface AuthorBookService {
	public Author addAuthor(Author author);
	public Author findAuthor(BigInteger authorId);
	public Author removeAuthor(BigInteger authorId);
	public List<Author> findAllAuthor();
	public Book addBook(Book book);
	public Book findBook(BigInteger bookID);
	public List<Book> findAllBook();
	public List<Book> findBookWithPrice(BigDecimal min, BigDecimal max);
	public List<Book> findBookByAuthorName(String authorName);
	
}