
package interfacesPago;

public class interfazPagoMain {
    public static void main(String[] args) {
        gestionPagos gp=new gestionPagos();
        Pago tc=new TarjetaCredito("BBVA", "Visa");
        Pago tb=new TransferenciaBancaria("Banamex", "Los reyes la paz");
        Pago pypl=new PayPal("Cripto", "Binance");
        
        gp.addPago(tc);
        gp.addPago(tb);
        gp.addPago(pypl);
        
        tc.procesarPago(3500.96);
        tb.procesarPago(1200.0);
        pypl.procesarPago(580.0);
        
        gp.listarPagos();
    }
}
