
package clasesAbstractas;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    
    protected Animal(){
    }
    
    protected Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public abstract String hacerSonido();
    
    public abstract String moverse();
}
