package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testAnimalInit() {
        Animal animal = new Animal("goat", 4);

        assertEquals(4, animal.getNumberOfLegs());
        assertEquals("goat", animal.getName());
    }

}