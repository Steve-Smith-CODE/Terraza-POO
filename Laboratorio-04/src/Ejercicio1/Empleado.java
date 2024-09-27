package Ejercicio1;
abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularBono() {
        return salario * 0.10;
    }

    public String getNombare() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}

class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }
    @Override
    public double calcularBono() {
        return salario * 0.15;
    }
}

