package pl.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.cinema.domain.Movie;
import pl.cinema.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService; 
	
	@RequestMapping("/movies")
	public String getMovies(Model model){
		List<Movie> movies = movieService.getAllMovies();
		
		model.addAttribute("movies", movies);
		
		return "movies";
	}
	
}
