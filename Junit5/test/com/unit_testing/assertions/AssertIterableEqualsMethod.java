package com.unit_testing.assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.testing.modelclass.Book;
import com.testing.service.BookService;

public class AssertIterableEqualsMethod {

	@Test
	void assertIterableEqualsWithNoMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");
		Book javaBook3 = new Book("3", "Java Book 3", "Goku");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);
		bookService.addBook(javaBook3);

		List<String> actualTitles = bookService.getBookTitlesByPublisher("Goku");

		List<String> expectedTitles = new ArrayList<>();
		expectedTitles.add("Java Book");
		expectedTitles.add("Java Book 3");

		assertIterableEquals(expectedTitles, actualTitles);

	}

	@Test
	void assertIterableEqualsWithMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");
		Book javaBook3 = new Book("3", "Java Book 3", "Goku");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);
		bookService.addBook(javaBook3);

		List<String> actualTitles = bookService.getBookTitlesByPublisher("Goku");

		List<String> expectedTitles = new ArrayList<>();
		expectedTitles.add("Java Book");
		expectedTitles.add("Java Book 3");
		expectedTitles.add("Java Book 2");

		assertIterableEquals(expectedTitles, actualTitles, "book titles didn't match");

	}

	@Test
	void assertIterableEqualsWithMessageSupplier() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");
		Book javaBook3 = new Book("3", "Java Book 3", "Goku");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);
		bookService.addBook(javaBook3);

		List<String> actualTitles = bookService.getBookTitlesByPublisher("Goku");

		List<String> expectedTitles = new ArrayList<>();
		expectedTitles.add("Java Book");
		expectedTitles.add("Java Book 3");

		// benifit of using functional interface is that the string is evaluated only if the test case is failed.
		assertIterableEquals(expectedTitles, actualTitles, () -> "book titles didn't match");

	}

}
