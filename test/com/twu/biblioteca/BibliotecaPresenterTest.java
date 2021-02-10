package com.twu.biblioteca;


import com.twu.biblioteca.presenter.BibliotecaPresenter;
import com.twu.biblioteca.presenter.IBibliotecaPresenter;
import org.junit.Assert;
import org.junit.Test;



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
}
