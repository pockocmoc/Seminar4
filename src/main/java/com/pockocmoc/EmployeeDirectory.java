package com.pockocmoc;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private final List<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.experience() == experience) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }

    public String findPhoneNumberByName(String name) {
        for (Employee employee : employees) {
            if (employee.name().equals(name)) {
                return employee.phoneNumber();
            }
        }
        return null;
    }

    public Employee findEmployeeByEmployeeNumber(int employeeNumber) {
        for (Employee employee : employees) {
            if (employee.employeeNumber() == employeeNumber) {
                return employee;
            }
        }
        return null;
    }
}