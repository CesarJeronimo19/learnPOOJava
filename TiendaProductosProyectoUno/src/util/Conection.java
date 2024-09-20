
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    public Connection getConnection(){
        Connection cn=null;
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendadb","root","");
            if(cn != null){
                //System.out.println("Conexion exitosa");
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        return cn;
    }
}
