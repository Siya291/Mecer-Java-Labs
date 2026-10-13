package org.example;

public class TemperatureConversion {


    public void getFahrenheitAndCelcius() {
        double fahrenheit;
        double celsius = 30.52;
        double convCelsius;

        fahrenheit = (celsius * 9 / 5) + 32;
        convCelsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("");
        System.out.println("Converted Celsius value to Fahrenheit is: " + fahrenheit);
        System.out.printf("Converted Fahrenheit value back to Celsius is: %.2f", convCelsius);

    }


}
