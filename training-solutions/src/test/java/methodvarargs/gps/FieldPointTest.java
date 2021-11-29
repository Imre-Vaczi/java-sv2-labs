package methodvarargs.gps;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    @Test
    void testGenerating() {
        LocalDateTime forTestingSetting = LocalDateTime.now();
        FieldPoint fieldPoint = new FieldPoint(forTestingSetting,20.00, 10.00);

        assertEquals(20.00, fieldPoint.getLatitude());
        assertEquals(10.00, fieldPoint.getLongitude());
        assertEquals(forTestingSetting, fieldPoint.getTimeOfSetting());

        LocalDateTime forTestingLogging = LocalDateTime.now();
        fieldPoint.setTimeOfLogging(forTestingLogging);

        assertEquals(forTestingLogging, fieldPoint.getTimeOfLogging());

    }
}