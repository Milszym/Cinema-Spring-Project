package pl.cinema.sqlCreate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pl.cinema.domain.Seanse;
import pl.cinema.service.MovieService;
import pl.cinema.service.SeanseService;

public class EmployeeTestHibernate {
	@Autowired
	private static MovieService movieService;
	@Autowired
	private static SeanseService seanseService;

	public static void main(String args[]){
		
		List<Seanse> seansesByDate = new ArrayList<Seanse>();
		
		String day = "24";

		java.util.Date date = new java.util.Date();
		java.sql.Date dateSql = new java.sql.Date(date.getYear(), 5, 24);
				
		seansesByDate = seanseService.getAllSeanses();
		
		for(Seanse s: seansesByDate){
			s.toString();
		}
		
/*		EntityManagerFactory entityManagerFactory;

		PersistenceProvider provider = new HibernatePersistenceProvider();
		entityManagerFactory = provider.createEntityManagerFactory("cinemaDatabase", null);
		// entityManagerFactory = provider.createEntityManagerFactory(
		// "cinemaDatabaseCreate", null);
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		List<Movie> movies = movieService.getAllMovies();
		
		
		movies = new ArrayList<Movie>();*/
/*		List<Movie> movies = new ArrayList<Movie>();
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
		System.out.println("Database connection closing successfull.");*/
		
		
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
