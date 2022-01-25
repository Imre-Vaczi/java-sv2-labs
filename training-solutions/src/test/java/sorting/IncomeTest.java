package sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void testGetHighestIncome() {
        Income income = new Income(new int[]{4,1,7,5,0,87,4,13});
        int result = income.getHighestIncome();
        assertEquals(87, result);
    }
}