package service;

import model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        return null;
    }

    @Override
    public Employee find(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);

        if (employeeList.contains(employee)) {
            return employee;
        }
        return null;
    }
}
