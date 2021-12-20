package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void testGetNumberOfSides() {
        TableCloth tableCloth = new TableCloth(2);
        assertEquals(4, tableCloth.getNumberOfSides());

    }

    @Test
    void testGetPerimeter() {
        TableCloth tableCloth = new TableCloth(2);
        assertEquals(8, tableCloth.getPerimeter());
    }

    @Test
    void testGetLengthOfDiagonal() {
        TableCloth tableCloth = new TableCloth(2);
        assertEquals(1.41, 0.005, tableCloth.getLengthOfDiagonal());
    }

    @Test
    void testGetArea() {
        TableCloth tableCloth = new TableCloth(2);
        assertEquals(4, tableCloth.getArea());
    }

}