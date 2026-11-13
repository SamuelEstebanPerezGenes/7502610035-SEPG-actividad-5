package ejercicio3;

public class Persona {
    private String nombre; // privado
    int edad;              // acceso de paquete (sin modificador)

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // get y set solo para nombre, como pide el ejercicio
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }
}