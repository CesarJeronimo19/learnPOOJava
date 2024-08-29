
package gestionEmpleados;

public class Empleado {
    private int id;
    private String nombre;
    private double salario;
    
    //Constructor
    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
        
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario=salario;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nSalario: "+salario; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
