package pl.cinema.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.cinema.domain.Role;
import pl.cinema.domain.User;
import pl.cinema.domain.repository.UserRepository;

@Controller
public class LoginController{

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model){
		
		return "login";
	}
	
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model){
		
		model.addAttribute("error", "true");
		
		return "login";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model){
		
		return "login";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String registerGet(Model model){
		
		User user = new User();
		
		model.addAttribute("newUser", user);
		
		return "register";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addSeansePost(@ModelAttribute("newUser") @Valid User userToBeAdded,HttpServletRequest request) {
		 
		List<Role> roles = new ArrayList<Role>();
		Role role = new Role("USER");
		roles.add(role);
		userToBeAdded.setRoles(roles);
		
		System.out.println("register POST here");
		System.out.println(userToBeAdded.toString());
		
		userRepository.createUser(userToBeAdded);

		return "welcome";
	}
	
}
