package Ejercicio2;

public class CuentaBancaria {
    
    public String numeroCuenta; 
    private double saldo;       
    protected String titular;   

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado $" + cantidad + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No se puede retirar más de lo que hay en el saldo.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Saldo actual: $" + saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
