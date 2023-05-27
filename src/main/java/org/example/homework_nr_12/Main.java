package org.example.homework_nr_12;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        // Создание объектов типа Employee и добавление их в список
        Employee employee1 = new Employee("John", "Doe", 30, true, false);
        employeeList.add(employee1);

        Employee employee2 = new Employee("Jane", "Smith", 25, false, true);
        employeeList.add(employee2);

        Employee employee3 = new Employee("Michael", "Johnson", 20, true, true);
        employeeList.add(employee3);

        Employee employee4 = new Employee("Emily", "Davis", 28, false, false);
        employeeList.add(employee4);

        Employee employee5 = new Employee("David", "Wilson", 32, true, true);
        employeeList.add(employee5);

        Employee employee6 = new Employee("Olivia", "Taylor", 27, true, false);
        employeeList.add(employee6);

        Employee employee7 = new Employee("James", "Brown", 31, false, true);
        employeeList.add(employee7);

        Employee employee8 = new Employee("Sophia", "Miller", 29, true, false);
        employeeList.add(employee8);

        Employee employee9 = new Employee("Benjamin", "Anderson", 33, false, true);
        employeeList.add(employee9);

        Employee employee10 = new Employee("Ava", "Thomas", 26, true, true);
        employeeList.add(employee10);

        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Surname: " + employee.getSurname());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Is Payed by Hour: " + employee.getPayedByHour());
            System.out.println("Can Conduct Interview: " + employee.getCanConductInterview());

            System.out.println("------------------------------------");

        }
        employeeList.stream()
                .filter(employee -> employee.getCanConductInterview() && employee.getAge() > 25 && employee.getPayedByHour())
                .limit(5)
                .forEach(employee -> {
                    System.out.println("Name: " + employee.getName() + " ");
                    System.out.println("Surname: " + employee.getSurname() + " ");
                    System.out.println("Age: " + employee.getAge() + " ");
                    System.out.println("Is Payed by Hour: " + employee.getPayedByHour() + " ");
                    System.out.println("Can Conduct Interview: " + employee.getCanConductInterview() + " ");
                });

        System.out.println("------------------------------------");

        employeeList.stream()
                .filter(employee -> !employee.getPayedByHour() && employee.getAge() > 30)
                .sorted()
                .collect(Collectors.toList())
                .forEach(employee -> {
                    System.out.println("Name: " + employee.getName() + " ");
                    System.out.println("Surname: " + employee.getSurname() + " ");
                    System.out.println("Age: " + employee.getAge() + " ");
                    System.out.println("Is Payed by Hour: " + employee.getPayedByHour() + " ");
                    System.out.println("Can Conduct Interview: " + employee.getCanConductInterview() + " ");
                });

        System.out.println("------------------------------------");

        Optional<Employee> firstEmployee = employeeList.stream()
                .filter(employee -> employee.getCanConductInterview() && employee.getPayedByHour())
                .findFirst();

        if (firstEmployee.isPresent()){
            Employee employee = firstEmployee.get();
            System.out.println("Fisrt employee who can conduct interview and is payed by hours");
            System.out.println("Name: " + employee.getName() + " ");
            System.out.println("Surname: " + employee.getSurname() + " ");
            System.out.println("Age: " + employee.getAge() + " ");
            System.out.println("Is Payed by Hour: " + employee.getPayedByHour() + " ");
            System.out.println("Can Conduct Interview: " + employee.getCanConductInterview() + " ");
        } else {
            System.out.println("Employee was not found!");
        }

        System.out.println("------------------------------------");

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSurname))
                .forEach(employee -> System.out.println(employee.toString()));

        System.out.println("------------------------------------");

    }
}