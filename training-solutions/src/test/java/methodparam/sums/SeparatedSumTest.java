package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void testSum() {
        SeparatedSum separatedSum = new SeparatedSum();
        String floatingNumbers = separatedSum.readFile("src/test/resources/floatingnumbers.txt");
        Results results = separatedSum.sum(floatingNumbers);

        assertEquals(110.6, results.getSumOfPos());
        assertEquals(-153.3,results.getSumOfNeg(), 0.00000005);
    }

}