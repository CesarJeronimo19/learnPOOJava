
package clasesAbstractas;

import java.util.*;

public class gestionAnimal {

   private List<Animal>Animal;
    public gestionAnimal() {
        Animal=new ArrayList<>();
    }
    
    public void addAnimal(Animal animal){
        Animal.add(animal);
    }
    
    public void listarAnimales(){
        for(Animal anim: Animal){
            System.out.println(anim.toString());
            System.out.println(anim.hacerSonido());
            System.out.println(anim.moverse());
        }
    }
    
}
