package com.persons.petar.demo.persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class PersonService {


    @Autowired
    PersonsDTO personDTO;

    public Collection<Person> getAllPersons(){
        return personDTO.getAllPersons();
    }

    public Person getPersonById(int id){
        return personDTO.getPersonById(id);
    }

    public void createPerson(Person person){
        personDTO.createPerson(person);
    }

    public void updatePerson(int id, Person person){
        personDTO.updateSPerson(id, person);
    }

    public void removePerson(int id){
        personDTO.removePerson(id);
    }
}
