package pl.cinema.domain.repository;

import java.util.List;
import java.util.Set;

import pl.cinema.domain.Movie;
import pl.cinema.domain.Seanse;

public interface SeanseRepository {

	List<Seanse> getAllSeanses();
	Set<Seanse> getSeansesByDate(java.sql.Date Date);
	void createSeanse(Seanse seanse);
	void removeSeanse(long seanseId);
	void updateSeanse(Seanse seanse);
	
}
