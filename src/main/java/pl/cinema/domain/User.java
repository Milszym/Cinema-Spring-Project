package pl.cinema.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name="Users")
@Table(name="u¿ytkownicy")
public class User implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	@ManyToMany
	@JoinTable(name="UsersAndRoles", 
				joinColumns=@JoinColumn(name="user_id"), 
				inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<Role> roles;
	@Column
	private boolean enabled;
	
	public User(String username, String password, List<Role> roles, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.enabled = enabled;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public boolean getEnabled(){
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public User(){
		
	}
	
}
