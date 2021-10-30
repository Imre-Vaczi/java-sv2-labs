package chars;

import java.util.Scanner;

public class Whitespace {
    public String makeWhitespaceToStar(String text){
        String result = "";
        for (char c: text.toCharArray()){
            if (Character.isWhitespace(c)){
                result += "*";
            }else {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Changing whitespace to * character");
        System.out.println(whitespace.makeWhitespaceToStar(scanner.nextLine()));
    }
}
