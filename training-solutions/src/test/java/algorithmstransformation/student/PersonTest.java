package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testInit() {
        Person person = new Person("aaa", 20, "sss");

        assertEquals("aaa", person.getName());
        assertEquals(20, person.getAge());
        assertEquals("sss", person.getAddress());
    }

}