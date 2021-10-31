package numbers;
import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 + 5 * 32 - 4 / 10 = x");
        double feedback = scanner.nextDouble();
        double result = 10 + 5 * 32 - 4 / (10*1.0);
        if (Math.abs(feedback - result) <= 0.0001){
            System.out.println("Helyes megoldás");
        }else{
            System.out.println("Helytelen megoldás");
        }
    }
}
