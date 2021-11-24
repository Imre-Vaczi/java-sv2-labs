package algorithmssum.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {


    @Test
    void testSalesAmountCalculatorValid() {
        List<Salesperson> testListForSalesPerson = new ArrayList<>();
        testListForSalesPerson.add(new Salesperson("Ava", 20000));
        testListForSalesPerson.add(new Salesperson("Uno", 10000));
        testListForSalesPerson.add(new Salesperson("Eva", 10000));
        SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();
        assertEquals(40000, salesAmountSumCalculator.sumSalesAmount(testListForSalesPerson));
    }


}