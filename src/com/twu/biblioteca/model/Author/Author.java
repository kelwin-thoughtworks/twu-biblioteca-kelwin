package com.twu.biblioteca.model.Author;

public class Author {
    String Name;

    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    public Author(String name) {
        this.setName(name);
    }
}
