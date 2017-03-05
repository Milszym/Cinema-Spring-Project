package pl.cinema.domain.repository.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.spi.PersistenceProvider;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.stereotype.Repository;

import pl.cinema.domain.Seanse;
import pl.cinema.domain.repository.SeanseRepository;

@Repository
public class ImplSeanseRepository implements SeanseRepository{

	private List<Seanse> seanses;
	
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

	public List<Seanse> getAllSeanses() {

		seanses = new ArrayList<Seanse>();
		EntityManager entityManager = entityManagerBegin();
		TypedQuery<Seanse> query = entityManager.createQuery("SELECT s FROM Seanses s", Seanse.class);
		seanses = query.getResultList();
		entityManagerEnd(entityManager);
		
		return seanses;
	}

	public Set<Seanse> getSeansesByDate(Date Date) {
		Set<Seanse> seansesByDate = new HashSet<Seanse>();
		EntityManager entityManager = entityManagerBegin();
		Date.setMonth(4);
		String queryString = "Select s FROM Seanses s WHERE data='"+Date+"'";
		System.out.println("TO jest String do query: "+queryString);
		TypedQuery<Seanse> query = entityManager.createQuery(queryString, Seanse.class);
		seanses = query.getResultList();
		seansesByDate.addAll(seanses);
		for(Seanse s: seansesByDate){
			System.out.println(s.toString());
		}
		entityManagerEnd(entityManager);
		
		seansesByDate.addAll(seanses);
		
		return seansesByDate;
	}

	public void createSeanse(Seanse seanse) {
		EntityManager entityManager = entityManagerBegin();
		entityManager.persist(seanse);
		entityManagerEnd(entityManager);
	}

	public void removeSeanse(long seanseId) {
		EntityManager entityManager = entityManagerBegin();
		String txt = "DELETE FROM Seanses s WHERE s.seanseId=" +seanseId;
		entityManager.createQuery(txt);
		entityManagerEnd(entityManager);
	}

	public void updateSeanse(Seanse seanse) {
		EntityManager entityManager = entityManagerBegin();
		entityManager.merge(seanse);
		entityManagerEnd(entityManager);
	}

	
	
	
}
