
package Modelo;

import java.util.List;

public class Pedido {
    private int idCliente;
    private int idCompra;
    private List<Ropa> ropas;

    public Pedido(int idCliente, int idCompra, List<Ropa> ropas) {
        this.idCliente = idCliente;
        this.idCompra = idCompra;
        this.ropas = ropas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public List<Ropa> getRopas() {
        return ropas;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idCliente=" + idCliente + ", idCompra=" + idCompra + ", ropas=" + ropas + '}';
    }
}
