
package agencia;

public class Autos {
    private static int nextId = 1;
    private int id;
    private String marca;
    private String modelo;
    private String color;
    private int km;

    public Autos(String marca, String modelo, String color, int km) {
        this.id = nextId++;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.km = km;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }
}
