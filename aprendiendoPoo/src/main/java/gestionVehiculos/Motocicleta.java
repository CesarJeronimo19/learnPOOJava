
package gestionVehiculos;

public class Motocicleta extends Vehiculo{

    private String tipoFreno;
    
    public Motocicleta(String marca, String modelo, int anio,String tipoFreno){
        super(marca, modelo, anio);
        this.tipoFreno=tipoFreno;
    }
    
    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    @Override
    public String toString() {
        return super.toString()+", Tipo de Freno: "+tipoFreno;
    }
    
    
    
}
