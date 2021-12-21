package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    @Test
    void testLowerClass() {
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(6);
        assertTrue(((LowerClassSchoolChild)primarySchoolChild).getAge()<11);
        assertTrue(((LowerClassSchoolChild)primarySchoolChild).getAge()>5);

        PrimarySchoolChild primarySchoolChildUpper = PrimarySchoolChild.of(10);
        assertTrue(((LowerClassSchoolChild)primarySchoolChildUpper).getAge()<11);
        assertTrue(((LowerClassSchoolChild)primarySchoolChildUpper).getAge()>5);

        assertEquals(LowerClassSchoolChild.class, primarySchoolChild.getClass());
        assertEquals(LowerClassSchoolChild.class, primarySchoolChildUpper.getClass());
    }

    @Test
    void testUpperClass() {
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(11);
        assertTrue(((UpperClassSchoolChild)primarySchoolChild).getAge()<15);
        assertTrue(((UpperClassSchoolChild)primarySchoolChild).getAge()>10);

        PrimarySchoolChild primarySchoolChildUpper = PrimarySchoolChild.of(14);
        assertTrue(((UpperClassSchoolChild)primarySchoolChildUpper).getAge()<15);
        assertTrue(((UpperClassSchoolChild)primarySchoolChildUpper).getAge()>10);

        assertEquals(UpperClassSchoolChild.class, primarySchoolChild.getClass());
        assertEquals(UpperClassSchoolChild.class, primarySchoolChildUpper.getClass());
    }

    @Test
    void testInvalidCasesLower() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> PrimarySchoolChild.of(5));
        assertEquals("Age must be between 6 and 14", exception.getMessage());
    }

    @Test
    void testInvalidCasesUpper() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> PrimarySchoolChild.of(15));
        assertEquals("Age must be between 6 and 14", exception.getMessage());
    }
}