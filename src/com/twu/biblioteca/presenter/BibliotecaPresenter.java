package com.twu.biblioteca.presenter;

import com.twu.biblioteca.model.MenuOption.IMenuOptionRepository;
import com.twu.biblioteca.model.MenuOption.MenuOption;
import com.twu.biblioteca.model.MenuOption.MenuOptionRepository;

import java.util.List;

public class BibliotecaPresenter implements IBibliotecaPresenter {

    IMenuOptionRepository menuOptionRepository = new MenuOptionRepository();

    @Override
    public String GetWelcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    @Override
    public List<MenuOption> GetMenuOptions() {
        return menuOptionRepository.getMenuOptions();
    }
}

