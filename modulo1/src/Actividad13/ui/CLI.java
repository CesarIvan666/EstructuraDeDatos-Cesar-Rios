package Actividad13.ui;
import java.util.Scanner;

/**
 * Clase CLI que gestiona la interacción con el usuario para ingresar valores.
 */
public class CLI {
    /**
     * Obtiene una lista de valores ingresados por el usuario.
     * @return Un array de enteros con los valores ingresados.
     */
    public static int[] obtenerValores() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos valores deseas ingresar?");
        int tamaño = scanner.nextInt();

        int[] valores = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Inserta el valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        scanner.close();
        return valores;
    }

    /**
     * Muestra los valores ingresados por el usuario.
     * @param valores Un array de enteros con los valores a mostrar.
     */
    public static void mostrarValores(int[] valores) {
        System.out.print("Valores ingresados: ");
        for (int valor : valores) {
            System.out.print(valor + " | ");
        }
        System.out.println();
    }
}
