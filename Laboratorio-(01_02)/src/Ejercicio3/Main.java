package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Empleado
        Empleado empleado = new Empleado("Ana Gómez", 50000.0, "Recursos Humanos");

        // Consultar y mostrar los atributos del empleado
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Departamento: " + empleado.getDepartamento());

        // Modificar los atributos del empleado
        empleado.setNombre("Ana Martínez");
        empleado.setSalario(55000.0);
        empleado.setDepartamento("Finanzas");

        // Mostrar los atributos modificados
        System.out.println("Nombre actualizado: " + empleado.getNombre());
        System.out.println("Salario actualizado: $" + empleado.getSalario());
        System.out.println("Departamento actualizado: " + empleado.getDepartamento());
    }
}
