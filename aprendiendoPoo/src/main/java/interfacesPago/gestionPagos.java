
package interfacesPago;

import java.util.*;

public class gestionPagos {
    List<Pago> Pago;
    
    public gestionPagos(){
        Pago=new ArrayList<>();
    }
    
    public void addPago(Pago p){
        Pago.add(p);
    }
    
    public void listarPagos(){
        for(Pago p:Pago){
            System.out.println(p);
        }
    }
}
