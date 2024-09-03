
package Controlador;

import Modelo.TareaModelo;
import Vista.TareaVista;
import java.util.ArrayList;
import java.util.List;

public class TareaControlador {
    private List<TareaModelo> tareas;
    private TareaVista vista;
    
    public TareaControlador(TareaVista vista) {
        this.tareas = new ArrayList<>();
        this.vista = vista;
    }

    public void agregarTarea(String nombre, String descripcion) {
        TareaModelo tarea = new TareaModelo(nombre, descripcion);
        tareas.add(tarea);
        vista.mostrarMensaje("Tarea agregada: " + nombre);
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            TareaModelo tarea = tareas.remove(indice);
            vista.mostrarMensaje("Tarea eliminada: " + tarea.getNombre());
        } else {
            vista.mostrarMensaje("Índice inválido");
        }
    }

    public void completarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            TareaModelo tarea = tareas.get(indice);
            tarea.completar();
            vista.mostrarMensaje("Tarea completada: " + tarea.getNombre());
        } else {
            vista.mostrarMensaje("Índice inválido");
        }
    }

    public void listarTareas() {
        vista.mostrarTareas(tareas);
    }
}
