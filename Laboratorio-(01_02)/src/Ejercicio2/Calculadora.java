package Ejercicio2;

public class Calculadora{
    public double sumar(double num1, double num2){
        return num1 + num2;
    }
    public double restar(double num1, double num2){
        return num1 - num2;
    }
    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public double dividir(double num1, double num2){
        if (num2 == 0){
            System.out.println("ERROR: No se puede dividr por cero. ");
            return Double.NaN;
            
        }
        return num1 / num2;
    }
}