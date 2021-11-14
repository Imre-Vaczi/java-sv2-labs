package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Első szám az elapművelethez");
        int firstNumber = scanner.nextInt();
        System.out.println("Második szám az elapművelethez");
        int secNumber = scanner.nextInt();
        System.out.println("Válasszon az alábbi lehetőségek közül:\n" +
                "összeadás 1.\n" +
                "kivonás 2.\n" +
                "szorzás 3.\n" +
                "osztás 4.");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println(firstNumber + secNumber);
                break;
            case 2:
                System.out.println(firstNumber - secNumber);
                break;
            case 3:
                System.out.println(firstNumber * secNumber);
                break;
            case 4:
                try {
                    System.out.println(firstNumber / secNumber);
                    break;
                } catch (ArithmeticException exception) {
                    System.out.println("Nullával való osztás nem értelmezett.");
                    System.out.println(exception.getMessage());
                    exception.getStackTrace();
                }
        }
    }
}
