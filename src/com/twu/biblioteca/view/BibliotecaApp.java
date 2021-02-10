package com.twu.biblioteca.view;

import com.twu.biblioteca.presenter.BibliotecaPresenter;
import com.twu.biblioteca.presenter.IBibliotecaPresenter;

import java.util.Scanner;

public class BibliotecaApp {

    public static IBibliotecaPresenter bibliotecaPresenter = new BibliotecaPresenter();
    public static Scanner readInput = new Scanner(System.in);

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

        printEmptyLine();
        System.out.println("Menu");
        printEmptyLine();

        for (var menuOption: menuOptions) {
            System.out.println(menuOption.getId() + " - " + menuOption.getDescription());
        }

        enterMenuOption();
    }

    static void enterMenuOption() {
        printEmptyLine();

        System.out.println("Select an Option");

        int selectedOption = readInput.nextInt();

        String checkIfOptionIsValid = bibliotecaPresenter.CheckIfOptionIsValid(selectedOption);

        if(checkIfOptionIsValid != null)  {
            System.out.println(checkIfOptionIsValid);
        }

        selectMenuOption(MenuOptionEnum.values()[selectedOption - 1]);

    }

    static void selectMenuOption(MenuOptionEnum menuOption) {

        switch (menuOption) {
            case SHOW_BOOKS:
                showBooks();
                break;
            case CHECKOUT_BOOK:
                checkoutBook();
                break;
            case RETURN_BOOK:
                returnBook();
                break;
            default:
        }
    }

    static void showBooks() {

        printEmptyLine();
        var books = bibliotecaPresenter.GetBooks();

        printEmptyLine();
        for (var book: books) {
            System.out.println(book.getId() + " - " +
                    book.getName() + " - " +
                    book.getAuthors().stream().findFirst().get().getName() + " - " +
                    book.getReleaseDate());
        }

        showMenuOptions();
    }

    static void checkoutBook() {

        System.out.println("Enter Book Id");
        int bookId = readInput.nextInt();

        var message = bibliotecaPresenter.CheckoutBook(bookId);

        System.out.println(message);

        showMenuOptions();
    }

    static void returnBook() {

        System.out.println("Enter Book Id");
        int bookId = readInput.nextInt();

        var message = bibliotecaPresenter.ReturnBook(bookId);

        System.out.println(message);

        showMenuOptions();
    }

    static void printEmptyLine() {
        System.out.println();
    }

    static void clearScreen() {

    }

    enum MenuOptionEnum {
        SHOW_BOOKS,
        CHECKOUT_BOOK,
        RETURN_BOOK
    }


}
