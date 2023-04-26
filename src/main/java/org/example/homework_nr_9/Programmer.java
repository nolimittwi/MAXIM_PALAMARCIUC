package org.example.homework_nr_9;

public class Programmer extends Employee implements Teaching{
    String programmingLanguage;

    public Programmer(String name, String surname, int age, String programmingLanguage) {
        super(name, surname, age);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void Teach(){
        System.out.println("Programmer is Teaching");
    }
}
