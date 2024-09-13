
package controller;

import dao.EmpleadoDAO;
import java.util.Arrays;
import model.Empleado;


public class EmpleadoService implements IGestionarCRUD{

    @Override
    public void createDB(Object[] pers) {
        System.out.println(pers[1]);
        
        Empleado empl=new Empleado();
        empl.setNombre((String) pers[0]);
        empl.setTelefono((String) pers[1]);
        empl.setDireccion((String) pers[4]);
        empl.setEdad((int) pers[2]);
        empl.setSueldo((double) pers[3]);
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
