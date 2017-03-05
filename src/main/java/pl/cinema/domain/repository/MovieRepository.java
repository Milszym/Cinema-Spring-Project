package pl.cinema.domain.repository;

import java.util.List;

import pl.cinema.domain.Movie;

public interface MovieRepository {

	List <Movie> getAllMovies();
	Movie getMovieById(int movieId);
	void createMovie(Movie movie);
	void removeMovie(String movieName);
	void updateMovie(Movie movie);
	
}
