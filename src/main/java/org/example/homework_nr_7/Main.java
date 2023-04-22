package org.example.homework_nr_7;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Max", "Moldova");
        Staff staff1 = new Staff("Alex", "Chisinau", "Gogol", 22.5);
        Student student1 = new Student("Vitea", "Ciocana", "Bachelors", 2, 7000.0);



        person1.toString();
        System.out.println(person1);
        System.out.println(staff1);
        System.out.println(student1);
    }
}