package bfs.TeamProj_auth.service;


import bfs.TeamProj_auth.dao.PersonDao;
import bfs.TeamProj_auth.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("personService")
public class PersonService {
    @Autowired
    private PersonDao personDao;

    @Transactional
    public Person addPerson(Person p) {
        return personDao.addPerson(p);
    }

    @Transactional
    public Person getPersonById(int id) {
        return personDao.getPersonById(id);
    }

    @Transactional
    public Person getPersonByEmail(String email){ return personDao.getPersonByEmail(email);}
    @Transactional
    public List<Person> getAllPerson() {
        return personDao.getALlPerson();
    }

    @Transactional
    public Person updatePerson(Person p) {
        return personDao.updatePerson(p);
    }
}
