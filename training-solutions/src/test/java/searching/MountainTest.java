package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void testSearchPeakSuccess() {

        Peak peak = new Peak("ddd", 1000);
        Mountain mountain = new Mountain(new int[]{200, 300, 400, 1000, 2000, 4000});
        boolean result = mountain.searchPeak(peak);

        assertTrue(result);
    }

    @Test
    void testSearchPeakFail() {

        Peak peak = new Peak("ddd", 1000);
        Mountain mountain = new Mountain(new int[]{200, 300, 400, 2000, 4000});
        boolean result = mountain.searchPeak(peak);

        assertFalse(result);
    }

}