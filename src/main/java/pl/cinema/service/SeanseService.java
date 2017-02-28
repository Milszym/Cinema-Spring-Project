package pl.cinema.service;

import java.util.List;
import java.util.Set;

import pl.cinema.domain.Seanse;

public interface SeanseService {

	List<Seanse> getAllSeanses();
	Set<Seanse> getSeansesByDate(java.sql.Date Date);
	
}
