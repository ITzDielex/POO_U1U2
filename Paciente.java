
package hospital;

import java.util.Scanner;

class Paciente {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    // Constructor por defecto
    public Paciente(String nombre1, int edad1, char sexo1, double peso1, double altura1) {}

    // Constructor con nombre, edad y sexo
    public Paciente(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.generaDNI();
    }

    // Constructor con todos los atributos como parámetro
    public Paciente(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20)
            System.out.println("El paciente esta por debajo de su peso ideal.");
        else if (imc >= 20 && imc <= 25)
            System.out.println("El paciente esta en su peso ideal.");
        else
            System.out.println("El paciente tiene sobrepeso.");
    }

    public boolean mayorDeEdad() {
        return edad >= 18;
    }

    public void muestraDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + DNI);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
    }

    public void generaDNI() {
        // Genera un número aleatorio de 8 cifras
        StringBuilder dni = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            dni.append((int) (Math.random() * 10));
        }
        this.DNI = dni.toString();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
