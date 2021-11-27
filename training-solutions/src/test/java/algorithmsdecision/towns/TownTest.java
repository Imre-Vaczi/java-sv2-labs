package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testContainsFewerHabitants() {
        Town town = new Town();
        List<Integer> toTestList = Arrays.asList(4000, 3000, 10000, 15000);

        assertEquals(true, town.containsFewerHabitants(toTestList,5000));
        assertEquals(false, town.containsFewerHabitants(toTestList,3000));
        assertEquals(false, town.containsFewerHabitants(toTestList,2000));
    }

}