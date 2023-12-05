package org.example;

public class Employee implements IEmployee {
    private String firstName;
    private String lastName;
    private double salary;
    private Departments department;

    public Employee(String firstName, String lastName, double salary, Departments department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public Departments getDepartment() {
        return department;
    }
}
