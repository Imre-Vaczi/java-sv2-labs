package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void testGenerating() {
        Course course = new Course("CS", new SimpleTime(22,00));
        assertEquals("CS", course.getName());
        assertEquals("22:00", course.getStart().toString());
        assertEquals("22:00: CS", course.toString());
    }

}