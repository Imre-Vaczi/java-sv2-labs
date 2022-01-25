package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if ("".equals(author) || "".equals(title) || author == null || title == null) {
            throw new IllegalArgumentException("Author and/or title can not be empty.");
        }
        if (Collections.binarySearch(books, new Book(author, title)) < 0) {
            throw new IllegalArgumentException("Book can not be found.");
        }
        return books.get(Collections.binarySearch(books, new Book(author, title)));
    }
}
