package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ObjectsMain {
    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());
        Book emptyBook = new Book();
        System.out.println(emptyBook);
        emptyBook = null;
        System.out.println(emptyBook);
        if (emptyBook == null){
            System.out.println("emptyBook is null");
        }
        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);
        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);

        Book[] bookTomb = {new Book(), new Book(), new Book()};
        List<Book> bookListA = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> bookListB = new ArrayList<>();
        bookListB.add(new Book());
        bookListB.add(new Book());
        bookListB.add(new Book());
        System.out.println(Arrays.toString(bookTomb));
        System.out.println(bookListA);
        System.out.println(bookListB);
    }
}
