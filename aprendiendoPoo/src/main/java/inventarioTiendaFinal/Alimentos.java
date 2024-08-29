
package inventarioTiendaFinal;

public class Alimentos extends Producto implements Descontable{
    private String fechaCaducidad;
    
    public Alimentos(String nombre, double precio, int cantidad,String fechaC){
        super(nombre, precio, cantidad);
        this.fechaCaducidad=fechaC;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    @Override
    public void aplicarDescuento(double porcentaje) {
        this.precio -= this.precio * (porcentaje / 100);
    }
    
    @Override
    public String toString() {
        return "[Producto: "+getNombre()+", precio: "+getPrecio()+", Cantidad: "+getCantidad()+", talla: "+getFechaCaducidad()+"]";
    }
}
