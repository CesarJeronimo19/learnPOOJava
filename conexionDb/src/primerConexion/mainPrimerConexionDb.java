
package primerConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mainPrimerConexionDb {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/ejemploDB";
        String username = "root";
        String password ="";
        
        try {
            Connection cn = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado");
            Statement stmt = cn.createStatement();
            String query = "SELECT * FROM usuarios";
            ResultSet rs = stmt.executeQuery(query);
            // Procesar los resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
            }

            // Cerrar la conexión
            rs.close();
            rs.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("No conectado "+ e);
        }
    }
}
