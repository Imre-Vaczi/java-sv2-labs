package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    @Test
    void testSalesMethods() {
        List<Salesperson> toTestList = new ArrayList<>();
        toTestList.add(new Salesperson("A", 1000, 2000));
        toTestList.add(new Salesperson("B", 500, 550));
        toTestList.add(new Salesperson("C", 1000, 200));
        toTestList.add(new Salesperson("D", 2020, 2030));

        Sales sales = new Sales();

        assertEquals("A", sales.selectSalesPersonWithFurthestBelowTarget(toTestList).getName());
        assertEquals("C", sales.selectSalesPersonWithFurthestAboveTarget(toTestList).getName());
        assertEquals("D", sales.selectSalesPersonWithMaxSalesAmount(toTestList).getName());
    }

}