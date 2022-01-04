package genericsusage.withgenerics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testInitBook() {
        Book book = new Book("Timequake");
        assertEquals("Timequake", book.getTitle());
    }

    @Test
    void testInitBookInvalidEmptyString() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new Book(""));
        assertEquals("Book title can not be empty!", exception.getMessage());
    }

}