package com.unit_testing.assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.testing.modelclass.Book;
import com.testing.service.BookService;

public class AssertNullMethods {
	
	@Test
	void assertNullWithNoMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);

		Book actualBook = bookService.getBookById("2");

		assertNull(actualBook);

	}

	@Test
	void assertNullWithMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);

		Book actualBook = bookService.getBookById("3");

		assertNull(actualBook , "Book is not null");

	}

}
