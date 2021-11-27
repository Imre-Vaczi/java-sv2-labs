package recursion;

public class Palindrome {
    public boolean isPalindrome(String word) {
        /*if (word.length() < 2) {
            return true;
        } else {
            String subString = word.substring(1, word.length()-1);
            boolean subTest = Character.toString(word.charAt(0)).equals(Character.toString(word.charAt(word.length()-1)));
            boolean result = subTest && (isPalindrome(subString));
            return result;
        }*/

        if (word.length() < 2) {
            return true;
        }
        if (Character.toString(word.charAt(0)).equals(Character.toString(word.charAt(word.length()-1)))) {
            String subString = word.substring(1, word.length()-1);
            boolean result = true && (isPalindrome(subString));
            return result;
        } else {
            return false;
        }
    }
}
