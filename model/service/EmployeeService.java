package service;

import model.Employee;
import java.util.*;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    private int nextId = 1001;

    public Employee addEmployee(String name, String dept, String role, double salary) {
        Employee emp = new Employee(nextId++, name, dept, role, salary);
        employees.add(emp);
        return emp;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
