package pruebas;

import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Carro");
        Moto m = new Moto("Moto deportiva");

        v.mostrarTipo();
        m.mostrarTipo();
        m.mostrarDesdeMoto();

        // --- Descomenta una por una para ver los errores de compilación ---
        // System.out.println(v.tipo); // Error: 'tipo' is not public in 'vehiculos.Vehiculo'. Cannot be accessed from outside package
        // System.out.println(m.tipo); // Error: igual, aunque Moto herede de Vehiculo
        // v.tipo = "Camión";          // Error: acceso de paquete
    }
}