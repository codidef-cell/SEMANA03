// Pregunta 1 - Sobrecarga de Métodos
// Descripción: Demostración de sobrecarga de métodos en Java

public class Calculadora {

    // Método que suma dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método que suma tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método que suma dos números decimales (double)
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Crear objeto de la clase Calculadora
        Calculadora calc = new Calculadora();

        // Demostración de los tres métodos
        int resultado1 = calc.sumar(5, 7);            // Dos enteros
        int resultado2 = calc.sumar(3, 4, 8);         // Tres enteros
        double resultado3 = calc.sumar(2.5, 4.3);     // Dos decimales

        // Mostrar resultados
        System.out.println("Suma de dos enteros: " + resultado1);
        System.out.println("Suma de tres enteros: " + resultado2);
        System.out.println("Suma de dos decimales: " + resultado3);
    }
}
