
package gestionVehiculos;

public class Automovil extends Vehiculo{
    private String tipoCombustible;

    public Automovil() {
        super();
    }   
    
    public Automovil(String marca, String modelo, int anio, String combustible){
        super(marca, modelo, anio);
        this.tipoCombustible=combustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    public String toString(){
        return super.toString()+", Tipo de combustible: " + tipoCombustible;
    }
}
