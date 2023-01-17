package com.unit_testing.assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.testing.modelclass.Book;
import com.testing.service.BookService;

public class AssertEqualsMethods {

	@Test
	void assertEqualsWithNoMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);

		Book actualBook = bookService.getBookById("2");

		assertEquals("2", actualBook.getBookId());
		assertEquals("Java Book 2", actualBook.getTitle());

	}

	@Test
	void assertEqualsWithMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);

		Book actualBook = bookService.getBookById("1");

		assertEquals("1", actualBook.getBookId(), "Id is not matching");
		assertEquals("Java Book 2", actualBook.getTitle(), "Title is not matching");

	}

	@Test
	void assertEqualsWithMessageSupplier() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);

		Book actualBook = bookService.getBookById("1");

		assertEquals("1", actualBook.getBookId(), "Id is not matching");
		assertEquals("Java Book", actualBook.getTitle(), () -> "Title is not matching");

	}

}
