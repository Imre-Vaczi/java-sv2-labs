package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books
                .stream()
                .filter((Book book) -> book.getPages() < maxNumberOfPages)
                .map((Book book) -> book.getTitle())
                .collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books
                .stream()
                .filter((Book book) -> book.getAuthor().equals(author))
                .map((Book book) -> book.getTitle())
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> listAuthors() {
        return books
                .stream()
                .map((Book book) -> book.getAuthor())
                .distinct()
                .collect(Collectors.toList());
    }
}
