package com.lecture8.task1;


public class Square extends Shape {
    @Override
    Double getArea(double d) {
        return d * d;
    }

    @Override
    Double getPerimeter(double d) {
        return 4 * d;
    }
}
