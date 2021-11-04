package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeeksTest {

    @Test
    void checkDayofWeeks(){
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        assertEquals("hét eleje", dayOfWeeks.orientDuringTheWeek("HÉTFŐ"));
        assertEquals("hét közepe", dayOfWeeks.orientDuringTheWeek("kedd"));
        assertEquals("hét közepe", dayOfWeeks.orientDuringTheWeek("  SzerdA  "));
        assertEquals("hét közepe", dayOfWeeks.orientDuringTheWeek(" Csütörtök  "));
        assertEquals("majdnem hétvége", dayOfWeeks.orientDuringTheWeek("péntek  "));
        assertEquals("hét vége", dayOfWeeks.orientDuringTheWeek("  Szombat"));
        assertEquals("hét vége", dayOfWeeks.orientDuringTheWeek("vasárNap"));
    }
}