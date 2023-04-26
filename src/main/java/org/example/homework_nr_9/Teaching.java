package org.example.homework_nr_9;

public interface Teaching {
    default void teach(){
        System.out.println("Employee is teaching");
    }

    void Teach();
}