
package clasesAbstractas;

public class Ave extends Animal{
    private int velocidadVuelo;
    
    public Ave(){
    }
    
    public Ave(String nombre, int edad, int velocidadVuelo){
        super(nombre,edad);
        this.velocidadVuelo=velocidadVuelo;
    }

    @Override
    public String hacerSonido() {
        return "Haciendo sonido mientras aletea";
    }

    @Override
    public String moverse() {
        return "El ave esta volando a "+ this.velocidadVuelo+" km x H";
    }

    @Override
    public String toString() {
        return "Tipo: Ave, nombre: "+nombre+", edad: "+edad+", velocidadVuelo: "+velocidadVuelo;
    }
    
    
}
