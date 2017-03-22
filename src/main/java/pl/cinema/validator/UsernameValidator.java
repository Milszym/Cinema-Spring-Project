package pl.cinema.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.cinema.domain.User;
import pl.cinema.exception.UserNotFoundException;
import pl.cinema.service.UserService;

@Component
public class UsernameValidator implements ConstraintValidator<Username, String>{

	
	@Autowired
	private UserService userService;
	
	public void initialize(Username constraintAnnotation) {
		
	}
	
	@SuppressWarnings("unused")
	public boolean isValid(String value, ConstraintValidatorContext context) {
		User user;
		try{
			user = userService.getUserByName(value);
			System.out.println(user.toString());
		}catch(UserNotFoundException e){
			return true;
		}
		if(user!=null)
			return false;
			
			return true;

	}

	
	
}
