package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    void testSalesPersonGenerating() {
        Salesperson salesperson = new Salesperson("Lópiczy", 1000, 700);
        assertEquals("Lópiczy", salesperson.getName());
        assertEquals(1000, salesperson.getAmount());
        assertEquals(700, salesperson.getTarget());
    }

}