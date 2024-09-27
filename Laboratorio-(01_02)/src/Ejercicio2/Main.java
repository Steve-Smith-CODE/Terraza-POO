package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double suma = calculadora.sumar(10, 5);
        double resta = calculadora.restar(10, 5);
        double multiplicacion = calculadora.multiplicar(10, 5);
        double division = calculadora.dividir(10, 4); // Intento de división por cero

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
