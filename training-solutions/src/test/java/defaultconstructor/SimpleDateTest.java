package defaultconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    @Test
    void testGenerating() {
        SimpleDate simpleDate = new SimpleDate();
        assertEquals(0,simpleDate.getYear());
        assertEquals(0,simpleDate.getMonth());
        assertEquals(0,simpleDate.getDay());
    }

    @Test
    void testSetDateInvalidYear() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new SimpleDate().setDate(1800,1,1));
        assertEquals("Date can not be set up due to inadequate components.", exception.getMessage());

    }

    @Test
    void testSetDateInvalidMonthLowerThreshold() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new SimpleDate().setDate(1990, 0, 1));
        assertEquals("Date can not be set up due to inadequate components.", exception.getMessage());
    }

    @Test
    void testSetDateInvalidMonthUpperThreshold() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new SimpleDate().setDate(1990, 13, 1));
        assertEquals("Date can not be set up due to inadequate components.", exception.getMessage());
    }

    @Test
    void testSetDateInvalidDayLowerThreshold() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new SimpleDate().setDate(1990, 1, 0));
        assertEquals("Date can not be set up due to inadequate components.", exception.getMessage());
    }

    @Test
    void testSetDateInvalidDayUpperThreshold() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new SimpleDate().setDate(1990, 1, 32));
        assertEquals("Date can not be set up due to inadequate components.", exception.getMessage());
    }

    @Test
    void testSetDateLeapIssue() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new SimpleDate().setDate(2021, 2, 29));
        assertEquals("Date can not be set up due to inadequate components.", exception.getMessage());
    }

    @Test
    void testSetDateLeapOK() {
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(2020,2,29);

        assertEquals(2020,simpleDate.getYear());
        assertEquals(2,simpleDate.getMonth());
        assertEquals(29,simpleDate.getDay());
    }
}