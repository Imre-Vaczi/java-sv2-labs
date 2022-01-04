package genericsusage.withgenerics;

public class Book {

    private String title;

    public Book(String title) {
        if ("".equals(title)) {
            throw new IllegalArgumentException("Book title can not be empty!");
        }
        this.title = title;
    }

    public Book(Book book) {
        this.title = book.title;
    }

    public String getTitle() {
        return title;
    }
}
