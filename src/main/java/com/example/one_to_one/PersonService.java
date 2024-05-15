package com.example.one_to_one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }
}