
package gestionAlmacenAbstractas;

public abstract class Producto {

    protected String nombre;
    protected double precio;
    protected int cantidadStock;
    
    public Producto(){
    }
    
    public Producto(String nombre, double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidadStock=cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
    public abstract double calcularPrecioFinal(int cantidad);
    
}
