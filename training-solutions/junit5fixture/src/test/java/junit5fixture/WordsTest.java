package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words = new Words();

    @BeforeEach
    void fillList(){
        words.addWord("bot");
        words.addWord("botox");
        words.addWord("botos");
        words.addWord("tobozok");
    }
    @Test
    void testGetWordsStartWith(){
        List<String> expectedWords = Arrays.asList("botox", "botos");
        words.getWordsStartWith("boto");
        assertEquals(expectedWords, words.getWords());
    }
    @Test
    void testGetWordsWithLength(){
        List<String> expectedWords = Arrays.asList("botox", "botos");
        words.getWordsWithLength(5);
        assertEquals(expectedWords, words.getWords());
    }

}