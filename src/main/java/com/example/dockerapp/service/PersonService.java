package com.example.dockerapp.service;

import com.example.dockerapp.model.Persons;
import com.example.dockerapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

	
	@Autowired
	private PersonRepository personRepository;

	public List<Persons> findAll(){
		return personRepository.findAll();
	}
	
	
}
