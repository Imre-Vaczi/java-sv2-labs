package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    @Test
    void checkDayInMonth(){
        DayInMonth dayInMonth = new DayInMonth();
        assertEquals(29, dayInMonth.getDayInMonth(2020, "február"));
        assertEquals(29, dayInMonth.getDayInMonth(2020, "Február"));
        assertEquals(29, dayInMonth.getDayInMonth(2021, "február"));
        assertEquals(29, dayInMonth.getDayInMonth(2021, "Február"));
    }

}