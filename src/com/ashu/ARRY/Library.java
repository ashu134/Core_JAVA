package com.ashu.ARRY;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("Book1", "Author1", 2001));
        library.addBook(new Book("Book2", "Author2", 2002));
        library.addBook(new Book("Book3", "Author3", 2003));

        // Printing all books in the library
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }

        // Removing a book from the library
        Book bookToRemove = library.findBookByTitle("Book2");
        if (bookToRemove != null) {
            library.removeBook(bookToRemove);
            System.out.println("Removed book: " + bookToRemove);
        }

        // Printing all books in the library after removal
        System.out.println("\nBooks after removal:");
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }
    }
}

class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}
