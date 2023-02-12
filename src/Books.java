import java.util.*;

public class Books {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("World");
        books.add("Love");
        books.add("Year");
        books.add("Flower");
        books.add("Sun");
        Collections.sort(books);
        System.out.println(books);
        Map<Integer, String> book = new HashMap<>();
        book.put(books.indexOf("World"), "World");
        book.put(books.indexOf("Love"), "Love");
        book.put(books.indexOf("Year"), "Love");
        book.put(books.indexOf("Flower"), "Flower");
        book.put(books.indexOf("Sun"), "Sun");
        System.out.println(book);
    }
}