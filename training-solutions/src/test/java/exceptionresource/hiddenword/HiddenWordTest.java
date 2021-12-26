package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    @Test
    void testGetHiddenWord() {
        HiddenWord hiddenWord = new HiddenWord();
        Path path = Paths.get("src/test/resources/hiddenword.txt");
        String result = hiddenWord.getHiddenWord(path);

        assertEquals("ALMA KÖRTE", result);
    }

}