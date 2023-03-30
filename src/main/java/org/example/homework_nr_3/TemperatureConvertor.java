package org.example.homework_nr_3;

class TemperatureConvertor{
    double Celsium;
    double Fahrenheit;

    public TemperatureConvertor(double celsium, double fahrenheit) {
        this.Celsium = celsium;
        this.Fahrenheit = fahrenheit;
    }
    public double toCelsius(){
        return (Fahrenheit - 32) * 5 / 9;
    }
    public double toFahrenheit(){
        return Celsium*9/5+32;
    }

    public static void main(String[] args) {
        TemperatureConvertor New = new TemperatureConvertor(50,100);
        double Cel = New.toCelsius();
        double Fah = New.toFahrenheit();
        System.out.println(Cel);
        System.out.println(Fah);
    }
}