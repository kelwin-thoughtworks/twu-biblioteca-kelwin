package com.twu.biblioteca.model.Book;

import com.twu.biblioteca.model.Author.Author;
import com.twu.biblioteca.model.MenuOption.MenuOption;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookRepository implements IBookRepository{

    private List<Book> books = new ArrayList<>();

    public BookRepository() {
        generateList();
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    private List<Book> generateList() {
        List<Author> authors = new ArrayList<>();

        authors.add(new Author("Yuval Noah Harari"));
        books.add(new Book("Sapiens: A Brief History of Humankind", authors, LocalDate.of( 2014 , Month.JANUARY , 1 )));

        authors.clear();

        authors.add(new Author("Lionel Shriver"));
        books.add(new Book("We Need To Talk About Kevin", authors, LocalDate.of( 2003 , Month.APRIL , 1 )));

        authors.clear();

        authors.add(new Author("Trevor Noah"));
        books.add(new Book("Born a Crime", authors, LocalDate.of( 2015 , Month.JULY , 1 )));

        return books;
    }
}
