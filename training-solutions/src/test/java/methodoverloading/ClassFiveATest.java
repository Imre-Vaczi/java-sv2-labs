package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA cfa = new ClassFiveA();

    @BeforeEach
    void testCases() {
        cfa.addStudent("Anna");
        cfa.addStudent("Helga");
        cfa.addStudent("Olga");
    }

    @Test
    void testGetTodayReferringStudentInt() {
        assertEquals("Anna", cfa.getTodayReferringStudent(1));
    }

    @Test
    void testGetTodayReferringStudentNumber() {
        assertEquals("Anna", cfa.getTodayReferringStudent(Number.ONE));
    }

    @Test
    void testGetTodayReferringStudentString() {
        assertEquals("Anna", cfa.getTodayReferringStudent("one"));
    }

}