package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean indicator = true;
        while (indicator) {
            System.out.println("Enter a number:");
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input % 2 == 0) {
                    indicator = false;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw new IllegalArgumentException("The provided input is not a number", numberFormatException);
            }
            finally {
                System.out.println("End of round.");
            }
        }
    }
}
