package aslist;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class Favourites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favouriteThings = new ArrayList<>();
        for (int step = 0; step < 5; step++){
            System.out.println("Enter anything you like: ");
            favouriteThings.add(scanner.nextLine());
        }
        System.out.println("Size of your list: " + favouriteThings.size());
        System.out.println("Your favorite things: ");
        for (String item: favouriteThings){
            System.out.print(item + " ");
        }
    }
}
