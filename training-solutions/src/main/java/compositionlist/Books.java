package compositionlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Books {
    private ArrayList<String> titles = new ArrayList<>();

    public void addBook(String title){
        this.titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author){
        if (this.titles.contains(title)){
            int index = this.titles.indexOf(title);
            this.titles.set(index,author + ": " + this.titles.get(index));
        }
    }

    public ArrayList<String> getTitles() {
        return titles;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books();

        System.out.println("How many titles do you want to keep? ");
        int titleNumber = scanner.nextInt();
        scanner.nextLine();

        for (int iter = 0; iter < titleNumber; iter++){
            System.out.println("Provide title number "+ (iter+1));
            books.addBook(scanner.nextLine());
        }
        System.out.println(books.getTitles());
        books.findBookAndSetAuthor("Egri csillagok", "Gárdonyi Géza");
        System.out.println(books.getTitles());
    }
}
