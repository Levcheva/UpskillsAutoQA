package com.lecture8.task2;

public class Employee {
    private final int id = 5;
    private final String firstName = "John";
    private final String lastName = "Smith";

    private double salary = 3000;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String getName() {
//        return this.firstName + this.lastName;
        return firstName + " " + lastName;
    }

    double getAnnualSalary() {
        double annualSalary = salary * 12;
        return annualSalary;
    }

    double raiseSalary(double salary, int raisePercentage) {
        setSalary(salary * raisePercentage / 100);
        return salary;
    }

    public String toString() {
        return "Id: " + this.id + ",\nFirst Name: " + this.firstName
                + ", \nLast Name: " + this.lastName + ", \nSalary: "
                + salary + ", \nAnnual Salary: " + getAnnualSalary();
    }

    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        System.out.println(myEmployee.getName());
        System.out.println(myEmployee);
    }

}
