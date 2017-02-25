package pl.cinema.sqlCreate;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.spi.PersistenceProvider;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;

import pl.cinema.domain.Movie;
import pl.cinema.domain.Seanse;
import pl.cinema.domain.Ticket;
import pl.cinema.service.MovieService;

public class EmployeeTestHibernate {
	@Autowired
	private static MovieService movieService;
	
	public static void main(String args[]){
		

		
/*		EntityManagerFactory entityManagerFactory;

		PersistenceProvider provider = new HibernatePersistenceProvider();
		entityManagerFactory = provider.createEntityManagerFactory("cinemaDatabase", null);
		// entityManagerFactory = provider.createEntityManagerFactory(
		// "cinemaDatabaseCreate", null);
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		List<Movie> movies = movieService.getAllMovies();
		
		
		movies = new ArrayList<Movie>();*/
		List<Movie> movies = new ArrayList<Movie>();
		PersistenceProvider provider = new HibernatePersistenceProvider();
		EntityManagerFactory entityManagerFactory = provider.createEntityManagerFactory("cinemaDatabase", null);
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		TypedQuery<Movie> query = entityManager.createQuery("SELECT m FROM Movies m", Movie.class);
		movies = query.getResultList();
		for(Movie m: movies){
			System.out.println(m.toString());
		}
		entityManager.flush();
		entityManager.getTransaction().commit();
		System.out.println("Database transactions ended successfull.");
		entityManager.close();
		System.out.println("Database connection closing successfull.");
		
		
/*		entityManager.getTransaction().begin();


		
		 * Employee emp = entityManager.find(Employee.class, 1L);
		 * System.out.println(emp.toString()); emp.setSalary(new
		 * BigDecimal(3320.00));
		 

		entityManager.flush();
		entityManager.getTransaction().commit();
		System.out.println("successfull");
		entityManager.close();*/
		
	}
	
}
