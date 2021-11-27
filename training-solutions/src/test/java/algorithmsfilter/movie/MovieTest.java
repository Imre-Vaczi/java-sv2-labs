package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void testMovieInit() {
        Movie movie = new Movie("Pi", Category.DRAMA, 5);

        assertEquals(5, movie.getRating());
        assertEquals(Category.DRAMA, movie.getCategory());
        assertEquals("Pi", movie.getTitle());
    }

}