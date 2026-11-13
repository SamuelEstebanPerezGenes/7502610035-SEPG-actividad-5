package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Cuaderno", 5000, 30);

        // Acceso directo a los atributos (permitido: mismo paquete)
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Precio: " + p.precio);
        System.out.println("Stock: " + p.stock);

        // Llamada al método de paquete
        p.mostrarInfo();

        // Modificación directa, sin validación (mala práctica, pero compila)
        p.stock = -10;
        p.mostrarInfo();
    }
}