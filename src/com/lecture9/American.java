package com.lecture9;

public class American extends Person {
    public American(String name, String sex, String religion, String language, String nationality, int age, String country, String job) {
        super(name, sex, religion, language, nationality, age, country, job);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public boolean isAdult(int age) {
        boolean isAdult = false;
        if (age >= 21) {
            isAdult = true;
            System.out.println("This person is an Adult!");
        }
        else {
            System.out.println("This person is a Child!");
        }
        return isAdult;

    }
}
