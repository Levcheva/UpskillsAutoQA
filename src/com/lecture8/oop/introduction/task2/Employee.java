package com.lecture8.oop.introduction.task2;

public class Employee {
    private  int id = 5;
    private  String firstName = "John";
    private  String lastName = "Smith";
    private double salary = 3000;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String getName() {
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
        Employee myEmployee = new Employee(11, "Kam", "Bam", 5000);
        System.out.println(myEmployee.getName());
        System.out.println(myEmployee);
    }

}
