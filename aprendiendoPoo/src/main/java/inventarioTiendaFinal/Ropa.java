
package inventarioTiendaFinal;

public class Ropa extends Producto implements Descontable{
    private double talla;
    private String color;
    
    public Ropa(String nombre, double precio, int cantidad, double talla,String color){
        super(nombre, precio, cantidad);
        this.talla=talla;
        this.color=color;
    }
    
    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.precio -= this.precio * (porcentaje / 100);
    }

    @Override
    public String toString() {
        return "[Producto: "+getNombre()+", precio: "+getPrecio()+", Cantidad: "+getCantidad()+", talla: "+getTalla()+", color: "+getColor()+"]";
    }
    
}
