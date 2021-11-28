package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testSettersGetters() {
        Human human = new Human();
        human.setName("aaa");
        human.setWeight(65.4);
        human.setIq(116);

        assertEquals("aaa", human.getName());
        assertEquals(65.4, human.getWeight());
        assertEquals(116, human.getIq());
    }

}