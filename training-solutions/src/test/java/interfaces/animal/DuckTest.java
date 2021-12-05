package interfaces.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void testGenerating() {
        Animal duck = new Duck();
        assertEquals(2, duck.getNumberofLegs());
        assertEquals("Duck", duck.getName());
    }

}