package pl.cinema.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.cinema.domain.Role;
import pl.cinema.domain.User;
import pl.cinema.exception.UserNotFoundException;
import pl.cinema.service.UserService;

@Controller
public class LoginController{

	@Autowired
	private UserService userService;
	
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
	public String registerPost(@ModelAttribute("newUser") @Valid User userToBeAdded, BindingResult result, HttpServletRequest request) {
		User user = null;
		ObjectError passwordsDoNotMatch = new ObjectError("Has³a", "Has³a nie pasuj¹ do siebie");
		ObjectError usernameUsed = new ObjectError("U¿ytkownik", "U¿ytkownik ju¿ istnieje w bazie danych");
		System.out.println(userToBeAdded.toString());
		
		if(userToBeAdded.getMatchingPassword()==userToBeAdded.getPassword()){
			System.out.println("Rownaja sie sobie");
			result.addError(passwordsDoNotMatch);
		}
		
		try{
			user = userService.getUserByName(userToBeAdded.getUsername());
		}catch(UserNotFoundException e){
			e.printStackTrace();
		}
		if(user!=null){
			result.addError(usernameUsed);
		}
		
		if(result.hasErrors()) {
			return "register";
			}
		
		List<Role> roles = new ArrayList<Role>();
		Role role = new Role("USER");
		roles.add(role);
		userToBeAdded.setRoles(roles);
		
		System.out.println("register POST here");
		System.out.println(userToBeAdded.toString());
		
		userService.createUser(userToBeAdded);

		return "welcome";
	}
	
}
