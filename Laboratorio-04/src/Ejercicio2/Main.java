package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 1600, 4);
        System.out.println("Información del coche:");
        coche.mostrarInfo();

        System.out.println(); 
        
        Motocicleta moto = new Motocicleta("Yamaha", "MT-07", 689, true);
        System.out.println("Información de la motocicleta:");
        moto.mostrarInfo();
    }
}
