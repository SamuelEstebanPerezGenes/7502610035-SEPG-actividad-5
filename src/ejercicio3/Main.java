package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 25);

        // 'nombre' (private): solo mediante get y set
        System.out.println("Nombre: " + p.getNombre());
        p.setNombre("Ana María");
        System.out.println("Nombre nuevo: " + p.getNombre());

        // 'edad' (paquete): acceso directo, permitido por estar en el mismo paquete
        System.out.println("Edad: " + p.edad);
        p.edad = 26;
        System.out.println("Edad nueva: " + p.edad);

        // Sin validación: compila, pero es una mala práctica
        p.edad = -5;
        System.out.println("Edad inválida aceptada: " + p.edad);

        // --- Descomenta para ver el error de compilación ---
        // System.out.println(p.nombre); // Error: 'nombre' has private access in 'Persona'
    }
}