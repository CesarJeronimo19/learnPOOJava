
package Modelo;

public class TareaModelo {
    private String nombre;
    private String descripcion;
    private boolean completada;
    
    public TareaModelo(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.completada=completada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }
    
    public void completar(){
        this.completada=true;
    }
    
    public String toString(){
        return nombre + " - " + (completada ? "Completada" : "Pendiente");
    }
}
