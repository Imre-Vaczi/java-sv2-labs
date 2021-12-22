package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void testStandbyToHigh() {
        assertEquals(SeatHeaterState.HIGH, SeatHeaterState.STANDBY.next());
    }

    @Test
    void testHighToMedium() {
        assertEquals(SeatHeaterState.MEDIUM, SeatHeaterState.HIGH.next());
    }

    @Test
    void testMediumToLow() {
        assertEquals(SeatHeaterState.LOW, SeatHeaterState.MEDIUM.next());
    }

    @Test
    void testLowToStandby() {
        assertEquals(SeatHeaterState.STANDBY, SeatHeaterState.LOW.next());
    }

}