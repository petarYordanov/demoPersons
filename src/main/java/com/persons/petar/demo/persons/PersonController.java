package com.persons.petar.demo.persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/persons")
public class PersonController {


    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Person getPersonById(@RequestParam("id") int id){
        return personService.getPersonById(id);
    }

    @RequestMapping( method = RequestMethod.DELETE)
    public void deletePersonById(@RequestParam("id") int id){
        personService.removePerson(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_NDJSON_VALUE)
    public void updatePersonById(@RequestParam int id, @RequestBody Person person){
        personService.updatePerson(id, person);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createPerson(@RequestBody Person person){
        personService.createPerson(person);
    }
}
