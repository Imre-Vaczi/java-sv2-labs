package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void testTemperatureGetMin() {
        List<Integer> toTestList = Arrays.asList(5, 6, 2, 7, 9, 100);
        Temperature temperature = new Temperature();

        assertEquals(2, temperature.getMin(toTestList));
    }
}