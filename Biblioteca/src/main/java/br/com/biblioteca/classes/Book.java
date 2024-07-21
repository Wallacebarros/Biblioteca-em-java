package br.com.biblioteca.classes;

public class Book {
    private String title, author;
    private int pages, pagesRead = 0;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int showReadProgres() {
        return pagesRead;
    }

    public void increment(int pages) {
        this.pagesRead = pages;
    }
}
