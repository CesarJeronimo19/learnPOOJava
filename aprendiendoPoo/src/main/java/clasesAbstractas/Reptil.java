
package clasesAbstractas;

public class Reptil extends Animal{
    private String colorHuevo;

    public  Reptil(){
    }
    
    public  Reptil(String nombre, int edad, String colorHuevo){
        super(nombre, edad);
        this.colorHuevo=colorHuevo;
    }
    
    @Override
    public String hacerSonido() {
        return "Sonido de repti enojado";
    }

    @Override
    public String moverse() {
        return "El reptil parece que se mueve rapido";
    }
    
    @Override
    public String toString() {
        return "Tipo: Reptil, nombre: "+nombre+", edad: "+edad+", colorHuevo: "+colorHuevo;
    }
}
