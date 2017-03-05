package pl.cinema.service.impl;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.cinema.domain.Seanse;
import pl.cinema.domain.repository.SeanseRepository;
import pl.cinema.service.SeanseService;

@Service
public class ImplSeanseService implements SeanseService{

	@Autowired 
	private SeanseRepository seanseRepository;
	
	public List<Seanse> getAllSeanses() {
		return seanseRepository.getAllSeanses();
	}

	public Set<Seanse> getSeansesByDate(java.sql.Date Date) {
		return seanseRepository.getSeansesByDate(Date);
	}

	public void createSeanse(Seanse seanse) {
		seanseRepository.createSeanse(seanse);
	}

	public void removeSeanse(long seanseId) {
		seanseRepository.removeSeanse(seanseId);
	}

	public void updateSeanse(Seanse seanse) {
		seanseRepository.updateSeanse(seanse);
	}

}
