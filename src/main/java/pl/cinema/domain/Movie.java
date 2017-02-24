package pl.cinema.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Movies")
@Table(name="Filmy")
public class Movie {

	@Id
	@GeneratedValue
	private long movieId;
	@Column(name="tytu³_angielski", nullable=false)
	private String englishTitle;
	@Column(name="tytu³_polski")
	private String polishTitle;
	@Column(name="rok_produkcji")
	private int productionYear;
	@Column(name="kraj_produkcji")
	private String productionCountry;
	@Column(name="rezyser")
	private String director;
	@Column(name="czas_trwania")
	private int length;
	@OneToMany(mappedBy = "movie")
	private List<Seanse> seanses;
	
	
	public Movie(String englishTitle, String polishTitle, int productionYear, String productionCountry, String director,
			int length) {
		super();
		this.englishTitle = englishTitle;
		this.polishTitle = polishTitle;
		this.productionYear = productionYear;
		this.productionCountry = productionCountry;
		this.director = director;
		this.length = length;
	}
	
	public Movie(){
		super();
	}
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", englishTitle=" + englishTitle + ", polishTitle=" + polishTitle
				+ ", productionYear=" + productionYear + ", productionCountry=" + productionCountry + ", director="
				+ director + ", length=" + length + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((englishTitle == null) ? 0 : englishTitle.hashCode());
		result = prime * result + length;
		result = prime * result + (int) (movieId ^ (movieId >>> 32));
		result = prime * result + ((polishTitle == null) ? 0 : polishTitle.hashCode());
		result = prime * result + ((productionCountry == null) ? 0 : productionCountry.hashCode());
		result = prime * result + productionYear;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (englishTitle == null) {
			if (other.englishTitle != null)
				return false;
		} else if (!englishTitle.equals(other.englishTitle))
			return false;
		if (length != other.length)
			return false;
		if (movieId != other.movieId)
			return false;
		if (polishTitle == null) {
			if (other.polishTitle != null)
				return false;
		} else if (!polishTitle.equals(other.polishTitle))
			return false;
		if (productionCountry == null) {
			if (other.productionCountry != null)
				return false;
		} else if (!productionCountry.equals(other.productionCountry))
			return false;
		if (productionYear != other.productionYear)
			return false;
		return true;
	}
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public String getEnglishTitle() {
		return englishTitle;
	}
	public void setEnglishTitle(String englishTitle) {
		this.englishTitle = englishTitle;
	}
	public String getPolishTitle() {
		return polishTitle;
	}
	public void setPolishTitle(String polishTitle) {
		this.polishTitle = polishTitle;
	}
	public int getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	public String getProductionCountry() {
		return productionCountry;
	}
	public void setProductionCountry(String productionCountry) {
		this.productionCountry = productionCountry;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	

	
	
}
