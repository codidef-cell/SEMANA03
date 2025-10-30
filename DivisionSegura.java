// Pregunta 2 - Manejo de Errores
// Descripción: Programa que realiza una división controlando errores por división entre cero.

import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Para leer datos del usuario

        try {
            // Solicitar los dos números al usuario
            System.out.print("Ingrese el primer número entero: ");
            int num1 = sc.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int num2 = sc.nextInt();

            // Intentar realizar la división
            int resultado = num1 / num2;
            System.out.println("Resultado de la división: " + resultado);

        } catch (ArithmeticException e) {
            // Captura el error de división entre cero
            System.out.println("Error: división entre cero no permitida.");
        } catch (Exception e) {
            // Captura cualquier otro error inesperado (por ejemplo, entrada no numérica)
            System.out.println("Error: entrada no válida.");
        } finally {
            // Bloque que siempre se ejecuta
            System.out.println("Ejecución finalizada.");
        }

        sc.close(); // Cerrar el Scanner
    }
}

