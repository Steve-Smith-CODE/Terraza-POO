public class Empleado {
    private String nombre;
    private double salario;
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
    public double calcularBono(){
        return 0.10*salario;
    }
}

class Gerente extends Empleado{
    public Gerente(String nombre, double salario){
        super(nombre, salario);
    }
    @Override
    public double calcularBono(){
        return getSalario() * 0.15;
    }
}

public class Main{
    public static void main(String[] args) {
        Empleado empleado = new Empleado("steve", 3500);
        Gerente gerente = new Gerente("Smith", 8900);
        System.out.println("EMPLEADO: " + empleado.getNombre());
        System.out.println("Salario : "+ empleado.getSalario());
        System.out.println(" Bono: "+ empleado.calcularBono());


        System.out.println("GERENTE: " + gerente.getNombre());
        System.out.println("Salario : "+ gerente.getSalario());
        System.out.println(" Bono: "+ gerente.calcularBono());


    }
}