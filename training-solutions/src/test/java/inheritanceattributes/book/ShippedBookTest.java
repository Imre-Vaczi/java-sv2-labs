package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    @Test
    void testGenerating() {
        ShippedBook shippedBook = new ShippedBook("1Q84", 7000, 1700);

        assertEquals(7000, shippedBook.price);
        assertEquals("1Q84", shippedBook.getTitle());
        assertEquals(1700, shippedBook.getShippingCost());
    }

    @Test
    void testOrder() {
        ShippedBook shippedBook = new ShippedBook("1Q84", 7000, 1700);

        assertEquals(15700, shippedBook.order(2));
    }

    @Test
    void testToString() {
        ShippedBook shippedBook = new ShippedBook("1Q84", 7000, 1700);

        assertEquals("1Q84: 7000 Ft, shipping cost: 1700 Ft", shippedBook.toString());
    }

}