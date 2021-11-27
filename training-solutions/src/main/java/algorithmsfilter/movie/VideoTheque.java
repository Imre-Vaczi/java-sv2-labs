package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    private List<Movie> listOfMovies = new ArrayList<>();

    public VideoTheque(List<Movie> listOfMovies) {
        this.listOfMovies = listOfMovies;
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie film : this.listOfMovies) {
            if ((film.getRating() > 3) && (film.getCategory().equals(category))) {
                filteredMovies.add(film);
            }
        }
        return filteredMovies;
    }

    public void addMovie(Movie movie) {
        this.listOfMovies.add(movie);
    }

    public List<Movie> getListOfMovies() {
        return listOfMovies;
    }
}
