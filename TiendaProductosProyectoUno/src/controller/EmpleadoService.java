
package controller;

import dao.EmpleadoDAO;
import java.util.Arrays;
import java.util.Scanner;
import model.Empleado;


public class EmpleadoService implements IGestionarCRUD{
    Scanner sc=new Scanner(System.in);
    @Override
    public void createDB() {
        
        Empleado empl=new Empleado();
        System.out.println("Ingresa el nombre");
            String nombre=sc.next();
                empl.setNombre(nombre);
            
        System.out.println("Ingresa el telefono");
            String telefono=sc.next();
                empl.setTelefono(telefono);
                
        System.out.println("Ingresa la direccion");
            String dir=sc.next();
                empl.setDireccion(dir);
                
        System.out.println("Ingresa la edad");
            int edad=sc.nextInt();
                empl.setEdad(edad);
                
        System.out.println("Ingresa el sueldo");
            double sueldo=sc.nextDouble();
                empl.setSueldo(sueldo);
        empl.setEstatus(1);
        
        EmpleadoDAO.createDB(empl);
    }

    @Override
    public void listDB() {
        EmpleadoDAO.listDB();
    }

    @Override
    public void deleteDB(int id) {
    }

    @Override
    public void updateDB(Object[] pers) {
    }
    
}
