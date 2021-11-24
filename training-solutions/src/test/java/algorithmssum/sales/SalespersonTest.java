package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    void testSalesPerson() {
        Salesperson salespersonA = new Salesperson("Johanna", 10000);
        assertEquals(10000, salespersonA.getAmount());
        assertEquals("Johanna", salespersonA.getName());
    }

}