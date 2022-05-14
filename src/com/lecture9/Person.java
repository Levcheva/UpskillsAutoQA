package com.lecture9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    final String name;
    final String sex;
    final String religion;
    final String language;
    final String nationality;
    String EGN;
    final String dateOfBirth;
    int age;
    String countryOfResidence;
    String job;


    public Person(String name, String sex, String religion, String language, String nationality, int age, String countryOfResidence, String job) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.nationality = nationality;
        String EGN = addEGN();
        dateOfBirth = addDateOfBirth();
        this.age = age;
        this.countryOfResidence = countryOfResidence;
        this.job = job;
    }

    public String getSex() {
        try {
            if (sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female")){
             getSex();
        }
       throw new Exception("Invalid sex!");

            } catch (Exception ex) {
                ex.printStackTrace();

        }

        return sex;
    }



    /**
     * This method generates a user input EGN
     *
     * @return String type
     */
    public String addEGN() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter 10 digit EGN: ");
        EGN = myInput.nextLine();
        if (EGN.chars().count() != 10) {
            throw new InputMismatchException("EGN must be exactly 10 digits! You have entered: " + EGN.chars().count() + " digits");
        }
        return EGN;
    }

    public String addDateOfBirth() {
        String yearOfBirth = EGN.substring(0, 2);
        String monthOfBirth = EGN.substring(2, 4);
        String dayOfBirth = EGN.substring(4, 6);
        String dateOfBirth =  dayOfBirth + "." + monthOfBirth  + yearOfBirth;

        return dateOfBirth;
    }

    public void sayHello() {
        System.out.println("Greetings on your own language!");
    }

    /**
     * This method is checking if the person is Celebrating Easter according to their religion
     *
     * @param religion
     */
    public void isCelebratingEaster(String religion) {
        switch (religion) {
            case "Catholic":
                System.out.println("Catholic Christians celebrate Easter!");
                break;
            case "Orthodox":
                System.out.println("Orthodox Christians celebrate Easter!");
                break;
            case "Islam":
                System.out.println("Islamists do not celebrate Easter!");
                break;

            default:
                System.out.println("This religions is not in the list of religions!");
        }
    }

    /**
     * This method is checking whether the person is adult according ot their age
     * @param age
     * @return
     * True if the person is an adult and false if the person is a child.
     */
    public boolean isAdult(int age) {
            boolean isAdult = false;
            if (age >= 18) {
                isAdult = true;
                System.out.println("This person is an Adult!");
            } else {
                System.out.println("This person is a Child!");
            }
            return isAdult;
    }

    /**
     * This method is checking whether the person is eligible to take a loan based on their job.
     * @param job
     * @return
     * True if the person is eligible to take a loan and false if the person is not eligible to take a loan.
     */
    public boolean canTakeLoan(String job) {
        if (job.equals("QA")) {
            System.out.println("The Person is eligible to take a loan!");
            return true;
        }
        System.out.println("The Person cannot take a loan!");
        return false;
    }

    public static void main(String[] args) {
        Person person1 = new Bulgarian("Martina", "Alien", "Orthodox", "Bulgarian", "Bulgaria", 28, "Bulgaria", "Business Analyst");

        person1.sayHello();
        person1.isAdult(person1.age);
        person1.isCelebratingEaster(person1.religion);
        person1.canTakeLoan(person1.job);

        Person person2 = new American("Kam", "Female", "Budhist", "Bulgarian", "Bulgaria", 22, "USA", "QA");

        person2.sayHello();
        person2.isAdult(person2.age);
        person2.isCelebratingEaster(person2.religion);
        person2.canTakeLoan(person2.job);

        Person person3 = new Italian("Adriano", "male", "Catholic", "Italian", "Italy", 21, "Italy", "Developer");

        person3.sayHello();
        person3.isAdult(person3.age);
        person3.isCelebratingEaster(person3.religion);
        person3.canTakeLoan(person3.job);

    }
}
