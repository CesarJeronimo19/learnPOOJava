
package interfacesPago;

public class PayPal implements Pago{
    private String tipo;
    private String sitio;
    private double monto;
    
    public PayPal(String tipo, String sitio){
        this.tipo=tipo;
        this.sitio=sitio;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }
    
    @Override
    public void procesarPago(double monto){
        this.monto=monto;
        System.out.println("PayPal procesando monto de: "+monto);
    }
    
    @Override
    public String toString() {
        return "["+tipo+", "+sitio+", "+monto+"]";
    }
}
