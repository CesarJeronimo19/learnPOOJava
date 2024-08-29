
package gestionEmpleados;

public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double salario){
        super(nombre,salario);
    }
    
    private void setDepartamento(String departamento){
        this.departamento=departamento;
    }
    
    private String getDepartamento(){
        return departamento;
    }
    
}
