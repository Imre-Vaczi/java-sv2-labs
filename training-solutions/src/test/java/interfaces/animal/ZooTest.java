package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void testGenerating() {
        List<Animal> animalList = Arrays.asList(new Duck(), new Lion(), new Worm());
        Zoo zoo = new Zoo(animalList);

        assertNotNull(zoo);
        assertNotNull(zoo.getAnimals());
    }

    @Test
    void testGetNumberOfAnimals() {
        List<Animal> animalList = Arrays.asList(new Duck(), new Lion(), new Worm());
        Zoo zoo = new Zoo(animalList);

        assertEquals(3, zoo.getNumberOfAnimals());
    }

    @Test
    void testGetNumberOfAllLegs() {
        List<Animal> animalList = Arrays.asList(new Duck(), new Lion(), new Worm());
        Zoo zoo = new Zoo(animalList);

        assertEquals(6, zoo.getNumberOfAllLegs());
        }

}