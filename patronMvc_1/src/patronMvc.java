
import Modelo.TareaModelo;
import Vista.TareaVista;
import Controlador.TareaControlador;
import java.util.Scanner;

public class patronMvc {
    public static void main(String[] args) {
        TareaVista vista = new TareaVista();
        TareaControlador controlador = new TareaControlador(vista);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Completar tarea");
            System.out.println("4. Listar tareas");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    controlador.agregarTarea(nombre, descripcion);
                    break;
                case 2:
                    System.out.print("Número de tarea a eliminar: ");
                    int indiceEliminar = scanner.nextInt() - 1;
                    controlador.eliminarTarea(indiceEliminar);
                    break;
                case 3:
                    System.out.print("Número de tarea a completar: ");
                    int indiceCompletar = scanner.nextInt() - 1;
                    controlador.completarTarea(indiceCompletar);
                    break;
                case 4:
                    controlador.listarTareas();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
