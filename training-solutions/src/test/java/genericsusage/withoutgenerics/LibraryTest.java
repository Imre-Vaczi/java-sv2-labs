package genericsusage.withoutgenerics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testGetFirstBookValid() {
        List books = Arrays.asList(new Book("Timequake"));
        Library library = new Library();
        assertEquals("Timequake", library.getFirstBook(books).getTitle());
    }

    @Test
    void testGetFirstBookNull() {
        Library library = new Library();
        Exception exception = assertThrows(NullPointerException.class,
                ()-> library.getFirstBook(Arrays.asList(null)).getTitle());
        assertEquals("Library is null, there is no first book.", exception.getMessage());
    }

}