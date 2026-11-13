package vehiculos;

public class Vehiculo {
    // 1. Propiedad con acceso de paquete (sin modificador)
    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    // Método público solo para poder mostrar el dato desde otro paquete
    public void mostrarTipo() {
        System.out.println("Tipo: " + tipo);
    }
}