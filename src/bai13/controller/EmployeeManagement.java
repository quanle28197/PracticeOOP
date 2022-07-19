package bai13.controller;

import bai13.model.Employee;
import bai13.model.Experience;
import bai13.model.Fresher;
import bai13.model.Intern;
import bai13.service.exception.IdNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {
    private HashMap<String, Employee> employees;

    public EmployeeManagement() {
        this.employees = new HashMap<>();
    }

    public HashMap<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(HashMap<String, Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public List<Employee> getEmployeesList() {
        return employees.entrySet()
                .stream()
                .map(e -> e.getValue())
                .collect(Collectors.toList());
    }

    public Employee findEmployeeById(String id) {
        return this.getEmployeesList().stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IdNotFoundException("Id not found"));
    }

    public boolean removeById(String id) {
        Employee employee = this.findEmployeeById(id);
        return employees.remove(employee.getId(), employee);
    }

    public List<Employee> findByType(int type) {
        return this.getEmployeesList().stream()
                .filter(e -> {
                    if (type == 1) {
                        return e instanceof Experience;
                    }
                    if (type == 2) {
                        return e instanceof Fresher;
                    }
                    if (type == 3) {
                        return e instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
}
