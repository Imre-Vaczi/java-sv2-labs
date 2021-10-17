package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the product: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the product: ");
        int price = scanner.nextInt();

        Product product = new Product(name, price);

        System.out.println("Product: " + product.getName());
        System.out.println("Actual price: " + product.getPrice());

        System.out.println("Enter price increment: ");
        product.increasePrice(scanner.nextInt());
        System.out.println("Actual price: " + product.getPrice());

        System.out.println("Enter price decrement: ");
        product.decreasePrice(scanner.nextInt());
        System.out.println("Actual price: " + product.getPrice());
    }
}
