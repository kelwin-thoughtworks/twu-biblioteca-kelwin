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
    }

    static void showWelcomeMessage() {
        System.out.println(bibliotecaPresenter.GetWelcomeMessage());
    }

}
