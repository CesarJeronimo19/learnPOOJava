
package gestionAlmacenAbstractas;

public class almacenAbstracto {
    public static void main(String[] args) {
        gestionProducto gp=new gestionProducto();
        
        Producto p1=new ProductoPerecedero("Carne roja", 153.0, 10, "24-08-20");
        Producto p2=new ProductoPerecedero("Carne de pollo", 125.5, 10, "24-08-20");
        Producto p3=new ProductoNoPerecedero("Atun", 23.5, 3, "Si");
        Producto p4=new ProductoNoPerecedero("Cocacola", 18.5, 12, "No");

        gp.addProducto(p1);
        gp.addProducto(p2);
        gp.addProducto(p3);
        gp.addProducto(p4);
        
        //ventas
        
        p1.calcularPrecioFinal(2);
        p2.calcularPrecioFinal(1);
        p3.calcularPrecioFinal(4);
        p4.calcularPrecioFinal(15);
        
        gp.listarProductos();
    }

    
}
