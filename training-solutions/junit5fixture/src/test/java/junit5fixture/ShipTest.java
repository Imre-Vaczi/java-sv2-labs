package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    Ship ship;

    @BeforeEach
    void createShip(){
        ship = new Ship("Pinta", 1492, 17.0);
    }
    @Test
    void testName(){
        assertEquals("Pinta", ship.getName());
        assertNotEquals("pinta", ship.getName());
    }
    @Test
    void testYearOfConstruction(){
        assertEquals(1492, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() <= 1492);
        assertFalse(ship.getYearOfConstruction() > 1492);
    }
    @Test
    void testLength(){
        assertEquals(17.0000005, ship.getLength(), 0.0001);
    }
    @Test
    void testNull(){
        Ship newShip = null;
        assertNull(newShip);
        assertNotNull(ship);
    }
    @Test
    void testSameObjects(){
        Ship replica = ship;
        assertSame(ship, replica);
    }
    @Test
    void testNotSameObjects(){
        Ship copyCat = new Ship("Pinta", 1492, 17.0);
        assertNotSame(ship, copyCat);
    }

}