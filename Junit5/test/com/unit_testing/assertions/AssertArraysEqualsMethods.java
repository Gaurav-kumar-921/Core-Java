package com.unit_testing.assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.testing.modelclass.Book;
import com.testing.service.BookService;

public class AssertArraysEqualsMethods {

	@Test
	void assertArraysEqualsWithNoMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");
		Book javaBook3 = new Book("3", "Java Book 3", "Goku");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);
		bookService.addBook(javaBook3);

		String[] actualBookIds = bookService.getBookIdsByPublisher("Goku");

		assertArrayEquals(new String[] { "1", "3" }, actualBookIds);

	}

	@Test
	void assertArraysEqualsWithMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");
		Book javaBook3 = new Book("3", "Java Book 3", "Goku");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);
		bookService.addBook(javaBook3);

		String[] actualBookIds = bookService.getBookIdsByPublisher("Goku");

		assertArrayEquals(new String[] { "1", "3" }, actualBookIds, "bookIds did not match!");

	}

	@Test
	void assertArraysEqualsWithMessageSupplier() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");
		Book javaBook3 = new Book("3", "Java Book 3", "Goku");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);
		bookService.addBook(javaBook3);

		String[] actualBookIds = bookService.getBookIdsByPublisher("Goku");

		assertArrayEquals(new String[] { "1", "4" }, actualBookIds, () -> "bookIds did not match!");

	}

}
