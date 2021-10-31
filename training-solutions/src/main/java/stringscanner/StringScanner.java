package stringscanner;
import java.util.Scanner;
public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Több tagmondatból álló, vesszővel ellátott mondat.");

        String message = scanner.nextLine();
        Scanner first = new Scanner(message);

        while (first.hasNext()){
            System.out.println(first.next());
        }

        System.out.println();
        Scanner second = new Scanner(message).useDelimiter(", ");
        while (second.hasNext()){
            System.out.println(second.next());
        }

    }
}
//“Ez egy olyan mondat, amely több tagmondatból áll, és ezért megfelel a feladatkiírásnak.”
