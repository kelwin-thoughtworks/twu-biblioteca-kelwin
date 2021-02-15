package com.twu.biblioteca;

import com.twu.biblioteca.model.Book.BookRepository;
import com.twu.biblioteca.model.Book.IBookRepository;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class BookRepositoryTest {

    IBookRepository bookRepository = new BookRepository();

    @Test
    public void ShouldReturnListOfBooks() {

        var result = bookRepository.GetBooks();
        var firstBook = result.stream().findFirst().get();

        Assert.assertEquals(firstBook.getName(), "Sapiens: A Brief History of Humankind");
    }

    @Test
    public void ShouldCheckoutABook() {
        var result = bookRepository.CheckoutBook(1);

        Assert.assertTrue(result);
    }

    @Test
    public void ShouldReturnABook() {
        int bookId = 4;
        var result = bookRepository.ReturnBook(bookId);

        Assert.assertTrue(result);
    }
}
