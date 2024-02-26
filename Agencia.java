package agencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {
    public static void main(String[] args) {
        ArrayList<Autos> autos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Agregar nuevo auto");
            System.out.println("2. Mostrar autos de la marca Ford");
            System.out.println("3. Mostrar autos con modelos mayores a 2015");
            System.out.println("4. Mostrar autos por color");
            System.out.println("5. Mostrar todos los autos");
            System.out.println("6. Salir");

            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del auto: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo del auto: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el color del auto: ");
                    String color = scanner.nextLine();
                    System.out.print("Ingrese el año del modelo del auto: ");
                    int año = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    autos.add(new Autos(marca, modelo, color, año));
                    break;
                case 2:
                    System.out.println("Autos de la marca Ford:");
                    for (Autos auto : autos) {
                        if (auto.getMarca().equalsIgnoreCase("Ford")) {
                            System.out.println("ID: " + auto.getId() + ", Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Color: " + auto.getColor() + ", Kilómetros: " + auto.getKm());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Autos con modelos mayores a 2015:");
                    for (Autos auto : autos) {
                        if (auto.getModelo().compareTo("2015") > 0) {
                            System.out.println("ID: " + auto.getId() + ", Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Color: " + auto.getColor() + ", Kilómetros: " + auto.getKm());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el color del auto que busca: ");
                    String colorBuscado = scanner.nextLine();
                    System.out.println("Autos de color " + colorBuscado + ":");
                    for (Autos auto : autos) {
                        if (auto.getColor().equalsIgnoreCase(colorBuscado)) {
                            System.out.println("ID: " + auto.getId() + ", Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Color: " + auto.getColor() + ", Kilómetros: " + auto.getKm());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Todos los autos registrados:");
                    for (Autos auto : autos) {
                        System.out.println("ID: " + auto.getId() + ", Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Color: " + auto.getColor() + ", Kilómetros: " + auto.getKm());
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
