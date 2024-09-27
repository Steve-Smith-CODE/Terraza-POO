public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularBono() {
        return 0.10 * salario;
    }
}

class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.15;
    }
}
