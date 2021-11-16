package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gépelj be egy pozitív számot!");
        int input = scanner.nextInt();
        if (input < 0) {
            throw new IllegalArgumentException("Nem pozitív számot adtál meg.");
        }
    }
}
