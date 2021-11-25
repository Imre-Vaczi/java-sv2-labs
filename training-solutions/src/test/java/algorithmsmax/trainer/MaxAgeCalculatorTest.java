package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void testMaxAgeCalcMethod() {
        List<Trainer> toTestList = new ArrayList<>();
        toTestList.add(new Trainer("AB", 30));
        toTestList.add(new Trainer("BC", 60));
        toTestList.add(new Trainer("CD", 20));
        toTestList.add(new Trainer("DE", 40));

        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();

        assertEquals(60, maxAgeCalculator.getTrainerWithMaxAge(toTestList).getAge());
        assertEquals("BC", maxAgeCalculator.getTrainerWithMaxAge(toTestList).getName());
    }

}