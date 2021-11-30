package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    Time baseTime = new Time(LocalTime.now());

    @Test
    void testIsEqualTime() {
        assertFalse(baseTime.isEqual(new Time(LocalTime.now())));
    }

    @Test
    void testIsEqualDetails() {
        assertFalse(baseTime.isEqual(new Time(LocalTime.of(0,0,0))));
    }

    @Test
    void testIsEarlierTime() {
        assertFalse(baseTime.isEarlier(new Time(LocalTime.of(0,0,0))));
    }

    @Test
    void testIsEarlierDetails() {
        assertFalse(baseTime.isEarlier(0,0,0));
    }

}