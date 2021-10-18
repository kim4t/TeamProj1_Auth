package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.Person;

import java.util.List;

public interface PersonDao {
    Person getPersonById(int id);

    Person getPersonByEmail(String email);

    List<Person> getALlPerson();

    Person addPerson(Person person);

    Person updatePerson(Person person);

}
