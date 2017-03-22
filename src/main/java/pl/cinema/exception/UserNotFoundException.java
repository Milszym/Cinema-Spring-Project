package pl.cinema.exception;

public class UserNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -694354952032299587L;
	
	private String username;
	
	public UserNotFoundException(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return username;
	}

}



