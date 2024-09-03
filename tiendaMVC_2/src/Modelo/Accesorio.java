
package Modelo;

public class Accesorio extends Producto{
    private String tipo;
    private String moda;
    
    public Accesorio(int id, String nombre, double precio, String tipo) {
        super(id, nombre, precio);
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModa() {
        return moda;
    }

    @Override
    public String toString() {
        return "Accesorio{" +super.toString()+ " tipo=" + tipo + ", moda=" + moda + '}';
    }
}
