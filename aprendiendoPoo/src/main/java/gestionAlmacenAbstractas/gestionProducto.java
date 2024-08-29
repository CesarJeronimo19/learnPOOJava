
package gestionAlmacenAbstractas;

import java.util.*;

public class gestionProducto {
    private List<Producto>producto;

    public gestionProducto() {
        producto=new ArrayList<>();
    }
    
    public void addProducto(Producto p){
        this.producto.add(p);
    }
    
    public void listarProductos(){
        for(Producto producto:producto){
            System.out.println(producto.toString());
        }
    }
    
}
