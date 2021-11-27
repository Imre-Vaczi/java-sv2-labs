package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo;

    @BeforeEach
    void generatingCase() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("kutya", 4));
        animalList.add(new Animal("gyík", 4));
        animalList.add(new Animal("sikló", 0));
        animalList.add(new Animal("tyúk", 2));
        animalList.add(new Animal("bogár", 6));

        zoo = new Zoo(animalList);
    }

    @Test
    void getAnimalsWithNumberOfLegsGiven() {
        List<Animal> filtered = zoo.getAnimalsWithNumberOfLegsGiven(4);

        assertEquals(2, filtered.size());
    }
}