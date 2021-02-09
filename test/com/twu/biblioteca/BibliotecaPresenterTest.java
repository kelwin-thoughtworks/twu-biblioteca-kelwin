package com.twu.biblioteca;


import com.twu.biblioteca.presenter.BibliotecaPresenter;
import com.twu.biblioteca.presenter.IBibliotecaPresenter;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaPresenterTest {

    private final IBibliotecaPresenter bibliotecaPresenter = new BibliotecaPresenter();

    @Test
    public void ShouldReturnWelcomeMessage() {
        String message = bibliotecaPresenter.GetWelcomeMessage();
        Assert.assertEquals(message, "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    @Test
    public void ShouldReturnMenuOptions() {
        var menuOptions = bibliotecaPresenter.GetMenuOptions();

        Assert.assertNotNull(menuOptions);
    }
}
