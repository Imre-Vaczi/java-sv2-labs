package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {
    Day day;
    @BeforeEach
    void buildObjects(){
        day = new Day();
        day.addHour(new Hour(3));
        day.addHour(new Hour(13));
        day.addHour(new Hour(23));
    }
    @Test
    void testObjMethods(){

        day.setDayPeriod();

        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(1).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(2).getPeriod());
    }
}