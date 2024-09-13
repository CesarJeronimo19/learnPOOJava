
import controller.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        
        EmpleadoService es=new EmpleadoService();
        es.listDB();
    }
}
