package pl.cinema.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.cinema.domain.Employee;
import pl.cinema.domain.Movie;
import pl.cinema.domain.Seanse;
import pl.cinema.domain.Ticket;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome() {

		return "welcome";
	}

	@RequestMapping("/welcome/test")
	public String welcomeTest() {
		System.out.println("Jesteœ w œrodku testu.");

		java.util.Date utilStartDate = new java.util.Date();

		Employee employee = new Employee(37, "Leszke", "Smieszke", new BigDecimal(3000), new Date(2016, 2, 3));
		Employee employee2 = new Employee(37, "Heszke", "Wmeszke", new BigDecimal(3200),
				new java.sql.Date(utilStartDate.getTime()));
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.MONTH, Calendar.JULY);
		cal.set(Calendar.DAY_OF_MONTH, 24);
		cal.set(Calendar.HOUR_OF_DAY, 16);
		cal.set(Calendar.MINUTE, 15);
		
		Movie movie = new Movie("Title", "Tytul", 2015, "Usa", "Wojciech Mann", 120);
		Seanse seanse = new Seanse(movie, "3D", new java.sql.Date(cal.getTimeInMillis()), new Time(cal.getTimeInMillis()), "Angielski", new BigDecimal(30));
		cal.set(Calendar.HOUR_OF_DAY, 21);
		Seanse seanse2 = new Seanse(movie, "2D", new java.sql.Date(cal.getTimeInMillis()), new Time(cal.getTimeInMillis()), "Angielski", new BigDecimal(30));
		Ticket ticket = new Ticket(seanse, 12, 5, "student");
		Ticket ticket2 = new Ticket(seanse, 12, 5, "child");
		Ticket ticket3 = new Ticket(seanse, 12, 5, "adult");
		
		EntityManagerFactory entityManagerFactory;

		PersistenceProvider provider = new HibernatePersistenceProvider();
		entityManagerFactory = provider.createEntityManagerFactory("cinemaDatabaseCreate", null);
		// entityManagerFactory = provider.createEntityManagerFactory(
		// "cinemaDatabaseCreate", null);
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(movie);
		entityManager.persist(seanse);
		entityManager.persist(seanse2);
		entityManager.persist(ticket);
		entityManager.persist(ticket2);
		entityManager.persist(ticket3);

		/*
		 * Employee emp = entityManager.find(Employee.class, 1L);
		 * System.out.println(emp.toString()); emp.setSalary(new
		 * BigDecimal(3320.00));
		 */

		entityManager.flush();
		entityManager.getTransaction().commit();
		System.out.println("successfull");
		entityManager.close();

		return "redirect:/";
	}

}
