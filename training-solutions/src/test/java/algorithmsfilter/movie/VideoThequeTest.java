package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    VideoTheque videoTheque;

    @BeforeEach
    void generateCases() {
        List<Movie> rawMovieList = new ArrayList<>();
        rawMovieList.add(new Movie("aaa", Category.DRAMA,1));
        rawMovieList.add(new Movie("bbb", Category.DRAMA,2));
        rawMovieList.add(new Movie("ccc", Category.DRAMA,3));
        rawMovieList.add(new Movie("ddd", Category.DRAMA,4));
        rawMovieList.add(new Movie("eee", Category.DRAMA,5));
        rawMovieList.add(new Movie("fff", Category.DOCU,3));
        rawMovieList.add(new Movie("ggg", Category.DOCU,4));
        rawMovieList.add(new Movie("hhh", Category.DOCU,5));
        videoTheque = new VideoTheque(rawMovieList);
    }

    @Test
    void testGetListOfMovies() {
        assertEquals(8, videoTheque.getListOfMovies().size());
    }

    @Test
    void testAddMovie() {
        videoTheque.addMovie(new Movie("iii", Category.DOCU,2));
        assertEquals(9, videoTheque.getListOfMovies().size());
    }

    @Test
    void testGetGoodMoviesWithCategoryGiven() {
        List<Movie> collection = videoTheque.getGoodMoviesWithCategoryGiven(Category.DOCU);
        assertEquals(2, collection.size());
        assertEquals("ggg", collection.get(0).getTitle());
        assertEquals(5, collection.get(1).getRating());
        assertEquals(Category.DOCU, collection.get(1).getCategory());
    }

}