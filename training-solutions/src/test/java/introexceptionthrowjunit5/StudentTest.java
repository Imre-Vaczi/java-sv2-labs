package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    void testStudentWithValidData() {
        student.addNote(4);
        assertEquals(4, student.getScores().get(0));
    }
    @Test
    void testStudentWithInvalidData() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(10));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}