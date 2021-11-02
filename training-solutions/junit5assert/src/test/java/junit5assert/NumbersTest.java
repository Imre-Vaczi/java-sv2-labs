package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {

    @Test
    void testGetEvenNumbers(){
        Numbers numbers = new Numbers();
        int[] arrayOne = new int[]{2, 8, 5, 6, 2, 3, 9};
        int[] arrayTwo = new int[]{2, 8, 5, 6, 2, 3, 9};
        assertArrayEquals(arrayOne, arrayTwo);
    }
}
