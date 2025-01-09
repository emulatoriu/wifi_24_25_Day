package logic;

import data.Movie;

import java.util.List;
public class MovieService {
    public List<Movie> findBestMovies(List<Movie> movies) {
        return movies.stream()
                .filter(movie -> movie.rating() >= 3)
                .toList();
    }
}
