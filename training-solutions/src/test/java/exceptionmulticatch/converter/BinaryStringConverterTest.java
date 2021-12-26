package exceptionmulticatch.converter;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringConverterTest {

    @Test
    void testBinaryStringToBooleanArrayValid() {
        BinaryStringConverter bsc = new BinaryStringConverter();
        String inputData = "0101";
        boolean[] expected = new boolean[]{false,true,false,true};

        assertArrayEquals(expected, bsc.binaryStringToBooleanArray(inputData));
    }

    @Test
    void testBooleanArrayToBinaryString() {
        BinaryStringConverter bsc = new BinaryStringConverter();
        String expected = "0101";
        boolean[] inputData = new boolean[]{false,true,false,true};

        assertEquals(expected, bsc.booleanArrayToBinaryString(inputData));
    }

    @Test
    void testBinaryStringToBooleanArrayInValidNullPointer() {
        BinaryStringConverter bsc = new BinaryStringConverter();
        String inputData = null;
        Exception exception = assertThrows(NullPointerException.class,
                ()-> bsc.binaryStringToBooleanArray(inputData));

        assertEquals("Can not be null", exception.getMessage());
    }

    @Test
    void testBinaryStringToBooleanArrayInValidCharacter() {
        BinaryStringConverter bsc = new BinaryStringConverter();
        String inputData = "012";
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> bsc.binaryStringToBooleanArray(inputData));

        assertEquals("Invalid character", exception.getMessage());
    }

    @Test
    void testBooleanArrayToBinaryStringInvalidEmpty() {
        BinaryStringConverter bsc = new BinaryStringConverter();
        boolean[] inputData = new boolean[]{};
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> bsc.booleanArrayToBinaryString(inputData));

        assertEquals("Empty array not allowed", exception.getMessage());
    }

    @Test
    void testBooleanArrayToBinaryStringInvalidNullPointer() {
        BinaryStringConverter bsc = new BinaryStringConverter();
        boolean[] inputData = null;
        Exception exception = assertThrows(NullPointerException.class,
                ()-> bsc.booleanArrayToBinaryString(inputData));

        assertEquals("Can not be null", exception.getMessage());
    }
}