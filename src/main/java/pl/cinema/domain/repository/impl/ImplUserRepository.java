package pl.cinema.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.spi.PersistenceProvider;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.stereotype.Repository;

import pl.cinema.domain.Role;
import pl.cinema.domain.User;
import pl.cinema.domain.repository.UserRepository;

@Repository
public class ImplUserRepository implements UserRepository {

	private List<User> users;

	private static EntityManager entityManagerBegin() {
		EntityManagerFactory entityManagerFactory;

		PersistenceProvider provider = new HibernatePersistenceProvider();
		entityManagerFactory = provider.createEntityManagerFactory("cinemaDatabase", null);
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		return entityManager;
	}

	private static void entityManagerEnd(EntityManager entityManager) {
		entityManager.flush();
		entityManager.getTransaction().commit();
		System.out.println("successfull");
		entityManager.close();
	}

	public User getUserByName(String username) {
		EntityManager entityManager = entityManagerBegin();

		User user;

		TypedQuery<User> query = entityManager
				.createQuery("SELECT u FROM Users u WHERE u.username='" + username + "'", User.class);
		user = query.getSingleResult();

		entityManagerEnd(entityManager);

		return user;
	}

	public List<User> getAllUsers() {
		EntityManager entityManager = entityManagerBegin();

		TypedQuery<User> query = entityManager.createQuery("SELECT u FROM Users u", User.class);
		users = query.getResultList();

		entityManagerEnd(entityManager);

		return users;
	}

	public void createUser(User user) {
		EntityManager entityManager = entityManagerBegin();
		Role role = new Role();
		List<Role> roles = new ArrayList<Role>();
		role = entityManager.find(Role.class, 2);
		roles.add(role);
		user.setRoles(roles);
		entityManager.persist(user);
		//User user2 = entityManager.find(User.class, user);
		//entityManager.createQuery("INSERT INTO userandroles(user_id, role_id) VALUES("+user2.getId()+", 2)");
		entityManagerEnd(entityManager);
	}

	public void removeUser(long userId) {
		EntityManager entityManager = entityManagerBegin();
		String txt="DELETE FROM usersandroles ur WHERE ur.user_id="+userId;
		String txt2="DELETE FROM Users u WHERE u.id="+userId;
		entityManager.createQuery(txt);
		entityManager.createQuery(txt2);
		entityManagerEnd(entityManager);
	}

	public void updateUser(User user) {
		EntityManager entityManager = entityManagerBegin();
		entityManager.merge(user);
		entityManagerEnd(entityManager);
	}
	
}
