package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void testModify() {
        ModifiedWord modifiedWord = new ModifiedWord();
        assertEquals("AxMy", modifiedWord.modify("alma"));
    }

}