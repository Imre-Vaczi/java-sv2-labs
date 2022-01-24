package genericsusage.withoutgenerics;

public class Book {

    private String title;

    public Book(String title) {
        if ("".equals(title)) {
            throw new IllegalArgumentException("Title can not be empty");
        }
        if (title == null) {
            throw new NullPointerException("Title can not be null");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
