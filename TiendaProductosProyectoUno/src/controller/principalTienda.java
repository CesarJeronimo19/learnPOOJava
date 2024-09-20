
package controller;

import java.util.Scanner;
import view.menuView;

public class principalTienda {
    public void controladorPrincipal(){
        Scanner sc=new Scanner(System.in);
        menuView mv=new menuView();
        int accion=0;
        while (accion!=9){            
            mv.menuPrincipal();
            System.out.println("Selecciona una accion");
            accion=sc.nextInt();
            switch(accion){
                case 1:
                    mv.menuSecundarios(accion);
                    System.out.println("Selecciona una accion");
                    accion=sc.nextInt();
                    mv.menuUsuario(accion);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
            }
        }
    }
    
    
}
