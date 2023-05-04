package org.example.homework_nr_8;

public class Elephant extends Herbivor implements Animal {

    @Override
    public void swallow() {
        Animal.super.swallow();
    }

    @Override
    public void run() {
        System.out.println("Animal is Running");
    }

    @Override
    public void bite() {
        System.out.println("Animal is Biting");
    }

    @Override
    int legs() {
        return 4;
    }
}
