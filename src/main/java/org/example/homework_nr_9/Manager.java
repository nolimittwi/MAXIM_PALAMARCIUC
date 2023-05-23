package org.example.homework_nr_9;

public class Manager extends Employee implements AttentTraining, Interview{
    private int teamSize;

    public Manager(String name, String surName, int age, int teamSize) {
        super(name, surName, age);
        this.teamSize = teamSize;
    }
    @Override
    public void conductInterview() {
        System.out.println("Manager is conducting an Interview...");
    }

    @Override
    public void AttendTraining() {
        System.out.println("Manager is Teaching...");
    }
}