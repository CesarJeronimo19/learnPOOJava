
package dao;

import util.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Empleado;

public class EmpleadoDAO {
    public static void createDB(Empleado empleado){
        Conection dbConnect=new Conection();
        try (Connection conexion=dbConnect.getConnection()){
            PreparedStatement ps=null;
            try {
                String query="INSERT INTO empleado (id, nombre, telefono, direccion, edad, sueldo, estatus) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
                ps=conexion.prepareStatement(query);
                ps.setString(1, empleado.getNombre());
                ps.setString(2, empleado.getTelefono());
                ps.setString(3, empleado.getDireccion());
                ps.setInt(4, empleado.getEdad());
                ps.setDouble(5, empleado.getSueldo());
                ps.setInt(6, empleado.getEstatus());
                ps.executeUpdate();
                System.out.println("El empleado fue creado");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    public static void listDB(){
        
    }
    
    public static void deleteDB(int id){
        
    }
    
    public static void updateDB(Empleado empleado){
        
    }
}
