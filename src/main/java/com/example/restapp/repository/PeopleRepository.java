package com.example.restapp.repository;

import com.example.restapp.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<PersonEntity, Integer> {
}
