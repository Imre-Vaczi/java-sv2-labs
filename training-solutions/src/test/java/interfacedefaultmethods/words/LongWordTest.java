package interfacedefaultmethods.words;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testReadFromFile() {
        Path path = Paths.get("src/test/resources/longword.txt");
        LongWord longWord = new LongWord(path);
        List<String> words = longWord.readFromFile(longWord.getPath());

        assertEquals(5, words.size());
    }

    @Test
    void testGetLongWord() {
        Path path = Paths.get("src/test/resources/longword.txt");
        LongWord longWord = new LongWord(path);
        List<String> words = longWord.readFromFile(longWord.getPath());

        assertEquals("LONGWORD", longWord.getLongWord());
    }

}