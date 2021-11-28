package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    @Test
    void testGenerating() {
        Woman woman = new Woman();
        woman.setName("ggg");
        woman.addOccasion("születés", LocalDate.of(1980,02,02));
        assertEquals(1, woman.getRegisterDates().size());
        assertEquals("ggg", woman.getName());
    }
}