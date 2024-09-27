package Ejercicio1;
public class CuentaBancaria {
    // Atributos
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor que inicializa los atributos
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se ha depositado $" + cantidad + " en la cuenta " + numeroCuenta + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("La cantidad depositada debe ser positiva.");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No hay saldo suficiente en la cuenta para realizar el retiro.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        } else {
            saldo -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + ". Saldo actual: $" + saldo);
        }
    }

    // Método para consultar el saldo de la cuenta
    public double consultarSaldo() {
        return saldo;
    }

    // Getters y Setters
    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
