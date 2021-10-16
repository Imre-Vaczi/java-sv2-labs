package classstructureio;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide an integer: ");
        int firstInt = scanner.nextInt();
        System.out.println("Please provide an other integer: ");
        int secInt = scanner.nextInt();
        int result = firstInt + secInt;
        System.out.println(firstInt + " + " + secInt);
        System.out.println("(" + result + ")");

    }
}
