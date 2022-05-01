package com.lecture9;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonTests {

    private Person person1;
    private Person person2;
    private Person person3;

    public PersonTests() {

    }

    @BeforeClass(alwaysRun = true)
    public void setUp() {

        Person person1 = new Bulgarian("Martina", "alien", "Orthodox", "Bulgarian", "Bulgaria", 28, "Bulgaria", "Business Analyst");
        Person person2 = new American("Kam", "female", "Budhist", "Bulgarian", "Bulgaria", 22, "USA", "QA");
        Person person3 = new Italian("Adriano", "male", "Catholic", "Italian", "Italy", 21, "Italy", "Developer");


    }

    @Test
    public void testPerson1() {
        person1.sayHello();
        person1.isAdult(person1.age);
        person1.isCelebratingEaster(person1.religion);
        person1.canTakeLoan(person1.job);
    }

    @Test
    public void testPerson2() {
        person2.sayHello();
        person2.isAdult(person2.age);
        person2.isCelebratingEaster(person2.religion);
        person2.canTakeLoan(person2.job);
    }

    @Test
    public void testPerson3() {
        person3.sayHello();
        person3.isAdult(person3.age);
        person3.isCelebratingEaster(person3.religion);
        person3.canTakeLoan(person3.job);
    }
}
