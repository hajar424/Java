import java.util.Scanner;

/**
 * Created by hajar on 2016-06-08.
 */
public class converter {
    public static void main(String[] args) {
        System.out.println("Would you like to convert Celsius to Fahrenheit or contrariwise ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        Scanner SC = new Scanner(System.in);
        int value = SC.nextInt();
        switch (value) {
            case 1:
                convertCelsiusToFahrenheit();
                ;
                break;
            case 2: convertFahrenheitCelsius();
        }
    }
    public static void convertCelsiusToFahrenheit() {
        System.out.println("Celsius to Fahrenheit");
        System.out.println("Whats the Celsius:");
        Scanner SC = new Scanner(System.in);
        Double Celsius = SC.nextDouble();
        Double result = (1.8)* Celsius+32.0;
        System.out.println("The Fahrenheit is: " + result + " if the Celsius is " + Celsius );
    }

    public static void convertFahrenheitCelsius() {
        System.out.println("Fahrenheit To Celsius");
        System.out.println("Whats the Fahrenheit:");
        Scanner SC = new Scanner(System.in);
        Double Fahrenheit = SC.nextDouble();
        Double result = (Fahrenheit-32.0)/(1.8);
        System.out.println("The Celsius is: " + result + " if the Fahrenheit is  " + Fahrenheit );
    }
}
