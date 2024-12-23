package Assignment;

import java.util.*;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Mana Charitra", 1, "Kandukuri Veeresalingam");
        Book book2 = new Book("To Kill a Mockingbird", 2, "Harper Lee");
        Book book3 = new Book("Amuktamalyada", 3, "Sri Krishnadevaraya");

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        for(Book book : bookList) {
            System.out.println("Book Title: " + book.bookTitle + " Book ID: " + book.bookId + " Author: " + book.author);
        }
    }
}