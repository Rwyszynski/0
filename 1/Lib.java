import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

public class Lib {
    public static void main(String[] args) {
        Book book1 = new Book("To", "S.King", 1980);
        Book book2 = new Book("Gra o tron", "R.R.Martin", 2000);
        Book book3 = new Book("Michnikowczyzna", "Ziemkiewicz", 2001);
        Book book4 = new Book("Dobry zły liberalizm", "Michalkiewicz", 2010);
        Book book5 = new Book("Archipelag Gułag", "Sołżenicyn", 1950);

        Stack<Book> newStack = new Stack();
        newStack.push(book1);
        newStack.push(book2);
        newStack.push(book3);
        newStack.push(book4);
        newStack.push(book5);

        System.out.println(newStack.size());

        Book deleted;
        deleted = newStack.pop();
        deleted = newStack.pop();
        deleted = newStack.pop();
        deleted = newStack.pop();
        deleted = newStack.pop();

        System.out.println(newStack.size());
        System.out.println(deleted);
    }
}

class Book {

    String title;
    String author;
    int year;

    // constructor with arguments
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // toString method used for printout the object
    @Override
    public String toString() {
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}