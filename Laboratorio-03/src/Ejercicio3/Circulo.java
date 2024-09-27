package Ejercicio3;

public class Circulo {
    private final double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }
}
