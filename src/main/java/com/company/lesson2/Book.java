package com.company.lesson2;

import java.util.Objects;

public class Book implements IBook {
    private String name;
    private String author;
    private String Isbn;
    private Status status;

    public Book(String name, String author, String isbn, Status status) {
        this.name = name;
        this.author = author;
        Isbn = isbn;
        this.status = status;
    }

    public Book() {
    }

    @Override
    public void borrowBook() {
        if (this.getStatus().equals(Status.AVAILABLE)) {
            this.setStatus(Status.BORROWED);
        } else
            throw new CustomException("Book already borrowed");
    }

    @Override
    public void returnBook() {
        this.setStatus(Status.AVAILABLE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", Isbn='" + Isbn + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(Isbn, book.Isbn) && status == book.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, Isbn, status);
    }
}
