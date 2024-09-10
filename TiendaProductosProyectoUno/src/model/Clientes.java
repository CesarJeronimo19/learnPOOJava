
package model;

public class Clientes extends Persona{
    private double Credito;

    public Clientes() {
    }

    public Clientes(String nombre, String telefono, String direccion, int estatus, double Credito) {
        super(nombre, telefono, direccion, estatus);
        this.Credito = Credito;
    }

    

    public double getCredito() {
        return Credito;
    }

    public void setCredito(double Credito) {
        this.Credito = Credito;
    }
}
