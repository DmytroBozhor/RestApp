package com.example.restapp.service;

import com.example.restapp.exception.PersonNotFoundException;
import com.example.restapp.model.PersonEntity;
import com.example.restapp.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Service
@Transactional
public class PeopleService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<PersonEntity> getAll() {
        return peopleRepository.findAll();
    }

    public PersonEntity getById(int id) {
        Optional<PersonEntity> personOptional = peopleRepository.findById(id);
        return personOptional.orElseThrow(PersonNotFoundException::new);
    }
}
