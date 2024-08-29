
package gestionEmpleados;

public class EmpleadoMain {

    public static void main(String[] args) {
        //Declaracion de Gerentes
        System.out.println("Gerentes");
        Gerente ger1=new Gerente("Cesar", 30000.0);
        Gerente ger2=new Gerente("Pichi", 28000.0);
        System.out.println(ger1);
        System.out.println(ger2);
        
        //Declaracion de Ingenieros
        System.out.println("\nIngenieros");
        Ingeniero ing1=new Ingeniero("Jeronimo", 40000);
        Ingeniero ing2=new Ingeniero("Figaro", 35000);
        System.out.println(ing1);
        System.out.println(ing2);
    }
}
