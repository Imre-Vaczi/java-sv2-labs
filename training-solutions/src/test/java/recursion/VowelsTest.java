package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void testGetNumberOfVowels() {
        Vowels vowels = new Vowels();

        assertEquals(0, vowels.getNumberOfVowels(""));
        assertEquals(0, vowels.getNumberOfVowels("lvl"));
        assertEquals(4, vowels.getNumberOfVowels("barackosban"));
        assertEquals(2, vowels.getNumberOfVowels("Alma"));
    }

}