package com.twu.biblioteca.model.Book;

import com.twu.biblioteca.model.Author.Author;
import com.twu.biblioteca.model.MenuOption.MenuOption;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepository implements IBookRepository{

    private List<Book> books = new ArrayList<>();

    public BookRepository() {
        GenerateList();
    }

    @Override
    public List<Book> GetBooks() {
        return books;
    }

    @Override
    public boolean CheckoutBook(int bookId) {

        var checkoutBook = books.stream().filter(book -> book.getId() == bookId).findFirst().orElse(null);

        if(checkoutBook != null) {
            checkoutBook.Availability = false;
            return true;
        }

        return false;
    }

    @Override
    public boolean ReturnBook(int bookId) {
        var returnBook = books.stream().filter(book -> book.getId() == bookId).findFirst().orElse(null);

        if(returnBook != null) {
            returnBook.Availability = true;
            return true;
        }

        return false;
    }

    private List<Book> GenerateList() {
        List<Author> authors = new ArrayList<>();

        authors.add(new Author("Yuval Noah Harari"));
        books.add(new Book(1,"Sapiens: A Brief History of Humankind", authors, LocalDate.of( 2014 , Month.JANUARY , 1 )));

        authors.clear();

        authors.add(new Author("Lionel Shriver"));
        books.add(new Book(2,"We Need To Talk About Kevin", authors, LocalDate.of( 2003 , Month.APRIL , 1 )));

        authors.clear();

        authors.add(new Author("Trevor Noah"));
        books.add(new Book(3,"Born a Crime", authors, LocalDate.of( 2015 , Month.JULY , 1 )));

        return books;
    }
}
