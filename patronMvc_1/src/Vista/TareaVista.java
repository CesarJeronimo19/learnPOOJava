
package Vista;

import java.util.List;
//Mando a llamar el paquete que contiene el modelo
import Modelo.TareaModelo;

public class TareaVista {
    public void mostrarTareas(List<TareaModelo> tareas){
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i).toString());
        }
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
