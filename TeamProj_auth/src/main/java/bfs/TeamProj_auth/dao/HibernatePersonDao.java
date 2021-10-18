package bfs.TeamProj_auth.dao;


import bfs.TeamProj_auth.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public class HibernatePersonDao extends AbstractHibernateDAO<Person> implements PersonDao {
    public HibernatePersonDao() {
        setClazz(Person.class);
    }

    @Override
    public Person getPersonById(int id) {
        return findById(id);
    }

    @Override
    public Person getPersonByEmail(String email) {
        return findByField("email",email);
    }

    @Override
    public List<Person> getALlPerson() {
        return findAll();
    }

    @Override
    public Person addPerson(Person person) {
        return create(person);
    }

    @Override
    public Person updatePerson(Person person) {
        return update(person);
    }
}
