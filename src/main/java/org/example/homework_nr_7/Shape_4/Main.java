package org.example.homework_nr_7.Shape_4;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalShape circle = new Circle(5);
        TwoDimensionalShape square = new Square(6);
        ThreeDimensionalShape cube = new Cube(7);
        ThreeDimensionalShape sphere = new Sphere(8);




        System.out.println("Area of Circle = " + circle.calculateArea());
        System.out.println("Area of Square = " + square.calculateArea());
        System.out.println("Area of Cube = " + cube.calculateArea1());
        System.out.println("Area of Sphere = " + sphere.calculateArea1());
    }
}