package Ejercicio1;
public class Main {
    public static void main(String[] args) {
        // Crear un empleado regular con bono del 10%
        Empleado empleado = new Empleado("Juan Pérez", 3000) {
            // Esto es necesario porque Empleado es abstracto, así que se necesita una implementación anónima
        };
        System.out.println("Empleado: " + empleado.getNombare());
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Bono: $" + empleado.calcularBono());

        System.out.println(); // Separador

        // Crear un gerente con bono del 15%
        Gerente gerente = new Gerente("Ana Gómez", 5000);
        System.out.println("Gerente: " + gerente.getNombare());
        System.out.println("Salario: $" + gerente.getSalario());
        System.out.println("Bono: $" + gerente.calcularBono());
    }
}
