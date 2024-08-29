
package inventarioTiendaFinal;

public class tiendaMain {
    public static void main(String[] args) {
        gestionTienda gt=new gestionTienda();
        Producto p1=new Alimentos("Pollo", 130.0, 5, "2025-05-01");
        Producto p2=new Ropa("Pantalon", 320.0, 3, 36.0, "Negro");
        Producto p3=new Ropa("Pantalon", 320.0, 3, 36.0, "Veige");
        Producto p4=new Electronica("iphone 16", 32000, 3, "Si");
        
        gt.addProducto(p1);
        gt.addProducto(p2);
        gt.addProducto(p3);
        gt.addProducto(p4);
        
        gt.listarProductos();
        
        gt.eliminarProducto(2);
        
        gt.aplicarDescuento(10);
        
        gt.listarProductos();
    }
}
