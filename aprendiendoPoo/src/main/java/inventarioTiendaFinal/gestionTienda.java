
package inventarioTiendaFinal;

import java.util.ArrayList;
import java.util.List;

public class gestionTienda {
    List<Producto>prod;
    public gestionTienda(){
        prod=new ArrayList<>();
    }
    
    public void addProducto(Producto p){
        this.prod.add(p);
    }
    
    public void eliminarProducto(int i){
        System.out.println("Elinando el producto "+(i+1));
        this.prod.remove(i);
    }
    
        public void aplicarDescuento(double porcentaje) {
        for (Producto producto : prod) {
            if (producto instanceof Descontable) {
                ((Descontable) producto).aplicarDescuento(porcentaje);
            }
        }
    }
    
    public void listarProductos(){
        for(Producto pro:prod){
            System.out.println(pro.toString());
        }
    }
}
