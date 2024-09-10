
package model;

public class Empleado extends Persona{
    private int Edad;
    private double sueldo;
    
    public Empleado(){
    }

    public Empleado(String nombre, String telefono, String direccion, int estatus, int Edad, double sueldo) {
        super(nombre, telefono, direccion, estatus);
        this.Edad = Edad;
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
