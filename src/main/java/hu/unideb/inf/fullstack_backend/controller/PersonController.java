package hu.unideb.inf.fullstack_backend.controller;

import hu.unideb.inf.fullstack_backend.model.Person;
import hu.unideb.inf.fullstack_backend.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/person")
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    @PostMapping("/person")
    public void savePerson(@RequestBody Person person){
        personRepository.save(person);
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable long id){
        personRepository.deleteById(id);
    }

}
