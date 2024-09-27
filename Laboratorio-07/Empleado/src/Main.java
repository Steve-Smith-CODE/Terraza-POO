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