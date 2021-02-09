package com.twu.biblioteca.view;

import com.twu.biblioteca.presenter.BibliotecaPresenter;
import com.twu.biblioteca.presenter.IBibliotecaPresenter;

import java.util.Scanner;

public class BibliotecaApp {

    public static IBibliotecaPresenter bibliotecaPresenter = new BibliotecaPresenter();

    public static void main(String[] args) {
        startApp();
    }

    static void startApp() {
        showWelcomeMessage();

        showMenuOptions();
    }

    static void showWelcomeMessage() {
        System.out.println(bibliotecaPresenter.GetWelcomeMessage());
    }

    static void showMenuOptions() {
        var menuOptions = bibliotecaPresenter.GetMenuOptions();

        for (var menuOption: menuOptions) {
           System.out.println(menuOption.getId() + " - " + menuOption.getDescription());
        }
    }

}
