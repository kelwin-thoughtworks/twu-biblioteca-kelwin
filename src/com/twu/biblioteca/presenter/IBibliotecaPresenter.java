package com.twu.biblioteca.presenter;

import com.twu.biblioteca.model.Book.Book;
import com.twu.biblioteca.model.MenuOption.MenuOption;

import java.util.List;

public interface IBibliotecaPresenter {
    String GetWelcomeMessage();
    List<MenuOption> GetMenuOptions();
    String CheckIfOptionIsValid(int option);
    List<Book> GetBooks();
}
