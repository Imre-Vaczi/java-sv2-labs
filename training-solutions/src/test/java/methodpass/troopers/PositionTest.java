package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void testGenerating() {
        Position position = new Position(1.0, 1.0);
        assertEquals(1.0, position.getPosX());
        assertEquals(1.0, position.getPosY());
        assertEquals(1.414, 0.0005, position.distanceFrom(new Position(0.0, 0.0)));
    }

}