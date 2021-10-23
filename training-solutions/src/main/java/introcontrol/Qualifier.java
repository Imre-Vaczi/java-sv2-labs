package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (number <= 100){
            System.out.println("Száz, vagy kisebb");
        } else {
            System.out.println("Nagyobb, mint száz");
        }
    }
}
