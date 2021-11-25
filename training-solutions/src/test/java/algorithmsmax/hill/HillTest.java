package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void testHillMethodGetMax() {
        List<Integer> toTestList = Arrays.asList(5, 6, 2, 7, 9, 100);
        Hill hill  = new Hill();
        assertEquals(100, hill.getMax(toTestList));
    }

}