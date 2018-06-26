package pl.coderslab.model;

import java.util.List;

public class UserDTO {
	private String login;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return String.format("UserDTO [login=%s, password=%s, email=%s, firstName=%s, lastName=%s]", login, password,
				email, firstName, lastName);
	}

	
	
	
	
	
}
