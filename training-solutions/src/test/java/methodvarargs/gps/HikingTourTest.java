package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    @Test
    void testLogFieldPointsValid() {
        HikingTour hikingTour = new HikingTour();
        LocalDateTime timeToTestSettingOne = LocalDateTime.now();
        LocalDateTime timeToTestSettingTwo = LocalDateTime.now();
        LocalDateTime timeToTestLogging = LocalDateTime.now();
        hikingTour.logFieldPoints(
                timeToTestLogging,
                new FieldPoint(timeToTestSettingOne, 20.0,10.0),
                new FieldPoint(timeToTestSettingTwo, 30.0, 20.0)
        );

        assertEquals(timeToTestLogging, hikingTour.getFieldPointList().get(0).getTimeOfLogging());
    }

    @Test
    void testLogFieldPointsInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new HikingTour().logFieldPoints(null, new FieldPoint(LocalDateTime.now(), 20, 20)));
        assertEquals("Time of logging can not be empty.", exception.getMessage());
    }

}