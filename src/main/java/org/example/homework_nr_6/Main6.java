package org.example.homework_nr_6;

public class Main6 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("TV", "LED", 1,2499.9);
        Date date = new Date(19,8,2002);
        invoice.getAmount();
        invoice.printResult();

        date.displayDate();
    }
}
