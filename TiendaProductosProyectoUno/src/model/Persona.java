
package model;

public abstract class Persona {
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private int estatus;
    
    public Persona(){
    }

    public Persona(String nombre, String telefono, String direccion, int estatus) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estatus = estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    
}
