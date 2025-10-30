// Pregunta 3 - Colecciones (ArrayList)
// Descripción: Programa que usa un ArrayList para almacenar y manipular nombres de estudiantes.

import java.util.ArrayList;

public class ListaEstudiantes {

    public static void main(String[] args) {

        // Crear un ArrayList para guardar los nombres
        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregar 5 nombres
        estudiantes.add("Ana");
        estudiantes.add("Bruno");
        estudiantes.add("Carla");
        estudiantes.add("Diego");
        estudiantes.add("Elena");

        // Mostrar lista completa
        System.out.println("Lista completa de estudiantes:");
        for (String nombre : estudiantes) {
            System.out.println("- " + nombre);
        }

        // Eliminar el tercer nombre (posición 2, porque empieza en 0)
        estudiantes.remove(2);

        // Mostrar lista actualizada
        System.out.println("\nLista después de eliminar el tercer estudiante:");
        for (String nombre : estudiantes) {
            System.out.println("- " + nombre);
        }
    }
}

