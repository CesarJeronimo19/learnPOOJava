
package gestionEstudiantes;

import java.util.*;

public class GestorEstudiantes {
    private List<Estudiante> estudiantes;
    
    public GestorEstudiantes(){
        this.estudiantes=new ArrayList<>();
    }
    
    public void agregarEstudiantes(Estudiante alumno){
        estudiantes.add(alumno);
        System.out.println("Alumno agrego! - "+alumno);
    }
    
    public void eliminarEstudiantes(Estudiante alumno){
        estudiantes.remove(alumno);
        System.out.println("El estudiante a sido eliminado! - "+alumno);
    }
    
    public void listarEstudiantes(){ 
        for (Estudiante Estudiante : estudiantes) {
	System.out.println(Estudiante);
}
    }
}
