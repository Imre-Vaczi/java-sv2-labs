package genericsusage.withoutgenerics;

import java.util.List;

public class Library {


    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("Library is null, there is no first book.");
        }
        if (books.get(0).equals(null)) {
            throw new NullPointerException("Library is null, there is no first book.");
        }
        if (books.size() == 0) {
            throw new IllegalArgumentException("Library is empty, there is no first book.");
        }
        Object firstItem = books.get(0);
        if (firstItem instanceof Book) {
            return (Book) firstItem;
        } else {
            throw new ClassCastException("First item is not a book.");
        }
    }
}
