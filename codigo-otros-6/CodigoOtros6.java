package codigoOtros6;

import java.util.Scanner;

public class CodigoOtros6 {

    public static void main(String[] args) { // Encapsulamos el método
        int[] n = new int[20]; // Declaración del array

        for (int i = 0; i < 20; i++) { // Relleno del array con números aleatorios
            n[i] = (int) (Math.random() * 381) + 20;
            System.out.print(n[i] + " "); // Mostramos los valores generados
        }

        System.out.println("\n¿Qué números quiere resaltar?");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt(); // Leemos la opción usando Scanner

        int multiplo = (opcion == 1) ? 5 : 7; // Operador ternario para seleccionar el múltiplo

        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }
        }

        scanner.close(); // Cerramos el Scanner
    }
}
