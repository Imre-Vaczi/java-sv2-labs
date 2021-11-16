package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy minimum 5 betűs szót!");
        String input = scanner.nextLine();

        if (input.length() < 5) {
            throw new IllegalArgumentException("A megadott kifejezés hossza nem egyezik a kritériummal.");
        }
        if (input.length() > 5) {
            for (char s : input.toCharArray()) {
                if (!Character.isLetter(s)){
                    throw new IllegalArgumentException("A megadott kifejezés nem csak betűket tartalmaz.");
                }
            }
        }
        System.out.println(input);
    }
}
