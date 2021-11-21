package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words = new Words();

    @Test
    void testOkCase() {
        String toTest = words.getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", toTest);
    }

    @Test
    void testMissingCase() {
        String toTest = words.getFirstWordWithA(Paths.get("src/test/resources/wordsNoA.txt"));
        assertEquals("A", toTest);
    }

    @Test
    void testFileIssueCase() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(Paths.get("src/test/resources/wordsUnknown.txt")));
        assertEquals("Error occurred during reading.", exception.getMessage());
    }

}