package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    @Test
    void testGetNumberOfTopGrades() {
        ExamStats examStats = new ExamStats(100);
        assertEquals(2, examStats.getNumberOfTopGrades(90, 85, 97, 91));
        assertEquals(0, examStats.getNumberOfTopGrades(100, 85, 97, 91));
        assertEquals(3, examStats.getNumberOfTopGrades(0, 85, 97, 91));
    }

    @Test
    void testGetNumberOfTopGradesNull() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new ExamStats(100).getNumberOfTopGrades(50, null));
        assertEquals("List of results can not be empty.", exception.getMessage());
    }

    @Test
    void testGetNumberOfTopGradesEmpty() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new ExamStats(100).getNumberOfTopGrades(50));
        assertEquals("List of results can not be empty.", exception.getMessage());
    }

    @Test
    void testHasAnyFailed() {
        ExamStats examStats = new ExamStats(100);
        assertTrue(examStats.hasAnyFailed(90, 85, 97, 91));
        assertTrue(examStats.hasAnyFailed(100, 85, 97, 91));
        assertFalse(examStats.hasAnyFailed(0, 85, 97, 91));
    }

    @Test
    void testHasAnyFailedNull() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new ExamStats(100).hasAnyFailed(50, null));
        assertEquals("List of results can not be empty.", exception.getMessage());
    }

    @Test
    void testHasAnyFailedEmpty() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new ExamStats(100).hasAnyFailed(50));
        assertEquals("List of results can not be empty.", exception.getMessage());
    }
}