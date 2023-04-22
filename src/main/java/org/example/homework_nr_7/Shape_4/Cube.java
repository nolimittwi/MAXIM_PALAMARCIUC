package org.example.homework_nr_7.Shape_4;

public class Cube extends ThreeDimensionalShape{
    int length;

    public Cube(int length) {
        this.length = length;
    }
    @Override
    public double calculateArea1() {
        return 6 * (length * length);
    }
}
