package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDigitEvensTest {

    @Test
    void testTwoDigitEvensMethod() {
        TwoDigitEvens twoDigitEvens = new TwoDigitEvens();
        int toTest = twoDigitEvens.getSum();
        assertEquals(1980, toTest);
    }
}