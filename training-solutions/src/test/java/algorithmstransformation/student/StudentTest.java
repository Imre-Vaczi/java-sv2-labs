package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testInit() {
        Student student = new Student("aaa", "fffffff");
        assertEquals("aaa", student.getName());
        assertEquals("fffffff", student.getAddress());
    }
}