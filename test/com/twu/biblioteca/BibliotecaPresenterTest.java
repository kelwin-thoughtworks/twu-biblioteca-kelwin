package com.twu.biblioteca;


import com.twu.biblioteca.presenter.BibliotecaPresenter;
import com.twu.biblioteca.presenter.IBibliotecaPresenter;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaPresenterTest {

    @Test
    public void ShouldReturnWelcomeMessage() {

        IBibliotecaPresenter bibliotecaPresenter = new BibliotecaPresenter();

        String message = bibliotecaPresenter.GetWelcomeMessage();

        Assert.assertEquals(message, "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

    }
}
