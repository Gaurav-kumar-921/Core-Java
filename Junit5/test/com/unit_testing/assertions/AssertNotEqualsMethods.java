package com.unit_testing.assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.testing.modelclass.Book;
import com.testing.service.BookService;

public class AssertNotEqualsMethods {
	
	@Test
	void assertNotEqualsWithNoMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);

		Book actualBook = bookService.getBookById("2");

		assertNotEquals("2", actualBook.getBookId());
		assertNotEquals("Java Book 2", actualBook.getTitle());

	}

	@Test
	void assertNotEqualsWithMessage() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);

		Book actualBook = bookService.getBookById("2");

		assertNotEquals("1", actualBook.getBookId(), "Id is not matching");
		assertNotEquals("Java Book", actualBook.getTitle(), "Title is not matching");

	}

	@Test
	void assertNotEqualsWithMessageSupplier() {

		BookService bookService = new BookService();

		Book javaBook = new Book("1", "Java Book", "Goku");
		Book javaBook2 = new Book("2", "Java Book 2", "Goku 2");

		bookService.addBook(javaBook);
		bookService.addBook(javaBook2);

		Book actualBook = bookService.getBookById("1");

		assertNotEquals("1", actualBook.getBookId(), "Id was matching");
		assertNotEquals("Java Book", actualBook.getTitle(), () -> "Title was matching");

	}

}
