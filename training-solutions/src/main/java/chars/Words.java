package chars;
import java.util.Scanner;
public class Words {
    public String pushWord(String word){
        String result = "";
        for (char c : word.toCharArray()){
            result += (char) (c +1);
        }
        return result;
    }

    public static void main(String[] args) {
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word, it will be shifted with 1 character: ");
        String input = scanner.nextLine();
        System.out.println(words.pushWord(input));
    }
}

