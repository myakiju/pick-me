package br.com.devjavagirls.workshop.pickme.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	private @Id @GeneratedValue Long id;
	private String name;
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person() {
		super();
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
}
