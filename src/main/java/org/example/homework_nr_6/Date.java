package org.example.homework_nr_6;

class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 || day < 30){
            this.day = day;
        } else {
            this.day = 0;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 || month < 12){
            this.month = month;
        } else {
            this.month = 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0 || year < 2023){
            this.year = year;
        } else {
            this.year = 0;
        }
    }
    public void displayDate() {
        System.out.println(day + ":" + month + ":" + year);
    }
}