package com.cg.jpalabtwo.ui;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.jpalabtwo.dto.Author;
import com.cg.jpalabtwo.dto.Book;
import com.cg.jpalabtwo.service.AuthorBookService;
import com.cg.jpalabtwo.service.AuthorBookServiceImpl;

public class Application {

	public Application() {
		super();
	}

	static AuthorBookService abService=new AuthorBookServiceImpl();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1. Add Book");
			System.out.println("2. Find Book");
			System.out.println("3. List all books");
			System.out.println("4. Add author");
			System.out.println("5. List all authors");
			System.out.println("6. Find books by an author");
			System.out.println("7. Books with price between 500 and 1000");
			System.out.println("0. Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter Book ISBN");
				BigInteger bookIsbn = sc.nextBigInteger();
				System.out.println("Enter Book Title");
				sc.nextLine();
				String bookTitle = sc.nextLine();
				System.out.println("Enter Book Price");
				BigDecimal bookPrice = sc.nextBigDecimal();
				int choice;
				List<Author> authList = new ArrayList<Author>();
				do {
					System.out.println("Enter the Author Id");
					BigInteger authorId = sc.nextBigInteger();
					Author auth = abService.findAuthor(authorId);
					if (auth != null) {
						authList.add(auth);
					} else {
						System.out.println("Enter the Author Name (FirstName MiddleName LastName)");
						String authorFirstName = sc.next();
						String authorMiddleName = sc.next();
						String authorLastName = sc.next();
						System.out.println("Enter the Author Phone no");
						BigInteger authorPhoneNo = sc.nextBigInteger();
						Author author = new Author();
						author.setAuthorId(authorId);
						author.setAuthorFirstName(authorFirstName);
						author.setAuthorMiddleName(authorMiddleName);
						author.setAuthorLastName(authorLastName);
						author.setAuthorPhoneNo(authorPhoneNo);
						author.setBookList(new ArrayList<Book>());
						authList.add(author);
					}
					System.out.println("Enter ur choice");
					choice = sc.nextInt();

				} while (choice == 1);
				Book book = new Book(bookIsbn, bookTitle, bookPrice, authList);
				abService.addBook(book);
				System.out.println("Book added ");
				break;
			}
			case 2: {
				System.out.println("Enter Book ISBN");
				BigInteger bookIsbn = sc.nextBigInteger();
				System.out.println(abService.findBook(bookIsbn));
				break;
			}
			case 3: {
				List<Book> books = abService.findAllBook();
				books.forEach(book -> {
					System.out.println(book);
				});
				break;
			}
			case 4: {
				System.out.println("Enter the Author Id");
				BigInteger authorId = sc.nextBigInteger();
				System.out.println("Enter the Author Name (FirstName MiddleName LastName)");
				String authorFirstName = sc.next();
				String authorMiddleName = sc.next();
				String authorLastName = sc.next();
				System.out.println("Enter the Author Phone no");
				BigInteger authorPhoneNo = sc.nextBigInteger();
				int choice;
				List<Book> bookList = new ArrayList<Book>();
				do {
					System.out.println("Enter Book ISBN written by the author");
					BigInteger bookIsbn = sc.nextBigInteger();
					Book book = abService.findBook(bookIsbn);

					if (book != null) {
						bookList.add(book);
					} else {
						System.out.println("Enter Book Title");
						sc.nextLine();
						String bookTitle = sc.nextLine();
						System.out.println("Enter Book Price");
						BigDecimal bookPrice = sc.nextBigDecimal();
						Book newBook = new Book();
						newBook.setBookIsbn(bookIsbn);
						newBook.setBookPrice(bookPrice);
						newBook.setBookTitle(bookTitle);
						newBook.setAuthor(new ArrayList<Author>());
						bookList.add(book);
					}
					System.out.println("Enter ur choice");
					choice = sc.nextInt();

				} while (choice == 1);
				Author author = new Author(authorId, authorFirstName, authorMiddleName, authorLastName, authorPhoneNo,
						bookList);
				abService.addAuthor(author);
				System.out.println("Author added ");
				break;
			}
			case 5: {
				List<Author> authList = abService.findAllAuthor();
				authList.forEach(author -> {
					System.out.println(author);
				});
				break;
			}
			case 6:
			{
				System.out.println("Enter the first name of author");
				String authorFName = sc.next();
				List<Book> bookList = abService.findBookByAuthorName(authorFName);
				if (bookList != null) {
					bookList.forEach(book -> {
						System.out.println(book);
					});
				}
				break;
			}
			case 7:
			{
				System.out.println("The books with price between 500 and 1000 are ");
				List<Book> bookList = abService.findBookWithPrice(BigDecimal.valueOf(500.0), BigDecimal.valueOf(1000.0));
				if(bookList != null) {
					bookList.forEach(book -> {
						System.out.println(book);
					});
				}
				break;
			}
			case 0:
				System.out.println("Geting out");
				break;
			default:
				System.out.println("Enter a valid input");
			}
		} while (ch != 0);
		sc.close();
	}
}