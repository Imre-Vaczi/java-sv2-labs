package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void testIsPrime() {
        List<String> wordList = Arrays.asList("Dr. Juhász Árpád", "Dr. Göncz Árpád", "Háy János");
        List<String> filteredWordList = new Prefix().getWordsStartWith(wordList, "Dr");

        assertEquals(2, filteredWordList.size());
        assertTrue(filteredWordList.contains("Dr. Juhász Árpád"));
        assertFalse(filteredWordList.contains("Háy János"));
    }

}