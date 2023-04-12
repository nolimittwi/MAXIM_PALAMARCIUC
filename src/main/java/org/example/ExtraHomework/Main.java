package org.example.ExtraHomework;

public class Main {
    public static void main(String[] args) {
        JavaClock ABC = new JavaClock(12,0,0);
        JavaClock ABCD = new JavaClock(3,20,30);

        ABC.addClock(ABCD);

        ABC.substractClock(ABC);
        ABC.printHour();
//        ABC.printHour();
//
//        ABC.getHours();
//
//        ABC.setHours(5);
//
//
//        ABC.printHour();
//        ABC.tick();
//       ABC.addTime();

//        ABC.printHour();
//        ABC.addClock();
    }
}