package com.lectureseven;

public class Car {
    String carName;
    String color;
    int year;
    int horsePower;
    boolean secondHandTick;

    public Car(String carName, String color, int year, int horesPower, boolean secondHandTick) {
        this.carName = carName;
        this.color = color;
        this.year = year;
        this.horsePower = horesPower;
        this.secondHandTick = secondHandTick;
    }

    public Car(String carName, String color, boolean secondHandTick) {
        this.carName = carName;
        this.color = color;
        this.secondHandTick = secondHandTick;
        year = -1;
        this.horsePower = -1;
    }

    public Car(String carName, String color, int year, int horesPower) {
        this.carName = carName;
        this.color = color;
        this.year = year;
        this.horsePower = horesPower;
        secondHandTick = false;
    }

    public Car(String carName, int year, int horesPower, boolean secondHandTick) {
        this.carName = carName;
        this.year = year;
        this.horsePower = horesPower;
        this.secondHandTick = secondHandTick;
        color = "N/A";
    }

    public Car() {
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        Car myMazdaCar = new Car("Mazda", "Red", true);
        Car myFordCar = new Car("Ford", "Blue", 2005, 120);
        Car myWVCar = new Car("WV", "Green", 2005, 120);

        System.out.println(myMazdaCar.color);
        System.out.println(myFordCar.secondHandTick);
    }


}
