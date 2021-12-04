package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testGenerating() {
        Book book = new Book("1Q84", 7000);

        assertEquals("1Q84", book.getTitle());
        assertEquals(7000, book.price);
    }

    @Test
    void testPurchase() {
        Book book = new Book("1Q84", 7000);

        assertEquals(14000, book.purchase(2));
    }

}