package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.println("Adjon meg egy számot, majd külön sorban egy másikat a művelet elvégzéséhez!");
        try {
            x = Integer.parseInt(scanner.nextLine());
            y = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException exception){
            System.out.println("Nem megfelelő éréket adott meg, futtassa újra a kódot megfelelő inputtal.");
            System.out.println(exception.getMessage());
            exception.getStackTrace();
        }
        System.out.println("Válasszon az alábbi lehetőségek közül:\n" +
                "összeadás 1.\n" +
                "kivonás 2.\n" +
                "szorzás 3.\n" +
                "osztás 4.");

        try {
            int input = Integer.parseInt(scanner.nextLine());
            switch (input){
                case 1:
                    System.out.println(calculator.additionOperation(x, y));
                    break;
                case 2:
                    System.out.println(calculator.subtractionOperation(x, y));
                    break;
                case 3:
                    System.out.println(calculator.multiplicationOperation(x,y));
                    break;
                case 4:
                    System.out.println(calculator.divisionOperation(x,y));
                    break;
            }
        }
        catch (ArithmeticException exception){
            System.out.println("Nullával való osztás nem értelmezett.");
            System.out.println(exception.getMessage());
            exception.getStackTrace();
        }
    }
}
