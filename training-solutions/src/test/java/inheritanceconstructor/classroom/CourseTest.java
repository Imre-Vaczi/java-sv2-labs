package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void testGenerating() {
        Course course = new Course(18, Facility.CHALKBOARD);

        assertEquals(18, course.getParticipants());
        assertEquals(Facility.CHALKBOARD, course.getFacilityNeeded());
    }

}