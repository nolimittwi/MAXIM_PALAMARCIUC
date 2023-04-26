package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Anton", "Zalupkin", 28);
        Manager manager2 = new Manager("Nikita", "Memnii", 12);
        Programmer programmer1 = new Programmer("Alexsei", "Lohovskoi", 35, "Java");
        Programmer programmer2 = new Programmer("Vitalii", "Antonov", 25, "Python");

        ArrayList<Employee> AttenTraining = new ArrayList<>();

        AttenTraining.add(manager1);
        AttenTraining.add(manager2);
        AttenTraining.add(programmer1);
        AttenTraining.add(programmer2);

        for (Employee employee : AttenTraining) {
            System.out.println("Attendant - " + employee.getName() + " " + employee.getSurname() + " - Age - " + employee.getAge());
        }
        System.out.println("-------------------");

        Employee[] employees = {manager1, manager2, programmer1, programmer2};

        for (Employee e : employees) {
            System.out.printf("Name: " + e.getName() + " ");
            System.out.printf("Surname: " + e.getSurname() + " ");
            System.out.printf("Age: " + e.getAge() + " ");
            System.out.println("");
        }
    }
}