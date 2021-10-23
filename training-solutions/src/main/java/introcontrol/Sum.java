package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers and you get the sum of them: ");
        int result = 0;
        for (int i = 0; i < 5; i++){
            result = result + scanner.nextInt();
        }
        System.out.println(result);
    }
}
