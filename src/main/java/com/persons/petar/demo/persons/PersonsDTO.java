package com.persons.petar.demo.persons;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonsDTO {

    private static Map< Integer, Person> persons = new HashMap<Integer, Person>();

    public Collection<Person> getAllPersons(){
        return this.persons.values();
    }

    public Person getPersonById(int id){
        return this.persons.get(id);
    }

    public void removePerson(int id) {
        this.persons.remove(id);
    }

    public void updateSPerson(int id, Person updateData){
        Person p = persons.get(id);
        p.setFirstName(updateData.getFirstName());
        p.setLastName(updateData.getLastName());
        p.setBirthdate(updateData.getBirthdate());
    }

    public void createPerson(Person person) {
        int lastId = 0;
        for (Map.Entry<Integer, Person> entry : this.persons.entrySet()) {
            lastId = entry.getKey();
        }
        this.persons.put(lastId, person);
    }

    public void removePersonById(int id) {
        this.persons.remove(id);
    }


}
