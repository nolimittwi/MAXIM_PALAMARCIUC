package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Anton", "Zalupkin", 28, 2);
        Manager manager2 = new Manager("Nikita", "Memnii", 12, 5);
        Programmer programmer1 = new Programmer("Alexsei", "Lohovskoi", 35, "Java");
        Programmer programmer2 = new Programmer("Vitalii", "Antonov", 25, "Python");

        ArrayList<AttentTraining> attendees = new ArrayList<>();
        attendees.add(manager1);
        attendees.add(manager2);
        attendees.add(programmer1);
        attendees.add(programmer2);

        System.out.println("----------------------------------------");

        Employee[] employees = {manager1, manager2, programmer1, programmer2};
        for (Employee employee : employees
             ) {if (employee instanceof Interview){
            ((Interview) employee).conductInterview();
            System.out.println(employee.toString());
            }
        }
    }
}
