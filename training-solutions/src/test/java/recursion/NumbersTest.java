package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetSum() {
        Numbers numbers = new Numbers();
        int[] listForSumming = new int[]{10,20,30,40};
        int[] emptyListForSumming = new int[]{};

        assertEquals(100, numbers.getSum(listForSumming));
        assertEquals(0, numbers.getSum(emptyListForSumming));
    }

}