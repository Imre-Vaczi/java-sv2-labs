package attributes.book;
public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Timequake");
        System.out.println(book.getTitle());
        book.setTitle("Bulresque");
        System.out.println(book.getTitle());
    }
}
