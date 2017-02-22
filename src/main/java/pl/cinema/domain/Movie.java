package pl.cinema.domain;

public class Movie {

	private long movieId;
	private static long nextId=1;
	private int ageRestriction;
	private String title;
	private int productionYear;
	private String productionCountry;
	private String director;
	private int length;
	
	public Movie(long movieId, int ageRestriction, String title, int productionYear, String productionCountry,
			String director, int length) {
		super();
		this.movieId = nextId;
		nextId++;
		this.ageRestriction = ageRestriction;
		this.title = title;
		this.productionYear = productionYear;
		this.productionCountry = productionCountry;
		this.director = director;
		this.length = length;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ageRestriction;
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + length;
		result = prime * result + (int) (movieId ^ (movieId >>> 32));
		result = prime * result + ((productionCountry == null) ? 0 : productionCountry.hashCode());
		result = prime * result + productionYear;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		if (ageRestriction != other.ageRestriction)
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (length != other.length)
			return false;
		if (movieId != other.movieId)
			return false;
		if (productionCountry == null) {
			if (other.productionCountry != null)
				return false;
		} else if (!productionCountry.equals(other.productionCountry))
			return false;
		if (productionYear != other.productionYear)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public int getAgeRestriction() {
		return ageRestriction;
	}
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
