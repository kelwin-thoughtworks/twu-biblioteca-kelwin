package com.twu.biblioteca;

import com.twu.biblioteca.model.Author.Author;
import com.twu.biblioteca.model.Book.Book;
import com.twu.biblioteca.model.Book.BookRepository;
import com.twu.biblioteca.model.Book.IBookRepository;
import com.twu.biblioteca.model.MenuOption.IMenuOptionRepository;
import com.twu.biblioteca.model.MenuOption.MenuOptionRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class BookRepositoryTest {

    IBookRepository bookRepository = new BookRepository();

    @Test
    public void ShouldReturnListOfBooks() {

        var result = bookRepository.getBooks();
        var firstBook = result.stream().findFirst().get();

        Assert.assertEquals(firstBook.getName(), "Sapiens: A Brief History of Humankind");
    }
}
