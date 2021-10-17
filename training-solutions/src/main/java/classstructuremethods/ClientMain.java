package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the client: ");
        client.setName(scanner.nextLine());
        System.out.println("Enter the address of the client: ");
        client.setAddress(scanner.nextLine());
        System.out.println("Enter the year of birth of the client: ");
        client.setYear(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Name: " + client.getName());
        System.out.println("Year of birth: " +client.getYear());
        System.out.println("Address: " + client.getAddress());

        System.out.println("Enter a new address: ");
        client.migrate(scanner.nextLine());
        System.out.println("New address: " + client.getAddress());


    }
}
