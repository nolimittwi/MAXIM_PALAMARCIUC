package org.example.homework_nr_8;

public interface Animal {
    default void swallow(){
        System.out.println("Animal is Swallowing");
    };
    static void breathe(){
        System.out.println("Animal is Breathing");
    };
    void run();
    void bite();
}
