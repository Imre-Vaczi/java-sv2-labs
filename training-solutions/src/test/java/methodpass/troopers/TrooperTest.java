package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrooperTest {

    @Test
    void testGenerating() {
        Trooper trooper = new Trooper("AB");
        assertEquals("AB", trooper.getName());
        assertEquals(0.0, trooper.getPosition().getPosX());
        assertEquals(0.0, trooper.getPosition().getPosY());
    }

    @Test
    void testGeneratingInvalidNull() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Trooper(null));
        assertEquals("Name can not be empty or null", iae.getMessage());
    }

    @Test
    void testGeneratingInvalidEmpty() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Trooper(""));
        assertEquals("Name can not be empty or null", iae.getMessage());
    }

    @Test
    void testChangePositionNull() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Trooper("AB").changePosition(null));
        assertEquals("New position can not be null.", iae.getMessage());
    }

    @Test
    void testChangePosition() {
        Trooper trooper = new Trooper("AB");
        trooper.changePosition(new Position(1.0, 1.0));
        assertEquals(1.0, trooper.getPosition().getPosX());
        assertEquals(1.0, trooper.getPosition().getPosY());
    }

    @Test
    void testDistanceFromNull() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Trooper("AB").distanceFrom(null));
        assertEquals("Target position can not be null.", iae.getMessage());
    }

    @Test
    void testDistanceFrom() {
        Trooper trooper = new Trooper("AB");
        assertEquals(1.41, 0.005, trooper.distanceFrom(new Position(1.0, 1.0)));
    }
}