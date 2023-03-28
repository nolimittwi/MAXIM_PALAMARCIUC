package org.example.homework_nr_3;
class Circle{
    float radius;
    public Circle(float radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (Math.PI *radius*radius);
    }
    public static void main(String[] args) {
        Circle ABC = new Circle(5);
        double square = ABC.calculateArea();
        System.out.println(square);
    }
}