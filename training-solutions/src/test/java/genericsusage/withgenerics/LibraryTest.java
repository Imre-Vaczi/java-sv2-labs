package genericsusage.withgenerics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testInnit() {
        Library library = new Library();
        assertTrue(library != null);
    }

    @Test
    void testAddBook() {
        Library library = new Library();
        library.addBook(new Book("1Q84"));
        assertEquals(1, library.getBooks().size());
    }
}