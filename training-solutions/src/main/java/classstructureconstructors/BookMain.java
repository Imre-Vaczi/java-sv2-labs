package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author: ");
        String author = scanner.nextLine();
        System.out.println("Enter the title: ");
        String title = scanner.nextLine();
        System.out.println("Enter the regNumber");
        String regNumber = scanner.nextLine();

        Book book = new Book(author, title);
        book.register(regNumber);

        System.out.println("author: " + book.getAuthor());
        System.out.println("title: " + book.getTitle());
        System.out.println("registration number: " + book.getRegNumber());


    }
}
