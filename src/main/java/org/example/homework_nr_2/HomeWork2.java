package org.example.homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args) {
        String month = "12";
        switch (month) {
            case "1":
                System.out.println("1 -> January");
                break;
            case "2":
                System.out.println("2 -> February");
                break;
            case "3":
                System.out.println("3 -> March");
                break;
            case "4":
                System.out.println("4 -> April");
                break;
            case "5":
                System.out.println("5 -> May");
                break;
            case "6":
                System.out.println("6 -> June");
                break;
            case "7":
                System.out.println("7 -> July");
                break;
            case "8":
                System.out.println("8 -> August");
                break;
            case "9":
                System.out.println("9 -> September");
                break;
            case "10":
                System.out.println("10 -> October");
                break;
            case "11":
                System.out.println("11 -> November");
                break;
            case "12":
                System.out.println("12 -> December");
                break;
            default:
                System.out.println("Please insert right number of the month");
        }
        System.out.println("------------------------------------------------------");

        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("------------------------------------------------------");


        float sum = 0;
        int i = 1;
        while (i <= 97) {
            sum += (float) i / (i + 2);
            i += 2;
        }
        System.out.println(sum);

        System.out.println("------------------------------------------------------");

        String s = "";
        char z ='*';
        for (int x = 1; x <= 9 ; x++) {
            s = s+z;
            System.out.println(s);
        }
}