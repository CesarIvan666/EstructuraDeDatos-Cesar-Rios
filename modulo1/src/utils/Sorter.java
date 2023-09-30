package utils;
import java.util.Arrays;
import java.util.Random;
/**
 * Clase abstracta que sirve como base para implementar algoritmos de ordenación.
 */
public abstract class Sorter {
    /**
     * Variable que registra el número de comparaciones realizadas durante el proceso de ordenación.
     */
    protected int COMPARACIONES = 0;

    /**
     * Variable que registra el número de movimientos realizados durante el proceso de ordenación.
     */
    protected int MOVIMIENTOS = 0;

    /**
     * Método abstracto que debe ser implementado por las subclases para realizar la ordenación de un arreglo de enteros.
     *
     * @param N El arreglo de enteros que se va a ordenar.
     */
    public abstract void sort(int[] N);

    /**
     * Intercambia dos elementos en un arreglo dado.
     *
     * @param N El arreglo en el que se realizará el intercambio.
     * @param i La posición del primer elemento a intercambiar.
     * @param j La posición del segundo elemento a intercambiar.
     */
    public static void swap(int[] N, int i, int j) {
        int tmp = N[i];
        N[i] = N[j];
        N[j] = tmp;
    }

    /**
     * Genera un arreglo aleatorio de enteros con un tamaño dado y valores en un rango específico.
     *
     * @param n    El tamaño del arreglo.
     * @param min  El valor mínimo para los elementos del arreglo.
     * @param max  El valor máximo para los elementos del arreglo.
     * @return     El arreglo aleatorio generado.
     */
    public static int[] getRandomArray(int n, int min, int max) {
        Random random = new Random();
        return random.ints(n, min, max).toArray();
    }

    /**
     * Imprime un arreglo de enteros en la consola.
     *
     * @param N El arreglo de enteros a imprimir.
     */
    private static void printArray(int[] N) {
        System.out.println(Arrays.toString(N));
    }

    /**
     * Verifica si un arreglo de enteros está ordenado de manera ascendente.
     *
     * @param N El arreglo de enteros a verificar.
     * @return  True si el arreglo está ordenado; False en caso contrario.
     */
    private static boolean isSorted(int[] N) {
        for (int i = 0; i < N.length - 1; i++) {
            if (N[i] > N[i + 1])
                return false;
        }
        return true;
    }

    /**
     * Obtiene el número total de comparaciones realizadas durante el proceso de ordenación.
     *
     * @return El número total de comparaciones.
     */
    public int getComparaciones() {
        return COMPARACIONES;
    }

    /**
     * Obtiene el número total de movimientos realizados durante el proceso de ordenación.
     *
     * @return El número total de movimientos.
     */
    public int getMovimientos() {
        return MOVIMIENTOS;
    }
}
