package org.example.homework_nr_7.Shape_4;

public class Circle extends TwoDimensionalShape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
