package statements;
import java.util.Scanner;
public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide a number to find out if it is divisible with 3: ");
        int testNumber = scanner.nextInt();

        boolean result = testNumber % 3 == 0;

        System.out.println("Is " + testNumber + " divisible with 3: " + result);

    }
}
