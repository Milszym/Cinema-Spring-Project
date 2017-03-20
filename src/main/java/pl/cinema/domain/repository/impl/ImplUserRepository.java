package pl.cinema.domain.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.spi.PersistenceProvider;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.stereotype.Repository;

import pl.cinema.domain.User;
import pl.cinema.domain.repository.UserRepository;

@Repository
public class ImplUserRepository implements UserRepository {

	private List<User> users;

	private static EntityManager entityConnectionBegin() {
		EntityManagerFactory entityManagerFactory;

		PersistenceProvider provider = new HibernatePersistenceProvider();
		entityManagerFactory = provider.createEntityManagerFactory("cinemaDatabase", null);
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		return entityManager;
	}

	private static void entityConnectionEnd(EntityManager entityManager) {
		entityManager.flush();
		entityManager.getTransaction().commit();
		System.out.println("successfull");
		entityManager.close();
	}

	public User getUserByName(String username) {
		EntityManager entityManager = entityConnectionBegin();

		User user;

		TypedQuery<User> query = entityManager
				.createQuery("SELECT u FROM Users u WHERE u.username=\"" + username + "\"", User.class);
		user = query.getSingleResult();

		entityConnectionEnd(entityManager);

		return user;
	}

	public List<User> getAllUsers() {
		EntityManager entityManager = entityConnectionBegin();

		TypedQuery<User> query = entityManager.createQuery("SELECT u FROM Users u", User.class);
		users = query.getResultList();

		entityConnectionEnd(entityManager);

		return users;
	}

	public User getUser(long id) {
		EntityManager entityManager = entityConnectionBegin();
		User userFounded = entityManager.find(User.class, id);
		entityConnectionEnd(entityManager);
		
		return userFounded;
	}

	public User getUser(String username) {
		EntityManager entityManager = entityConnectionBegin();

		TypedQuery<User> query = entityManager
				.createQuery("SELECT u FROM Users u WHERE u.username=\"" + username + "\"", User.class);
		User userFounded = query.getSingleResult();
		entityConnectionEnd(entityManager);
		
		return userFounded;
	}

	public void removeUser(long id) {
		EntityManager entityManager = entityConnectionBegin();
		entityManager.createQuery("DELETE FROM Users u WHERE u.id="+id);
		entityConnectionEnd(entityManager);
	}

	public void removeUser(String username) {
		EntityManager entityManager = entityConnectionBegin();
		entityManager.createQuery("DELETE FROM Users u WHERE u.username=\"" + username + "\"");
		entityConnectionEnd(entityManager);
	}

	public void createUser(User user) {
		EntityManager entityManager = entityConnectionBegin();
		entityManager.persist(user);
		entityConnectionEnd(entityManager);
	}

}
