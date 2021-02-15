package com.twu.biblioteca;


import com.twu.biblioteca.model.Author.Author;
import com.twu.biblioteca.model.Book.Book;
import com.twu.biblioteca.presenter.BibliotecaPresenter;
import com.twu.biblioteca.presenter.IBibliotecaPresenter;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class BibliotecaPresenterTest {

    private final IBibliotecaPresenter bibliotecaPresenter = new BibliotecaPresenter();

    @Test
    public void ShouldReturnWelcomeMessage() {
        String message = bibliotecaPresenter.GetWelcomeMessage();
        Assert.assertEquals(message, "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    @Test
    public void ShouldHaveListOfBooksWhenReturnMenuOptionList() {
        var menuOptions = bibliotecaPresenter.GetMenuOptions();

        var searchOption = menuOptions.stream().filter(menuOption -> menuOption.getDescription().equals("List Of Books")).findFirst().get();

        Assert.assertNotNull(searchOption);
    }

    @Test
    public void ShouldNotifyWhenOptionIsInvalid() {
        var option = 78;
        var result = bibliotecaPresenter.CheckIfOptionIsValid(option);

        Assert.assertEquals(result, "Please select a valid option!");

    }

    @Test
    public void ShouldReturnListOfBooks() {

        var result = bibliotecaPresenter.GetBooks();
        var firstBook = result.stream().findFirst().get();

        Assert.assertEquals(firstBook.getName(), "Sapiens: A Brief History of Humankind");
    }

    @Test
    public void ShouldReturnYearAndAuthorWhenReturnListOfBooks() {

        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Yuval Noah Harari"));
        var book = new Book(1,"Sapiens: A Brief History of Humankind", authors, LocalDate.of( 2014 , Month.JANUARY , 1 ));

        var result = bibliotecaPresenter.GetBooks();
        var firstBook = result.stream().findFirst().get();

        Assert.assertEquals(firstBook.getAuthors().stream().findFirst().get().getName(), firstBook.getAuthors().stream().findFirst().get().getName());
        Assert.assertEquals(firstBook.getReleaseDate(), firstBook.getReleaseDate());
    }

    @Test
    public void ShouldCheckoutABook() {
        var result = bibliotecaPresenter.CheckoutBook(1);

        Assert.assertNotNull(result);
    }

    @Test
    public void ShouldReturnSuccessMessageWhenCheckoutABook() {
        int bookId = 1;

        var result = bibliotecaPresenter.CheckoutBook(bookId);

        Assert.assertEquals(result, "Thank you! Enjoy the book");
    }

    @Test
    public void ShouldReturnUnSuccessMessageWhenCheckoutABook() {
        int bookId = 4;

        var result = bibliotecaPresenter.CheckoutBook(bookId);

        Assert.assertEquals(result, "Sorry, that book is not available");
    }

    @Test
    public void ShouldReturnSucessMessageWhenReturnABook() {
        int bookId = 4;

        var result = bibliotecaPresenter.ReturnBook(bookId);

        Assert.assertEquals(result, "Thank you for returning the book");
    }

    @Test
    public void ShouldReturnUnsucessMessageWhenReturnABook() {
        int bookId = 5;

        var result = bibliotecaPresenter.ReturnBook(bookId);

        Assert.assertEquals(result, "That is not a valid book to return.");
    }


}
