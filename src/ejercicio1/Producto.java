package ejercicio1;

class Producto {
    // 1. Todas las propiedades con acceso de paquete (default)
    String nombre;
    double precio;
    int stock;

    // 2. Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // 3. Método con acceso de paquete
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}