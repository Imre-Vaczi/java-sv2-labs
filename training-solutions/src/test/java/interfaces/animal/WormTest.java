package interfaces.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WormTest {

    @Test
    void testGenerating() {
        Animal worm = new Worm();
        assertEquals(0, worm.getNumberofLegs());
        assertEquals("Worm", worm.getName());
    }

}