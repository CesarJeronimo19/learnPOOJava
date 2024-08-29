
package gestionVehiculos;

public class VehiculosMain {
    public static void main(String[] args) {
        GestorVehiculos gv=new GestorVehiculos();
        System.out.println("Crear vehiculos");
        Vehiculo a1=new Automovil("chevrolet", "spark", 2024, "Magma");
        Vehiculo a2=new Automovil("Nissan", "March", 2015, "Gasolina");
        Vehiculo a3=new Automovil("Volkswagen", "Jetta", 2023, "Diesel");
        Vehiculo m1=new Motocicleta("Italika", "FT150", 2018, "Disco");
        Vehiculo m2=new Motocicleta("Honda", "CB250", 2021, "Liquido");
        
        System.out.println("Agregar vehiculos");
        gv.agregarVehiculo(a1);
        gv.agregarVehiculo(a2);
        gv.agregarVehiculo(a3);
        gv.agregarVehiculo(m1);
        gv.agregarVehiculo(m2);
        
        System.out.println("Listar vehiculos");
        gv.listarVehiculos();
        
        System.out.println("Eliminar vehiculos");
        gv.eliminarVehiculo(a1);
        
        System.out.println("Listar vehiculos");
        gv.listarVehiculos();
    }
}
