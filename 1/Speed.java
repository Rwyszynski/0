import java.util.*;
import java.io.*;
import java.lang.*;

public class Speed {
    public static void main(String[] args) {
        Random randomGen = new Random();

        List<Book> listOfBook = new LinkedList<>();
        Book lastBook = null;

        for (int i = 0; i < 500000; i++) {
            String aut = "a".repeat(randomGen.nextInt(10));
            String tit = "a".repeat(randomGen.nextInt(10));
            lastBook = new Book(aut, tit);
            listOfBook.add(lastBook);
        }
        Book firstBook = listOfBook.get(0);
        // Odejmowanie
        long startFirst = System.nanoTime();
        listOfBook.remove(firstBook);
        long stopFirst = System.nanoTime();
        System.out.println(stopFirst - startFirst);

        long startLast = System.nanoTime();
        listOfBook.remove(lastBook);
        long stopLast = System.nanoTime();
        System.out.println(stopLast - startLast);
        System.out.println(listOfBook.size());

        // Dodawanie
        long startFirst1 = System.nanoTime();
        listOfBook.add(firstBook);
        long stopFirst1 = System.nanoTime();
        System.out.println(stopFirst1 - startFirst1);

        long startLast1 = System.nanoTime();
        int last = (listOfBook.size() - 1);
        listOfBook.add(lastBook);
        long stopLast1 = System.nanoTime();
        System.out.println(stopLast1 - startLast1);
        System.out.println(listOfBook.size());

        // 2 Program
        Map<KeysForMap, Book> mapOfBook = new HashMap<>();
        for (int i = 0; i < 8000; i++) {
            String aut1 = "a".repeat(randomGen.nextInt(10));
            String tit1 = "b".repeat(randomGen.nextInt(10));

            int keyLength = randomGen.nextInt(10);
            String sign = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            String sum = "";
            for (int j = 0; j < keyLength; j++) {
                int index = randomGen.nextInt(sign.length());
                char randSign = sign.charAt(index);
                sum += randSign;

            }
            KeysForMap m = new KeysForMap(sum);
            Book n = new Book(aut1, tit1);

            mapOfBook.put(m, n);
        }
        System.out.println(mapOfBook.size());

    }
}

class Book {
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public boolean equals(Object o) {
        Book e = (Book) o;
        return this.author.equals(e.author) && this.title.equals(e.title);
    }

}

// Klucze do mapy
class KeysForMap {
    String key;

    public KeysForMap(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public boolean equals(Object o) {
        KeysForMap e = (KeysForMap) o;
        return this.key.equals(e.key);
    }

}