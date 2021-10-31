package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word);
        String revWord = stringBuilder.reverse().toString();
        return revWord.equalsIgnoreCase(word);
    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.isPalindrome("búb"));
        System.out.println(palindromeValidator.isPalindrome("búB"));
        System.out.println(palindromeValidator.isPalindrome("búbos"));


    }
}
