package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("Juan Pérez", "123456789", 1000.0);
        System.out.println("Saldo inicial: $" + miCuenta.consultarSaldo());

        miCuenta.depositar(500.0);
        miCuenta.retirar(2000.0);
        miCuenta.retirar(300.0);

        System.out.println("Saldo final: $" + miCuenta.consultarSaldo());
    }
}