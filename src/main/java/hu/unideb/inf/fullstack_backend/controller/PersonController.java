package hu.unideb.inf.fullstack_backend.controller;

import hu.unideb.inf.fullstack_backend.model.Person;
import hu.unideb.inf.fullstack_backend.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/person")
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

}
