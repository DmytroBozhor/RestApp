package com.example.restapp.controller;

import com.example.restapp.model.PersonEntity;
import com.example.restapp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/people")
public class MainController {

    private final PeopleService peopleService;

    @Autowired
    public MainController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/all")
    public List<PersonEntity> getAllUsers() {
        return peopleService.getAll();
    }

    @GetMapping("/{id}")
    public PersonEntity getAllUsers(@PathVariable("id") int id) {
        PersonEntity person = peopleService.getById(id);
        System.out.println(person.getUsername());
        return person;
    }

}
