
package interfacesPago;

public class TarjetaCredito implements Pago{
    private String tipo;
    private String nombre;
    private double monto;
    
    public TarjetaCredito(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    @Override
    public void procesarPago(double monto){
        this.monto=monto;
        System.out.println("El monto es: "+monto);
    }

    @Override
    public String toString() {
        return "["+tipo+", "+nombre+", "+monto+"]";
    }
    
    
}
