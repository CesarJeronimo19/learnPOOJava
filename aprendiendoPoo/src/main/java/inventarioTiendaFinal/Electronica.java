
package inventarioTiendaFinal;

public class Electronica extends Producto implements Descontable{
    private String garantia;
    
    public Electronica(String nombre, double precio, int cantidad, String garantia) {
        super(nombre, precio, cantidad);
        this.garantia=garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    
    @Override
    public void aplicarDescuento(double porcentaje) {
        this.precio -= this.precio * (porcentaje / 100);
    }
    
    @Override
    public String toString() {
        return "[Producto: "+getNombre()+", precio: "+getPrecio()+", Cantidad: "+getCantidad()+", garantia: "+getGarantia()+"]";
    }
}
