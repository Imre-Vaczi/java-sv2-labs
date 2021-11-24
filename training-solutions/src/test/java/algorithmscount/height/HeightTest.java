package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void testHeightMethodValid() {
        Height height = new Height();
        List<Integer> testList = Arrays.asList(130, 131, 132, 133, 134, 145, 146, 147, 148, 149, 150);
        assertEquals(5, height.countChildrenWithHeightGreaterThan(testList, 145));
    }

}