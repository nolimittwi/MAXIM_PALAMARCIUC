package org.example.homework_nr_9;

public class Programmer extends Employee implements AttentTraining{
    private String programmingLanguage;

    public Programmer(String name, String surName, int age, String programmingLanguage) {
        super(name, surName, age);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void AttendTraining() {
        System.out.println("Programmer is Teaching...");
    }
}