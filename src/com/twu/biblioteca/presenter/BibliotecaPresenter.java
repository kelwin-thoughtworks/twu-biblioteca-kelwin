package com.twu.biblioteca.presenter;

import com.twu.biblioteca.model.Book.Book;
import com.twu.biblioteca.model.Book.BookRepository;
import com.twu.biblioteca.model.Book.IBookRepository;
import com.twu.biblioteca.model.MenuOption.IMenuOptionRepository;
import com.twu.biblioteca.model.MenuOption.MenuOption;
import com.twu.biblioteca.model.MenuOption.MenuOptionRepository;

import java.util.List;
import java.util.stream.Collectors;

public class BibliotecaPresenter implements IBibliotecaPresenter {

    IMenuOptionRepository menuOptionRepository = new MenuOptionRepository();
    IBookRepository bookRepository = new BookRepository();

    @Override
    public String GetWelcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    @Override
    public List<MenuOption> GetMenuOptions() {
        return menuOptionRepository.GetMenuOptions();
    }

    @Override
    public String CheckIfOptionIsValid(int option) {
        var menuOptions = menuOptionRepository.GetMenuOptions();
        var searchOption = menuOptions.stream().filter(menuOption -> menuOption.getId() == option).findFirst().orElse(null);

        if(searchOption == null) {
            return "Please select a valid option!";
        }

        return null;
    }

    @Override
    public List<Book> GetBooks() {
        return bookRepository.GetBooks().stream().filter(book -> book.getAvailability() == true).collect(Collectors.toList());
    }

    @Override
    public boolean CheckoutBook(int bookId) {
        return bookRepository.CheckoutBook(bookId);
    }
}

