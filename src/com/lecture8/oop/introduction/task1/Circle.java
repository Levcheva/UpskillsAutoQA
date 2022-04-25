package com.lecture8.task1;


public class Circle extends Shape {

    @Override
    Double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    Double getPerimeter(double radius) {
        return (2 * Math.PI * radius);
    }
}
