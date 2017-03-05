package pl.cinema.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import pl.cinema.domain.Movie;
import pl.cinema.domain.Seanse;
import pl.cinema.service.MovieService;
import pl.cinema.service.SeanseService;

@Controller
@RequestMapping("/add")
public class AdminController {

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private SeanseService seanseService;

	@RequestMapping("")
	public String choseWhatToAdd(Model model) {
		String whatToAdd = null;
		model.addAttribute("whatToAdd", whatToAdd);

		return "add";
	}

	@RequestMapping(value = "{whatToAdd}", method = RequestMethod.GET)
	public String addExactThingGet(@ModelAttribute("movieAdmin") @Valid Movie movieAdmin, Model model, @PathVariable("whatToAdd") String whatToAdd) {

		if (whatToAdd.equals("movie")) {
			Movie newMovie = new Movie();
			model.addAttribute("newMovie", newMovie);
		}

		else if (whatToAdd.equals("seanse")) {
			Seanse newSeanse = new Seanse();
			model.addAttribute("newSeanse", newSeanse);
		}
		
		if(!movieAdmin.equals(null)){
			model.addAttribute("movieAdmin", movieAdmin);
		}
		
		System.out.println("/add/seanse GET");
		System.out.println(movieAdmin.toString());
		System.out.println("Jak true to jest puste"+movieAdmin.equals(null));

		model.addAttribute("whatToAdd", whatToAdd);

		return "add";
	}

	@RequestMapping(value = "/movie", method = RequestMethod.POST)
	public String addMoviePost(@ModelAttribute("newMovie") @Valid Movie movieToBeAdded, HttpServletRequest request) {

		System.out.println(movieToBeAdded.toString());
		movieService.createMovie(movieToBeAdded);

		return "add";
	}

	@RequestMapping(value = "/seanse", method = RequestMethod.POST)
	public String addSeansePost(@ModelAttribute("newSeanse") @Valid Seanse seanseToBeAdded, HttpServletRequest request) {
		
		System.out.println("/add/seanse POST");
		System.out.println(seanseToBeAdded.getMovie().toString());
		
		//seanseToBeAdded.setMovie(movieToSeanse);
		System.out.println(seanseToBeAdded.toString());
		//seanseService.createSeanse(seanseToBeAdded);

		return "add";
	}

}
