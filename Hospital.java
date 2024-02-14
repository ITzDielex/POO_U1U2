
package hospital;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primer objeto: pide por teclado
        System.out.println("Ingrese los datos del primer paciente:");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Sexo (H/M): ");
        char sexo1 = scanner.nextLine().charAt(0);
        System.out.print("Peso: ");
        double peso1 = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura1 = scanner.nextDouble();
        scanner.nextLine();

        Paciente paciente1 = new Paciente(nombre1, edad1, null, sexo1, peso1, altura1);
        paciente1.generaDNI(); 
        paciente1.calcularIMC();
        System.out.println("Es mayor de edad: " + paciente1.mayorDeEdad());
        paciente1.muestraDatos();

        // Segundo objeto: pide por teclado excepto peso y altura
        System.out.println("\nIngrese los datos del segundo paciente (excepto peso y altura):");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Sexo (H/M): ");
        char sexo2 = scanner.nextLine().charAt(0);

        Paciente paciente2 = new Paciente(nombre2, edad2, sexo2); // Crea paciente sin peso ni altura
        paciente2.calcularIMC();
        System.out.println("Es mayor de edad: " + paciente2.mayorDeEdad());
        paciente2.muestraDatos();
        
        // Tercer objeto: constructor con nombre, edad y sexo
        Paciente paciente3 = new Paciente("Juan", 25, 'H');
        paciente3.setPeso(70.5);
        paciente3.setAltura(1.75);

        System.out.println("\nDatos del tercer paciente:");
        paciente3.calcularIMC();
        System.out.println("Es mayor de edad: " + paciente3.mayorDeEdad());
        paciente3.muestraDatos();

        scanner.close();
    }
}