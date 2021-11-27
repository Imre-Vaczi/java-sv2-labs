package recursion;

import java.util.Arrays;
import java.util.List;

public class Vowels {
    public int getNumberOfVowels(String word) {
        List<Character> listOfVowels = Arrays.asList('a', 'e', 'i', 'o', 'u','A','E','I','O','U');

        if (word.length() == 0) {
            return 0;
        }

        if (listOfVowels.contains(word.charAt(0))) {
            return 1 + getNumberOfVowels(word.substring(1, word.length()));
        } else {
            return getNumberOfVowels(word.substring(1, word.length()));
        }
    }
}
