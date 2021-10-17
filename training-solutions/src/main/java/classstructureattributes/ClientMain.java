package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        client.name = scanner.nextLine();
        System.out.println("Please enter the year of your birth: ");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your address: ");
        client.address = scanner.nextLine();

        System.out.println("Your name is " + client.name);
        System.out.println("You were born in " + client.year);
        System.out.println("Your address is " + client.address);

    }
}
