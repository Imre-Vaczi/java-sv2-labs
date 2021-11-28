package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    @Test
    void testGenerating() {
        Man man = new Man();
        man.setName("aa");
        man.addOccasion("születés", LocalDate.of(1980, 01,01));
        assertEquals(1, man.getRegisterDates().size());
        assertEquals("aa", man.getName());

    }

}