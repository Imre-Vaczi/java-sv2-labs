package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    School school = new School();

    @Test
    void testGetNumberOfStudentsValidInput() {
        int toTest = school.getNumberOfStudents(Arrays.asList(10, 20, 30, 20));
        assertEquals(80, toTest);
    }
}