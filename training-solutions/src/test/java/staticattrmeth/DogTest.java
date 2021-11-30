package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testGenerating() {
        Dog dog = new Dog("aaa", 12, Species.MIXTURE);
        assertEquals("aaa", dog.getName());
        assertEquals(12, dog.getAge());
        assertEquals(Species.MIXTURE, dog.getSpecies());
    }
}