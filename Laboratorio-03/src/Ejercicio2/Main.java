package Ejercicio2;

public class Main{
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", "Juan Pérez", 1000.0);
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cuenta.depositar(500.0);
        cuenta.retirar(2000.0);
        cuenta.retirar(300.0);

        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}
