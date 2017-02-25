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
	
		EntityManagerFactory entityManagerFactory;

		PersistenceProvider provider = new HibernatePersistenceProvider();
		entityManagerFactory = provider.createEntityManagerFactory("cinemaDatabase", null);
		// entityManagerFactory = provider.createEntityManagerFactory(
		// "cinemaDatabaseCreate", null);
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		entityManager.flush();
		entityManager.getTransaction().commit();
		System.out.println("successfull");
		entityManager.close();

		return "redirect:/";
	}

}
