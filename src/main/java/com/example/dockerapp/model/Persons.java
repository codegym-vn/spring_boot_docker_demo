package com.example.dockerapp.model;

import javax.persistence.*;

@Entity
public class Persons {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	public Persons(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Persons() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
