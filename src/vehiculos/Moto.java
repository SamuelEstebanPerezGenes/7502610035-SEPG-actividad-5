package vehiculos;

public class Moto extends Vehiculo {

    public Moto(String tipo) {
        super(tipo);
    }

    public void mostrarDesdeMoto() {
        // Compila: Moto está en el mismo paquete que Vehiculo
        System.out.println("Desde Moto, tipo: " + tipo);
    }
}