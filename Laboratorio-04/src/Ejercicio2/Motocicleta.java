package Ejercicio2;
abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

class VehiculoMotorizado extends Vehiculo {
    protected int cilindrada;

    // Constructor de VehiculoMotorizado
    public VehiculoMotorizado(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}

class Coche extends VehiculoMotorizado {
    private int numeroPuertas;

    // Constructor de Coche
    public Coche(String marca, String modelo, int cilindrada, int numeroPuertas) {
        super(marca, modelo, cilindrada);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}

class Motocicleta extends VehiculoMotorizado {
    private boolean tieneMaletero;

    // Constructor de Motocicleta
    public Motocicleta(String marca, String modelo, int cilindrada, boolean tieneMaletero) {
        super(marca, modelo, cilindrada);
        this.tieneMaletero = tieneMaletero;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tiene maletero: " + (tieneMaletero ? "Sí" : "No"));
    }
}
