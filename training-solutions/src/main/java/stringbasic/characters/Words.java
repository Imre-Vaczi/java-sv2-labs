package stringbasic.characters;
import java.util.Scanner;
public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word to be spelled: ");
        String word = scanner.nextLine();
        String input = "";
        System.out.println("Time to spell the word "+ word);
        for (int i = 0; i < word.length(); i++){
            System.out.println("Type letter number " + (i+1) );
            String temp = scanner.nextLine();
            input += temp;
            System.out.println("You typed the letter " + temp);
        }
        System.out.println("You spelled the word: " + input);
        if (word.equals(input)){
            System.out.println("You are correct");
        }else{
            System.out.println("Room for improvement, you will get it next time!");
        }

    }
}
