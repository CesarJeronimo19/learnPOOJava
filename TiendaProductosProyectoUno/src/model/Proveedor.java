
package model;

public class Proveedor extends Persona{
    private String marca;

    public Proveedor() {
    }

    public Proveedor(String nombre, String telefono, String direccion, int estatus, String marca) {
        super(nombre, telefono, direccion, estatus);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
