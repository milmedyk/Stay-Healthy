package pl.coderslab.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

public class Dieta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSuma() {
		return name;
	}
	public void setSuma(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("Dieta [id=%s, name=%s]", id, name);
	}
	
}
