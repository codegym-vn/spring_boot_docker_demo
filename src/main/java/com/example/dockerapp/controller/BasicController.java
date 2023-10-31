package com.example.dockerapp.controller;

import com.example.dockerapp.model.Persons;
import com.example.dockerapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasicController {

    @Autowired
    private PersonService personService;

    @GetMapping("/all")
    public List<Persons> getAll() {
        return personService.findAll();
    }


}
