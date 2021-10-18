package bfs.TeamProj_auth.dao;


import bfs.TeamProj_auth.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateEmployeeDao extends AbstractHibernateDAO<Employee> implements EmployeeDao {
    public HibernateEmployeeDao() {
        setClazz(Employee.class);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return findById(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return create(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return update(employee);
    }
}
