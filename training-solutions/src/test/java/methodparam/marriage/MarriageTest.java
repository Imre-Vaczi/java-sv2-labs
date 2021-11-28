package methodparam.marriage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void testGentMarried() {
        Marriage marriage = new Marriage();
        Man man = new Man();
        man.setName("aaa rrr");
        Woman woman = new Woman();
        woman.setName("ggg ttt");
        marriage.getMarried(woman, man);

        assertEquals(1, woman.getRegisterDates().size());
        assertEquals(1, man.getRegisterDates().size());
        assertEquals("aaané ggg ttt", woman.getName());
    }

}