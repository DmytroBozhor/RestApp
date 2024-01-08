package com.example.restapp.controller;

import com.example.restapp.model.PersonEntity;
import com.example.restapp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public PersonEntity getUserById(@PathVariable("id") int id) {
        return peopleService.getById(id);
    }

}
