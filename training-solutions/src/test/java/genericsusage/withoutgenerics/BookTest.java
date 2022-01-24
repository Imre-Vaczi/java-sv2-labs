package genericsusage.withoutgenerics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testInnitValid() {
        Book book = new Book("Timequake");
        assertEquals("Timequake", book.getTitle());
    }

    @Test
    void testInnitNull() {
        Exception exception = assertThrows(NullPointerException.class,
                ()-> new Book(null));
        assertEquals("Title can not be null", exception.getMessage());
    }

    @Test
    void testInnitEmpty() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new Book(""));
        assertEquals("Title can not be empty", exception.getMessage());
    }

}