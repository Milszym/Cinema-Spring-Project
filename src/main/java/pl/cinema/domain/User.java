package pl.cinema.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import pl.cinema.validator.Username;

@Entity(name="Users")
@Table(name="u¿ytkownicy")
public class User implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	@Size(min=4, max = 29, message="{Size.User.username.validation}")
	@Column
	private String username;
	//@Size(min=8, max=29, message="{Size.User.password.validation}")
	@Column
	private String password;
	@ManyToMany
	@JoinTable(name="UsersAndRoles", 
	
				joinColumns=@JoinColumn(name="user_id"), 
				inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<Role> roles;
	@Column
	private boolean enabled;
	@Transient
	@Size(min=8, max=29, message="{Size.User.password.validation}")
	private String matchingPassword;
	
	public User(String username, String password, List<Role> roles, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.enabled = enabled;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles
				+ ", enabled=" + enabled + ", matchingPassword=" + matchingPassword + "]";
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
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
