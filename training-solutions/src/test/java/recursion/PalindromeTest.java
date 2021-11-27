package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("imi"));
        assertTrue(palindrome.isPalindrome("i"));
        assertTrue(palindrome.isPalindrome(""));
        assertFalse(palindrome.isPalindrome("imit"));
        assertFalse(palindrome.isPalindrome("asdfdsimit"));
    }

}