package com.twu.biblioteca.model.Book;

import java.util.List;

public interface IBookRepository {
    List<Book> GetBooks();
    boolean CheckoutBook(int bookId);
}
