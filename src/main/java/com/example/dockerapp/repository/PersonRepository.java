package com.example.dockerapp.repository;

import com.example.dockerapp.model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Persons, Integer> {

}
