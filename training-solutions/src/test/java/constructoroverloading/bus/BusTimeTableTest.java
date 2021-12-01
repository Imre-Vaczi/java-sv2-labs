package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    @Test
    void testGetTimeTable() {
        List<SimpleTime> timeTable = Arrays.asList(new SimpleTime(8,0), new SimpleTime(8,30));
        BusTimeTable btsOne = new BusTimeTable(10,14,30);
        BusTimeTable btsTwo = new BusTimeTable(timeTable);

        assertEquals(10, btsOne.getTimeTable().size());
        assertEquals(2, btsTwo.getTimeTable().size());
    }

    @Test
    void getNextBus() {
        BusTimeTable busTimeTable = new BusTimeTable(10,14,30);
        SimpleTime actualTime = new SimpleTime(12,19);

        assertEquals("12h : 30m", busTimeTable.getNextBus(actualTime).toString());
    }

    @Test
    void getNextBusInvalid() {
        Exception exception = assertThrows(IllegalStateException.class,
                ()-> new BusTimeTable(10,14,30).getNextBus(new SimpleTime(20,45)));
        assertEquals("There are no more departures today.", exception.getMessage());
    }
}