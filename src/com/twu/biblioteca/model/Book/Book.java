package com.twu.biblioteca.model.Book;

import com.twu.biblioteca.model.Author.Author;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Book {
    int Id;
    String Name;
    List<Author> Authors;
    LocalDate ReleaseDate;
    boolean Availability;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

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

    public boolean getAvailability() {
        return Availability;
    }

    public void setAvailability(boolean availability) {
        Availability = availability;
    }

    public Book(int id, String name, List<Author> authors, LocalDate releaseDate) {
        Id = id;
        Name = name;
        Authors = authors;
        ReleaseDate = releaseDate;
        Availability = true;
    }
}
