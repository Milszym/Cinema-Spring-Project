package pl.cinema.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


public class Seanse {
	
//	@Id
//	@GeneratedValue
	private long seanseId;
/*	@Column(name="id_filmu")
	private Movie movie;*/
//	@Column(name="rodzaj_seansu")
	private String type; //3D or 2D Seanse
//	@Column(name="data", nullable=false)
	private Date date;
//	@Column(name="czas", nullable=false)
	private Time time;
//	@Column(name="jezyk")
	private String languageSpoken; //dubbing/english/polish and so on
//	@Column(name="cena", nullable=false, precision=4, scale=2)
	private BigDecimal price;
	
	
	public Seanse(long seanseId, Movie movie, String type, Date date, Time time, String languageSpoken) {
		super();
		this.seanseId = seanseId;
//		this.movie = movie;
		this.type = type;
		this.date = date;
		this.time = time;
		this.languageSpoken = languageSpoken;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public long getSeanseId() {
		return seanseId;
	}
	public void setSeanseId(long seanseId) {
		this.seanseId = seanseId;
	}
/*	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}*/
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getLanguageSpoken() {
		return languageSpoken;
	}
	public void setLanguageSpoken(String languageSpoken) {
		this.languageSpoken = languageSpoken;
	}
	
	
}
