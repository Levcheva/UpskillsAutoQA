package com.lecture9;

public class Child extends Person {

    public Child(String name, String sex, String religion, String language, String nationality, int age, String country, String job) {
        super(name, sex, religion, language, nationality, age, country, job);
    }

    @Override
    public boolean isAdult(int age) {
        System.out.println("This person is a Child!");
        return false;
    }

    @Override
    public boolean canTakeLoan(String job) {
        System.out.println("This person is a Child and cannot take a loan!");
        return false;
    }
}
