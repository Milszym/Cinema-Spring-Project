package pl.cinema.service;

import java.util.List;

import pl.cinema.domain.User;

public interface UserService {
	
	User getUserByName(String username);
	List<User> getAllUsers();
	void createUser(User user);
	void removeUser(long userId);
	void updateUser(User user);
	
}
