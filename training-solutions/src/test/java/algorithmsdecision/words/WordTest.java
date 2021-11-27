package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testContainsLongerWord() {
        List<String> toTestList = Arrays.asList("alma", "patak", "pata", "bodza", "kavics", "tó", "lexikonok");
        Word word = new Word();

        assertEquals(true, word.containsLongerWord(toTestList,"aaaaaa"));
        assertEquals(false, word.containsLongerWord(toTestList,"aaaaaaaaaaaa"));
        assertEquals(true, word.containsLongerWord(toTestList,""));
    }

}