package pl.cinema.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.spi.PersistenceProvider;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.stereotype.Repository;

import pl.cinema.domain.Movie;
import pl.cinema.domain.repository.MovieRepository;

@Repository
public class ImplMovieRepository implements MovieRepository{

	private List<Movie> movies;
	
	public List<Movie> getAllMovies() {
		
		movies = new ArrayList<Movie>();
			
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
		
		return movies;
	}

	public ImplMovieRepository(){
		
	}
	
}
