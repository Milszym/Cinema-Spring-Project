package pl.cinema.domain.repository;

import java.util.List;

import pl.cinema.domain.User;

public interface UserRepository {

	User getUserByName(String username);
	List<User> getAllUsers();
	User getUser(long id);
	User getUser(String username);
	void removeUser(long id);
	void removeUser(String username);
	void createUser(User user);
	
}
