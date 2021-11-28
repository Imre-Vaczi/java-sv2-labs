package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PendriveTest {

    @Test
    void testGenerating() {
        Pendrive pendrive = new Pendrive("a", 2, 1000);

        assertEquals("a", pendrive.getName());
        assertEquals(2, pendrive.getCapacity());
        assertEquals(1000, pendrive.getPrice());
    }

    @Test
    void testRisePrice() {
        Pendrive pendrive = new Pendrive("a", 2, 1000);

        pendrive.risePrice(20);
        assertEquals(1200, pendrive.getPrice());
    }

    @Test
    void testComparePricePerCapacity() {
        Pendrive driveOne = new Pendrive("a", 2, 1000);
        Pendrive driveTwo = new Pendrive("d", 4, 1800);
        Pendrive driveThree = new Pendrive("c", 2, 1100);

        assertEquals(1, driveOne.comparePricePerCapacity(driveTwo));
        assertEquals(0, driveOne.comparePricePerCapacity(driveOne));
        assertEquals(-1, driveTwo.comparePricePerCapacity(driveOne));
        assertEquals(-1, driveOne.comparePricePerCapacity(driveThree));
    }

    @Test
    void testIsCheaperThan() {
        Pendrive driveOne = new Pendrive("a", 2, 1000);
        Pendrive driveTwo = new Pendrive("b", 5, 1900);

        assertTrue(driveOne.isCheaperThan(driveTwo));
        assertFalse(driveTwo.isCheaperThan(driveOne));
    }

}