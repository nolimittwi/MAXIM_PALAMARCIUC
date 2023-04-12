package org.example.ExtraHomework;

import java.time.Clock;

public class JavaClock {
    public int hours;
    public int minutes;
    public int seconds;

    // 1 Конструктор выдающий значения по умолчанию 12:0:0
    public JavaClock(){
        this.hours = 12;
        this.minutes = 50;
        this.seconds = 0;
    }
    // 2 Конструктор с тремя параметрами
    public JavaClock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    // 3 Конструктор с одним параметром: значение времени в секундах с полуночи
    public JavaClock( int SecondsFromMidnight){

    }

    // Методы
    // 1 Метод с одним параметром в секундах с полуночи
    void setClock(){
        int SecondsFromMidnight;
    }

    // 2 Методы без параметров, которые возвращают значения
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }

    // 3 Методы с одним параметром, каждый из которых устанавливает соответсвтующие переменные
    public void setHours(int hours){
        hours = 2;
        System.out.println(hours);
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
        System.out.println(minutes);
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
        System.out.println(seconds);
    }

    // 4 Метод без параметров, который увеличивает время, хранящееся в обьекте Clock на одну секунду
    public void tick(){
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 24){
            hours = 0;
            }
    }
    public void tickDown(){
        seconds--;
        if (seconds < 0){
            seconds = 59;
            minutes --;
        }
        if (minutes < 0){
            minutes = 59;
            hours --;
        }
        if (hours < 0){
            minutes = 59;
            seconds = 59;
            hours = 0;
        }
    }

    // 5 метод принимающий в качестве параметра обьект типа Clock
    public void addClock(JavaClock inputClock) {


        this.seconds += inputClock.getSeconds();
        this.minutes += inputClock.getMinutes();
        this.hours += inputClock.getHours();

        if (this.seconds >= 60){
            this.seconds = 0;
            this.minutes ++;
        }
        if (this.minutes >= 60){
            this.minutes = 0;
            this.hours ++;
        }
        if (this.hours >= 24){
            this.hours = 0;
        }

    }
    public int substractClock(JavaClock Clock){
        int totalSeconds1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int totalSeconds2 = Clock.hours * 3600 + Clock.minutes * 60 + Clock.seconds;
        return (totalSeconds1 - totalSeconds2);
    }

    void printHour(){
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}