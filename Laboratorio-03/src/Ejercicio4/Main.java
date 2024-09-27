package Ejercicio4;

public class Main{
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = Utilidades.convertirCelsiusAFahrenheit(celsius);
        System.out.println(celsius + "°C en Fahrenheit: " + fahrenheit);

        double fahrenheitTemp = 77.0;
        double celsiusTemp = Utilidades.convertirFahrenheitACelsius(fahrenheitTemp);
        System.out.println(fahrenheitTemp + "°F en Celsius: " + celsiusTemp);
    }
}
