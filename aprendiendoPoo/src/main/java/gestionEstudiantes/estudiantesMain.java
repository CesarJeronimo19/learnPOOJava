
package gestionEstudiantes;

import java.util.*;

public class estudiantesMain {
    public static void main(String[] args) {
       GestorEstudiantes ge=new GestorEstudiantes();
       
       //Creamos los estudiantes
       Estudiante e1=new Estudiante("Cesar", 31, 8.5);
       Estudiante e2=new Estudiante("Figaro", 24, 8.0);
       Estudiante e3=new Estudiante("Pez dorado", 3, 3.5);
       Estudiante e4=new Estudiante("Pichi", 35, 9.0);
       
       //Agregar estudiantes
       ge.agregarEstudiantes(e1);
       ge.agregarEstudiantes(e2);
       ge.agregarEstudiantes(e3);
       ge.agregarEstudiantes(e4);
       
       //Eliminar estudiantes
       ge.eliminarEstudiantes(e3);
       
       //Listar estudiantes
       ge.listarEstudiantes();
    }
}
