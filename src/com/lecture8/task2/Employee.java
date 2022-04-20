package com.lecture8;

public class Employee {
    private final int id = 5;
    private final String firstName = "John";
    private final String lastName = "Smith";

    private double salary;

    String getName() {
//        return this.firstName + this.lastName;
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        System.out.println(myEmployee.getName());
    }

}
