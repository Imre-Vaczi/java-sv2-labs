package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void testGenerating() {
        ClassRoom classRoom = new ClassRoom("a", 20, Facility.CHALKBOARD);

        assertEquals("a", classRoom.getLocation());
        assertEquals(20, classRoom.getCapacity());
        assertEquals(Facility.CHALKBOARD, classRoom.getFacility());
    }

    @Test
    void testIsSuitableValid() {
        ClassRoom classRoom = new ClassRoom("a", 20, Facility.CHALKBOARD);
        Course course = new Course(18, Facility.CHALKBOARD);

        assertTrue(classRoom.isSuitable(course));
    }

    @Test
    void testIsSuitableInvalidCap() {
        ClassRoom classRoom = new ClassRoom("a", 20, Facility.CHALKBOARD);
        Course course = new Course(21, Facility.CHALKBOARD);

        assertFalse(classRoom.isSuitable(course));
    }

    @Test
    void testIsSuitableInvalidFacility() {
        ClassRoom classRoom = new ClassRoom("a", 20, Facility.CHALKBOARD);
        Course course = new Course(18, Facility.PROJECTOR);

        assertFalse(classRoom.isSuitable(course));
    }

}