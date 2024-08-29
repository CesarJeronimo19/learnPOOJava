
package interfacesPago;

public class TransferenciaBancaria implements Pago{
    private String banco;
    private String ciudad;
    private double monto;
    
    public TransferenciaBancaria(String banco, String ciudad){
        this.banco=banco;
        this.ciudad=ciudad;
    }
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public void procesarPago(double monto){
        this.monto=monto;
        System.out.println("La transferencia del banco "+this.banco+ " es por el monto: "+monto);
    }
    
    @Override
    public String toString() {
        return "["+banco+", "+ciudad+", "+monto+"]";
    }
}
