package com.company.lesson2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Beyaz geceler", "Hesen Gonag", "Gh5", Status.AVAILABLE);
        book.borrowBook();
        System.out.println(book);
    }
}
