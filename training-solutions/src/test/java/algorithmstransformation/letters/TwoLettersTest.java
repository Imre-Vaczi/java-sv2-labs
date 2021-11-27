package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void testGetFirstTwoLetters() {
        List<String> listOfStrings = Arrays.asList("kanál", "kapa", "katona", "karom", "kacsa");
        TwoLetters twoLetters = new TwoLetters();
        List<String> transformedStrings = twoLetters.getFirstTwoLetters(listOfStrings);

        assertEquals(2, transformedStrings.get(1).length());
        assertEquals("ka", transformedStrings.get(1));
    }

}