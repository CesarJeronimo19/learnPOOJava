
package gestionAlmacenAbstractas;

public class ProductoNoPerecedero extends Producto {
    private String garantia;
    
    public ProductoNoPerecedero(){
    }
    
    public ProductoNoPerecedero(String nombre,double precio, int cantidad, String garantia){
        super(nombre, precio, cantidad);
        this.garantia=garantia;
    }

    @Override
    public double calcularPrecioFinal(int cantidad) {
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

        @Override
    public String toString() {
        return "[Nombre: "+getNombre()+", Precio: "+getPrecio()+", Cantidad: "+getCantidadStock()+", Garantia: "+this.garantia+"]";
    }
    
    
}
