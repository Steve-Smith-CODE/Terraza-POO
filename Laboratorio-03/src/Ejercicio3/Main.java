package Ejercicio3;

public class Main{
    public static void main(String[] args) {
        // Crear una instancia de Circulo con radio de 5.0
        Circulo circulo = new Circulo(5.0);

        // Calcular y mostrar el área del círculo
        System.out.println("Área del círculo con radio 5.0: " + circulo.calcularArea());

        // Intentar obtener el radio (que es final)
        System.out.println("Radio del círculo: " + circulo.getRadio());
    }
}
