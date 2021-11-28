package methodpass.window;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void testRiseSize() {
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("aaa", 100, 110));
        windows.add(new Window("aaa", 100, 130));
        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windows, 20);

        assertEquals(130, windows.get(0).getHeight());
        assertEquals(150, windows.get(1).getHeight());


    }

}