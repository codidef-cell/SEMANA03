// Pregunta 5 - Manejo de múltiples excepciones
// Descripción: Programa que captura múltiples excepciones, incluyendo una excepción personalizada.

import java.util.Scanner;

// Excepción personalizada
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class ValidarNumero {

    // Método que valida el número ingresado
    public static void validarNumero(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("Error: el número no puede ser negativo.");
        } else {
            System.out.println("Número válido ingresado: " + numero);
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");

        try {
            // Intentar convertir la entrada a entero
            String entrada = sc.nextLine();
            int numero = Integer.parseInt(entrada);

            // Validar si es negativo
            validarNumero(numero);

        } catch (NumberFormatException e) {
            // Captura cuando el usuario no ingresa un número
            System.out.println("Error: debe ingresar un valor numérico entero.");
        } catch (NumeroNegativoException e) {
            // Captura nuestra excepción personalizada
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Captura cualquier otro error no previsto
            System.out.println("Ocurrió un error inesperado.");
        } finally {
            System.out.println("Ejecución finalizada.");
        }

        sc.close();
    }
}

