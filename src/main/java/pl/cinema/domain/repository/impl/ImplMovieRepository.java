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
public class ImplMovieRepository implements MovieRepository {

	private List<Movie> movies;

	public ImplMovieRepository() {

	}

	private EntityManager entityManagerBegin() {
		PersistenceProvider provider = new HibernatePersistenceProvider();
		EntityManagerFactory entityManagerFactory = provider.createEntityManagerFactory("cinemaDatabase", null);
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		return entityManager;
	}

	private void entityManagerEnd(EntityManager entityManager) {
		entityManager.flush();
		entityManager.getTransaction().commit();
		System.out.println("Database transactions ended successfull.");
		entityManager.close();
		System.out.println("Database connection closing successfull.");
	}

	public List<Movie> getAllMovies() {

		movies = new ArrayList<Movie>();

		EntityManager entityManager = this.entityManagerBegin();
		TypedQuery<Movie> query = entityManager.createQuery("SELECT m FROM Movies m", Movie.class);
		movies = query.getResultList();
		for (Movie m : movies) {
			System.out.println(m.toString());
		}

		entityManagerEnd(entityManager);

		return movies;
	}

	public Movie getMovieById(int movieId) {
		Movie movie = new Movie();
		long movieIdLong = Long.valueOf(movieId);
		EntityManager entityManager = this.entityManagerBegin();
		String txt = "SELECT m FROM Movies m WHERE m.movieId=" + Integer.toString(movieId);
		TypedQuery<Movie> query = entityManager.createQuery(txt, Movie.class);
		movie = query.getSingleResult();

		System.out.println(movie.toString());

		entityManagerEnd(entityManager);

		return movie;
	}

	public void createMovie(Movie movie) {

		EntityManager entityManager = this.entityManagerBegin();
		entityManager.persist(movie);
		entityManagerEnd(entityManager);
	}

	public void removeMovie(String movieName) {
		EntityManager entityManager = this.entityManagerBegin();
		String txt = "DELETE FROM Movies m WHERE m.polishTitle=" +movieName;
		entityManager.createQuery(txt);
		entityManagerEnd(entityManager);
	}

	public void updateMovie(Movie movie) {
		EntityManager entityManager = this.entityManagerBegin();
		entityManager.merge(movie);
		entityManagerEnd(entityManager);
	}

}
