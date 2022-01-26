package lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    @Test
    void testChangeNumbersToRemainders() {
        Remainder remainder = new Remainder();
        List<Integer> result = remainder.changeNumbersToRemainders(Arrays.asList(45, 13, 64, 51, 92, 33), 3);
        assertEquals(Arrays.asList(0, 1, 1, 0, 2, 0), result);
    }

}