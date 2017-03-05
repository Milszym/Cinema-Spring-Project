package pl.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.cinema.domain.Movie;
import pl.cinema.domain.repository.MovieRepository;
import pl.cinema.service.MovieService;

@Service
public class ImplMovieService implements MovieService{

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> getAllMovies() {
		return movieRepository.getAllMovies();
	}

	public Movie getMovieById(int movieId) {
		return movieRepository.getMovieById(movieId);
	}

	public void createMovie(Movie movie) {
		movieRepository.createMovie(movie);
	}

	public void removeMovie(String movieName) {
		movieRepository.removeMovie(movieName);
	}

	public void updateMovie(Movie movie) {
		movieRepository.updateMovie(movie);
	}
	
}
