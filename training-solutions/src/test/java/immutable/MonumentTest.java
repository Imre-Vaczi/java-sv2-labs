package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    @Test
    void testGenerating() {
        Monument monument = new Monument("aaa", "bbb 23.", "ID001", LocalDate.now());
        assertEquals("aaa", monument.getName());
        assertEquals("bbb 23.", monument.getAddress());
        assertEquals("ID001", monument.getLogID());
        assertEquals("ID001", monument.getLogID());
        assertEquals(LocalDate.now(), monument.getLogDate());
    }

    @Test
    void testNameNull() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Monument(null, "bbb 23.", "ID001", LocalDate.of(2020,2,20)));
        assertEquals("Invalid input: name, address, logID", iae.getMessage());
    }
    @Test
    void testNameEmpty() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("", "bbb 23.", "ID001", LocalDate.of(2020,2,20)));
        assertEquals("Invalid input: name, address, logID", iae.getMessage());
    }
    @Test
    void testAddressNull() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("aaa", null, "ID001", LocalDate.of(2020,2,20)));
        assertEquals("Invalid input: name, address, logID", iae.getMessage());
    }

    @Test
    void testAddressEmpty() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("aaa", "", "ID001", LocalDate.of(2020,2,20)));
        assertEquals("Invalid input: name, address, logID", iae.getMessage());
    }

    @Test
    void testLogIDNull() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("aaa", "bbb 23.", null, LocalDate.of(2020,2,20)));
        assertEquals("Invalid input: name, address, logID", iae.getMessage());
    }

    @Test
    void testLogIDEmpty() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("aaa", "bbb 23.", "", LocalDate.of(2020,2,20)));
        assertEquals("Invalid input: name, address, logID", iae.getMessage());
    }



}