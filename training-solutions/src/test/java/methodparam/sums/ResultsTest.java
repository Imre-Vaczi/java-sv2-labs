package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultsTest {

    @Test
    void testGenerating() {
        Results results = new Results();
        results.setSumOfPos(10);
        results.setSumOfNeg(-20);

        assertEquals(10, results.getSumOfPos());
        assertEquals(-20, results.getSumOfNeg());
    }
}