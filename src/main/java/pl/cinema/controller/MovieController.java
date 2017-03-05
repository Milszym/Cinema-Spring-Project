package pl.cinema.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pl.cinema.domain.Movie;
import pl.cinema.service.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService; 
	
	@RequestMapping("")
	public String getMovies(Model model){
		List<Movie> movies = movieService.getAllMovies();
		
		model.addAttribute("exactMovie", 0);
		model.addAttribute("movies", movies);
		model.addAttribute("moviesAdmin", 0);
		
		return "movies";
	}
	
	@RequestMapping("{movieId}")
	public String seanseByDay(Model model, @PathVariable("movieId") int movieId){
	
		Movie movie = movieService.getMovieById(movieId);
		
		model.addAttribute("exactMovie", 1);
		model.addAttribute("movie", movie);
		model.addAttribute("moviesAdmin", 0);
	
		return "movies";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String getMoviesAdmin(Model model){
		List<Movie> movies = movieService.getAllMovies();
		
		Movie movieAdmin = new Movie();
		model.addAttribute("movieAdmin", movieAdmin);
		model.addAttribute("exactMovie", 0);
		model.addAttribute("movies", movies);
		model.addAttribute("moviesAdmin", 1);
		
		return "movies";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public String postMoviesAdmin(Model model, @ModelAttribute("movieAdmin") @Valid Movie movieToSeanse, HttpServletRequest request, RedirectAttributes redirectAttributes){

		redirectAttributes.addFlashAttribute("movieAdmin", movieToSeanse);
		//model.addAttribute("movieAdmin", movieToSeanse);
		System.out.println("/movies/admin POST");
		System.out.println(movieToSeanse.toString());
		
		return "redirect:/add/seanse";
	}
	
}
