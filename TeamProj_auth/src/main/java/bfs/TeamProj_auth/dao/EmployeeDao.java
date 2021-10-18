package bfs.TeamProj_auth.dao;


import bfs.TeamProj_auth.domain.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee getEmployeeById(int id);

    List<Employee> getAllEmployee();

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);
}
