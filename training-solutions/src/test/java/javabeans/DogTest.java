package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getSetName() {
        Dog dog = new Dog();
        dog.setName("Mardel");
        assertEquals("Mardel", dog.getName());
    }

    @Test
    void getSetAge() {
        Dog dog = new Dog();
        dog.setAge(7);
        assertEquals(7, dog.getAge());
    }

    @Test
    void isSetPedigree() {
        Dog dog = new Dog();
        dog.setPedigree(false);
        assertFalse(dog.isPedigree());
    }

    @Test
    void getSetWeight() {
        Dog dog = new Dog();
        dog.setWeight(20.4);
        assertEquals(20.4, dog.getWeight());
    }

}