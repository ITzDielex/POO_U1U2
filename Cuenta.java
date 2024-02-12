
package cuenta;


import java.util.Scanner;

public class Cuenta {
    // Atributos
    private long numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private double interesAnual;

    // Constructores
    public Cuenta() {
        // Constructor por defecto
    }

    public Cuenta(long dniCliente, double saldoActual, double interesAnual) {
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    // Accesores y mutadores
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    // Método para actualizar el saldo aplicando el interés diario
    public void actualizarSaldo() {
        double interesDiario = interesAnual / 365;
        saldoActual += saldoActual * interesDiario;
    }

    // Método para ingresar una cantidad en la cuenta
    public void ingresar(double cantidad) {
        saldoActual += cantidad;
    }

    // Método para retirar una cantidad de la cuenta
    public void retirar(double cantidad) {
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad;
        } else {
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
        }
    }

    // Método para mostrar todos los datos de la cuenta
    public void mostrarDatos() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: $" + saldoActual);
        System.out.println("Interes anual: " + interesAnual + "%");
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos
        System.out.println("Ingrese el numero de cuenta:");
        long numeroCuenta = scanner.nextLong();

        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = scanner.nextLong();

        System.out.println("Ingrese el saldo actual:");
        double saldoActual = scanner.nextDouble();

        System.out.println("Ingrese el interes anual:");
        double interesAnual = scanner.nextDouble();

        // Crear una instancia de Cuenta con los datos proporcionados por el usuario
        Cuenta cuenta1 = new Cuenta(dniCliente, saldoActual, interesAnual);

        // Actualizar el saldo
        cuenta1.actualizarSaldo();
        System.out.println("Saldo despues de actualizar:");
        System.out.println("Saldo actual: $" + cuenta1.getSaldoActual());

        // Solicitar al usuario si desea realizar una operación adicional
        System.out.println("Desea realizar una operacion adicional? (S/N)");
        String respuesta = scanner.next();

        // Si la respuesta es "S" (sí), solicitar la operación al usuario
        if (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Que operacion desea realizar? (1. Ingresar / 2. Retirar)");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Solicitar al usuario que ingrese una cantidad para ingresar
                    System.out.println("Ingrese la cantidad que desea ingresar:");
                    double cantidadIngreso = scanner.nextDouble();
                    cuenta1.ingresar(cantidadIngreso);
                    break;
                case 2:
                    // Solicitar al usuario que ingrese una cantidad para retirar
                    System.out.println("Ingrese la cantidad que desea retirar:");
                    double cantidadRetiro = scanner.nextDouble();
                    cuenta1.retirar(cantidadRetiro);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            // Mostrar los datos de la cuenta después de realizar la operación
            cuenta1.mostrarDatos();
        }

        // Cerrar el scanner
        scanner.close();
    }
}
