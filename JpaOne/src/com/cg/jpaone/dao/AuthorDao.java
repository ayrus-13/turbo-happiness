package com.cg.jpaone.dao;

import java.math.BigInteger;

import com.cg.jpaone.dto.Author;

public interface AuthorDao {
	public Author addAuthor(Author author);
	public Author updateauthor(Author author);
	public Author removeAuthor (BigInteger authorId);
	public Author findAuthor(BigInteger authorId);

}
