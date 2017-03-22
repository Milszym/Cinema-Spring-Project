package pl.cinema.exception;

public class PasswordsDoNotMatch extends RuntimeException{

	private static final long serialVersionUID = -694354952032299587L;
	
	private String password;
	
	public PasswordsDoNotMatch(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}

}



