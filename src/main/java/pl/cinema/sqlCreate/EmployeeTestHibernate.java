package pl.cinema.sqlCreate;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;

import org.hibernate.jpa.HibernatePersistenceProvider;

import pl.cinema.domain.Employee;
import pl.cinema.domain.Movie;

public class EmployeeTestHibernate {
	
	public static void main(String args[]){
		
		java.util.Date utilStartDate = new java.util.Date();
		
		Employee employee = new Employee(37, "Sza", "Kraweznik", new BigDecimal(3000), new Date(2016, 2,3));
		Employee employee2 = new Employee(37, "Ma", "Kaftanik", new BigDecimal(3200), new java.sql.Date(utilStartDate.getTime()));
		Movie movie = new Movie("Title", "Tytul", 2015, "Usa", "Wojciech Mann", 120);
		EntityManagerFactory entityManagerFactory;
		
		PersistenceProvider provider = new HibernatePersistenceProvider();
    	entityManagerFactory = provider.createEntityManagerFactory(
    	   "cinemaDatabaseCreate", null);
    	//entityManagerFactory = provider.createEntityManagerFactory(
    	//		"cinemaDatabaseCreate", null);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
       /* entityManager.persist( employee );
        entityManager.persist( employee2 );*/
        //entityManager.persist(movie);
        /*Employee emp = entityManager.find(Employee.class, 1L);
        System.out.println(emp.toString());
        emp.setSalary(new BigDecimal(3320.00));*/
        
        entityManager.flush();
        entityManager.getTransaction().commit();
        System.out.println("successfull");
        entityManager.close();
		
	}
	
}
