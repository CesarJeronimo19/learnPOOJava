
package gestionAlmacenAbstractas;

public class ProductoPerecedero extends Producto{
    private String fechaCaducidad;
    
    public ProductoPerecedero(){
    }
    
    public ProductoPerecedero(String nombre, double precio, int cantidad,String fecha){
        super(nombre, precio, cantidad);
        this.fechaCaducidad=fecha;
    }
    
    public double calcularPrecioFinal(int cantidad){
        int nuevoStock=0;
        if(cantidad>getCantidadStock()){
            System.out.println("Pon otra cantidad porque no tenemos tant@: "+nombre);
            return 0;
        }else{
            nuevoStock=getCantidadStock()-cantidad;
            setCantidadStock(nuevoStock);
            return getPrecio()*cantidad;
        }
    }
    
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "[Nombre: "+getNombre()+", Precio: "+getPrecio()+", Cantidad: "+getCantidadStock()+", FechaCaducidad: "+this.fechaCaducidad+"]";
    }
    
    
}
