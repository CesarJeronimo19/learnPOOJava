
package gestionVehiculos;

import java.util.*;

public class GestorVehiculos {
    private List<Vehiculo> vehiculos;
    
    public GestorVehiculos(){
        this.vehiculos=new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo transporte){
        vehiculos.add(transporte);
    }
    
    public void eliminarVehiculo(Vehiculo transporte){
        vehiculos.remove(transporte);
    }
    
    public void listarVehiculos(){
        System.out.println(vehiculos);
        for(Vehiculo carro: vehiculos){
            System.out.println(carro.toString());
        }
    }
}
