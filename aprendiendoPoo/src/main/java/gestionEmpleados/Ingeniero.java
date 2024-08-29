
package gestionEmpleados;

public class Ingeniero extends Empleado{
    private String especialidad;
    
    public Ingeniero(String nombre, double salario){
        super(nombre, salario);
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
}
