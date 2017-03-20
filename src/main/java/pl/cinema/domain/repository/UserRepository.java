package pl.cinema.domain.repository;

import java.util.List;

import pl.cinema.domain.User;

public interface UserRepository {

	User getUserByName(String username);
	List<User> getAllUsers();
	
}
