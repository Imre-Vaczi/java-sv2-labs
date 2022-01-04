package genericsusage.withgenerics;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        List<Book> copiedBooks = new ArrayList<>();
        if (books.size() == 0) {
            return copiedBooks;
        } else {
            for (Book book : books) {
                copiedBooks.add(new Book(book));
            }
        }
        return copiedBooks;
    }

    public Book getFirstBook() {
        if (books == null) {
            throw new NullPointerException("Library is null, nothing to return!");
        }
        if (books.size() == 0) {
            throw new IllegalArgumentException("Library is empty, nothing to return!");
        }
        return this.books.get(0);
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book can not be null!");
        }
        books.add(book);
    }
}
