
package view;

import controller.EmpleadoService;

public class menuView {
    public void menuPrincipal(){
        System.out.println("Menu Principal");
        System.out.println("1. Usuario");
        System.out.println("2. Productos");
        System.out.println("3. Ventas");
        System.out.println("9. Salir");
    }
    
    public void menuSecundarios(int accion){
        switch(accion){
            case 1:
                System.out.println("=== Usuarios ===");
                System.out.println("1. Agregar Usuario");
                System.out.println("2. listar usuarios");
                System.out.println("3. Eliminar usuarios");
                
                System.out.println("5. regresar");
                
                break;
            case 2:
                
                break;
            case 3:
               
                break;
            default:
        }
    }
    
    public void menuUsuario(int accion){
        EmpleadoService es=new EmpleadoService();
        switch(accion){
            case 1:
                es.createDB();
                
                break;
            case 2:
                es.listDB();
                break;
            case 3:
               
                break;
            default:
        }
    }
}
