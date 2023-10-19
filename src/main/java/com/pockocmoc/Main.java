package com.pockocmoc;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        Employee employee1 = new Employee(1, "123456789", "John", 5);
        Employee employee2 = new Employee(2, "987654321", "Jane", 3);
        Employee employee3 = new Employee(3, "555555555", "Bob", 7);

        directory.addEmployee(employee1);
        directory.addEmployee(employee2);
        directory.addEmployee(employee3);

        List<Employee> employeesWithExperience5 = directory.findEmployeesByExperience(5);
        System.out.println("Employees with experience 5:");
        for (Employee employee : employeesWithExperience5) {
            System.out.println(employee.name());
        }

        String phoneNumber = directory.findPhoneNumberByName("Jane");
        System.out.println("Phone number of Jane: " + phoneNumber);

        Employee foundEmployee = directory.findEmployeeByEmployeeNumber(3);
        System.out.println("Found employee with employee number 3: " + foundEmployee.name());
    }
}