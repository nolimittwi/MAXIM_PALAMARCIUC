package org.example.homework_nr_9;

public class Manager extends Employee implements Teaching, Interview{

    public Manager(String name, String surname, int age) {
        super(name, surname, age);
    }
    @Override
    public void Teach(){
        System.out.println("Manager is Teaching");
    }
    @Override
    public void Interview(){
        System.out.println("Manager is Interviewing");
    }
}