
package clasesAbstractas;

public class clasesAbstractas {
    public static void main(String[] args) {
        gestionAnimal ga=new gestionAnimal();
        Animal m1=new Mamifero("Figaro", 3, "Naranjoso");
        Animal m2=new Mamifero("Tigre", 5, "Atigrado");
        Animal r1=new Reptil("K", 6, "Cafe manchado");
        Animal r2=new Reptil("Ssserf", 3, "Gris claro");
        Animal a1=new Ave("Pio", 4, 3);
        Animal a2=new Ave("Chiken", 4, 3);
        
        ga.addAnimal(m1);
        ga.addAnimal(m2);
        ga.addAnimal(r1);
        ga.addAnimal(r2);
        ga.addAnimal(a1);
        ga.addAnimal(a2);
        
        ga.listarAnimales();
    }
}
