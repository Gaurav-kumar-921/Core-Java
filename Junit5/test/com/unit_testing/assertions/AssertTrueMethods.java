package com.unit_testing.assertions;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.testing.modelclass.Book;
import com.testing.service.BookService;

public class AssertTrueMethods {

	@Test
	void assertTrueWithNoMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");

		bookService.addBook(javaBook);

		List<Book> listOfBooks = bookService.books();

		assertTrue(listOfBooks.isEmpty());

	}

	@Test
	void assertTrueWithMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");

		bookService.addBook(javaBook);

		List<Book> listOfBooks = bookService.books();

		assertTrue(listOfBooks.isEmpty(), "The List of books is not empty ");

	}

	@Test
	void assertTrueWithMessageSupplier() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");

		bookService.addBook(javaBook);

		List<Book> listOfBooks = bookService.books();

		assertTrue(listOfBooks.isEmpty(), () -> "The List of books is not empty ");

	}

	@Test
	void assertTrueWithBooleanSupplierAndNoMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");

		bookService.addBook(javaBook);

		List<Book> listOfBooks = bookService.books();

		assertTrue(() -> listOfBooks.isEmpty());

	}

}
