package Ejercicio1;

public class Main {
    public static void main(String[] args) {
    
        Persona persona = new Persona("Juan Pérez", 30, "juan.perez@example.com");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Correo Electrónico: " + persona.getCorreoElectronico());

        persona.setNombre("Ana Gómez");
        persona.setEdad(28);
        persona.setCorreoElectronico("ana.gomez@example.com");

        System.out.println("Nombre modificado: " + persona.getNombre());
        System.out.println("Edad modificada: " + persona.getEdad());
        System.out.println("Correo Electrónico modificado: " + persona.getCorreoElectronico());
    }
}

