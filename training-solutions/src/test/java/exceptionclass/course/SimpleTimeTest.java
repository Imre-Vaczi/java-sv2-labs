package exceptionclass.course;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void testGeneratingValidNumbers() {
        SimpleTime sp = new SimpleTime(10,23);
        assertEquals(10, sp.getHour());
        assertEquals(23, sp.getMinute());
    }

    @Test
    void testGeneratingInValidNumbersHour() {
        Exception exception = assertThrows(InvalideTimeException.class,
                ()-> new SimpleTime(24,23));

        assertEquals("Hour is invalid (0-23)", exception.getMessage());
    }

    @Test
    void testToString() {
        SimpleTime sp = new SimpleTime(10,23);
        assertEquals("10:23", sp.toString());
    }

    @Test
    void testGeneratingInValidNumbersMinute() {
        Exception exception = assertThrows(InvalideTimeException.class,
                ()-> new SimpleTime(10,60));

        assertEquals("Minute is invalid (0-59)", exception.getMessage());
    }

    @Test
    void testGeneratingValidString() {
        SimpleTime sp = new SimpleTime("10:23");
        assertEquals(10, sp.getHour());
        assertEquals(23, sp.getMinute());
    }

    @Test
    void testGeneratingInValidStringCharIssue() {
        Exception exception = assertThrows(InvalideTimeException.class,
                ()-> new SimpleTime("1o:23"));

        assertEquals("Time is not hh:mm", exception.getMessage());
    }

    @Test
    void testGeneratingInValidStringSeparatorIssue() {
        Exception exception = assertThrows(InvalideTimeException.class,
                ()-> new SimpleTime("10;23"));

        assertEquals("Time is not hh:mm", exception.getMessage());
    }

    @Test
    void testGeneratingInValidStringLengthIssue() {
        Exception exception = assertThrows(InvalideTimeException.class,
                ()-> new SimpleTime("1:23"));

        assertEquals("Time is not hh:mm", exception.getMessage());
    }

    @Test
    void testGeneratingInValidStringNull() {
        Exception exception = assertThrows(InvalideTimeException.class,
                ()-> new SimpleTime(null));

        assertEquals("Time is null", exception.getMessage());
    }
}