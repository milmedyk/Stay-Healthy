package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String calories;
	@NotEmpty
	private String bialko;
	@NotEmpty
	private String tluszcze;
	@NotEmpty 
	private String weglowodane;
	@NotEmpty
	private String login;
	@NotEmpty
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCalories() {
		return calories;
	}
	public void setCalories(String calories) {
		this.calories = calories;
	}
	public String getBialko() {
		return bialko;
	}
	public void setBialko(String bialko) {
		this.bialko = bialko;
	}
	public String getTluszcze() {
		return tluszcze;
	}
	public void setTluszcze(String tluszcze) {
		this.tluszcze = tluszcze;
	}
	public String getWeglowodane() {
		return weglowodane;
	}
	public void setWeglowodane(String weglowodane) {
		this.weglowodane = weglowodane;
	}
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
	@Override
	public String toString() {
		return String.format(
				"Product [id=%s, name=%s, calories=%s, bialko=%s, tluszcze=%s, weglowodane=%s, login=%s, password=%s]",
				id, name, calories, bialko, tluszcze, weglowodane, login, password);
	}
	
	

	
	 
	
}
	
	

