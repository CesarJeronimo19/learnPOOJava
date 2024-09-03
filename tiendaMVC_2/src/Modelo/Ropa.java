
package Modelo;

public class Ropa extends Producto{
    
    private String color;
    private double talla;
    private String marca;
    
    public Ropa(int id, String nombre, double precio, String color, double talla, String marca) {
        super(id, nombre, precio);
        this.color=color;
        this.talla=talla;
        this.marca=marca;
    }

    public String getColor() {
        return color;
    }

    public double getTalla() {
        return talla;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Ropa{" +super.toString()+ " color=" + color + ", talla=" + talla + ", marca=" + marca + '}';
    }
    
    
    
}
