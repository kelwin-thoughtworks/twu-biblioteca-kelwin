package com.twu.biblioteca.model.Book;

import com.twu.biblioteca.model.Author.Author;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Book {
    String Name;
    List<Author> Authors;
    LocalDate ReleaseDate;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Author> getAuthors() {
        return Authors;
    }

    public void setAuthors(List<Author> authors) {
        Authors = authors;
    }

    public LocalDate getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        ReleaseDate = releaseDate;
    }

    public Book(String name, List<Author> authors, LocalDate releaseDate) {
        Name = name;
        Authors = authors;
        ReleaseDate = releaseDate;
    }
}
