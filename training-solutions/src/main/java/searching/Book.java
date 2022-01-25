package searching;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private int id;
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        if (this.author != o.author) {
            return this.author.compareTo(o.author);
        } else {
            return this.title.compareTo(o.title);
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
