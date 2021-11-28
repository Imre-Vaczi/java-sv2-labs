package methodpass.window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowTest {

    @Test
    void testGenerating() {
        Window window = new Window("aaa", 100, 140);
        assertEquals("aaa", window.getRoomName());
        assertEquals(100, window.getWidth());
        assertEquals(140, window.getHeight());
    }
}