package pl.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.cinema.domain.User;
import pl.cinema.domain.repository.UserRepository;
import pl.cinema.service.UserService;

@Service
public class ImplUserService implements UserService{

	@Autowired
	private UserRepository userRepository;

	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		return userRepository.getUserByName(username);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.getAllUsers();
	}
	
	
}
