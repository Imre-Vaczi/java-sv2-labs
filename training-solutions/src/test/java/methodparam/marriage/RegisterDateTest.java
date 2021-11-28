package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    @Test
    void testGenerating() {
        RegisterDate registerDate = new RegisterDate("event", LocalDate.now());
        assertEquals("event", registerDate.getDescription());
        assertEquals(LocalDate.now(), registerDate.getDate());
    }

}