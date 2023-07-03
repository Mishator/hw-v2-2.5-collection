package service;

import model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firsName, String lastName);
    Employee remove(String firsName, String lastName);
    Employee find(String firsName, String lastName);

    Collection<Employee> findAll();
}

