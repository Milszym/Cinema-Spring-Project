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

	public User getUser(long id) {
		return userRepository.getUser(id);
	}

	public User getUser(String username) {
		return userRepository.getUser(username);
	}

	public void removeUser(long id) {
		userRepository.removeUser(id);
	}

	public void removeUser(String username) {
		userRepository.removeUser(username);
	}

	public void createUser(User user) {
		userRepository.createUser(user);
	}
	
	
}
