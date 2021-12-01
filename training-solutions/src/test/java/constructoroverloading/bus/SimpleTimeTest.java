package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void testGenerating() {
        SimpleTime spOneInt = new SimpleTime(7);
        SimpleTime spTwoInt = new SimpleTime(8, 30);
        SimpleTime spOneSP = new SimpleTime(spTwoInt);

        assertEquals(spTwoInt.toString(), spOneSP.toString());
        assertEquals("7h : 0m", spOneInt.toString());
    }

    @Test
    void testGetDifference() {
        SimpleTime spOneInt = new SimpleTime(7);
        SimpleTime spTwoInt = new SimpleTime(8, 30);

        assertEquals(-90, spTwoInt.getDifference(spOneInt));
        assertEquals(90, spOneInt.getDifference(spTwoInt));
    }
}