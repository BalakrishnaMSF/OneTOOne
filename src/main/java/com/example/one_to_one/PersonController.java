package com.example.one_to_one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/persons")
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("/persons/{id}")
    public Person getPerson(@PathVariable Long id) {
        return personService.getPersonById(id);
    }
}

