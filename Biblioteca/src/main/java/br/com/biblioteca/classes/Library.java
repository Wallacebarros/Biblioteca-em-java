package br.com.biblioteca.classes;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>(20);

    public boolean isVoid() {
        return books.isEmpty();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public int totalBooks() {
        return books.size();
    }

    public ArrayList<Book> findAllBooks() {
        ArrayList<Book> copyBooks = books;
        return copyBooks;
    }

    public void deletBook(Book book) {
        books.remove(book);
    }
}