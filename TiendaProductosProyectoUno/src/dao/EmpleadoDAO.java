
package dao;

import util.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        Conection dbConnect=new Conection();
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        try (Connection cn=dbConnect.getConnection()){
            String query="SELECT * FROM empleado";
            ps=cn.prepareStatement(query);
            rs=ps.executeQuery();
            
            System.out.println("id \tnombre \t\ttelefono \t\tdireccion \t\tedad \t\tsueldo");
            while (rs.next()) {
                System.out.println(rs.getInt("id")+"\t"+rs.getString("nombre")+"\t"+rs.getString("telefono")+"\t"+rs.getString("direccion")+"\t"+rs.getInt("edad")+"\t"+rs.getDouble("sueldo"));
                /*
                System.out.println("id: "+rs.getInt("id"));
                System.out.println("nombre: "+rs.getString("nombre"));
                System.out.println("telefono: "+rs.getString("telefono"));
                System.out.println("direccion: "+rs.getString("direccion"));
                System.out.println("edad: "+rs.getInt("edad"));
                System.out.println("sueldo: "+rs.getDouble("sueldo"));
                System.out.println("----------------");
                */
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
    }
    
    public static void deleteDB(int id){
        
    }
    
    public static void updateDB(Empleado empleado){
        
    }
}
