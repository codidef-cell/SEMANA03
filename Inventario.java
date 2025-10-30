// Pregunta 4 - Integrando conceptos
// Descripción: Clase Inventario con sobrecarga de métodos y manejo de errores.

import java.util.ArrayList;

class Producto {
    String nombre;
    double precio;
    int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - Precio: S/ " + precio + " - Cantidad: " + cantidad;
    }
}

public class Inventario {
    // Lista de productos
    private ArrayList<Producto> productos = new ArrayList<>();

    // Método sobrecargado 1: solo nombre
    public void agregarProducto(String nombre) {
        productos.add(new Producto(nombre, 0.0, 0));
        System.out.println("Producto agregado: " + nombre);
    }

    // Método sobrecargado 2: nombre y precio
    public void agregarProducto(String nombre, double precio) {
        try {
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo.");
            }
            productos.add(new Producto(nombre, precio, 0));
            System.out.println("Producto agregado: " + nombre + " (Precio: S/ " + precio + ")");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Método sobrecargado 3: nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        try {
            if (precio < 0 || cantidad < 0) {
                throw new IllegalArgumentException("Ni el precio ni la cantidad pueden ser negativos.");
            }
            productos.add(new Producto(nombre, precio, cantidad));
            System.out.println("Producto agregado: " + nombre + " (Precio: S/ " + precio + ", Cantidad: " + cantidad + ")");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Método para mostrar todos los productos
    public void mostrarInventario() {
        System.out.println("\nInventario actual:");
        for (Producto p : productos) {
            System.out.println("- " + p);
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // Agregar productos con diferentes métodos
        inv.agregarProducto("Laptop");
        inv.agregarProducto("Mouse", 35.50);
        inv.agregarProducto("Teclado", 80.00, 5);

        // Intento con valores negativos
        inv.agregarProducto("Monitor", -100.0, 2);

        // Mostrar inventario final
        inv.mostrarInventario();
    }
}
