
package clasesAbstractas;

class Mamifero extends Animal{
    private String colorPelaje;
    
    public Mamifero(){
    }
    
    public Mamifero(String nombre, int edad, String colorPelaje){
        super(nombre,edad);
        this.colorPelaje=colorPelaje;
    }

    @Override
    public String hacerSonido() {
        return "Haciendo un sonido de mamifero";
    }

    @Override
    public String moverse() {
        return "El mamifero se esta moviendo rapido";
    }
    
    @Override
    public String toString() {
        return "Tipo: Mamifero, nombre: "+nombre+", edad: "+edad+", colorPelaje: "+colorPelaje;
    }
}
