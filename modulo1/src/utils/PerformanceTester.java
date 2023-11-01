package utils;
import java.util.Arrays;
import java.util.Random;
/**
 * Esta clase realiza pruebas de rendimiento para algoritmos de ordenación y mide el número de comparaciones y movimientos realizados.
 */
public class PerformanceTester {
    /**
     * Variable estática que almacena el número total de comparaciones realizadas en las pruebas de rendimiento.
     */
    public static int COMPARACIONES = 0;
    /**
     * Variable estática que almacena el número total de movimientos realizados en las pruebas de rendimiento.
     */
    public static int MOVIMIENTOS = 0;
    /**
     * Realiza pruebas de rendimiento para un algoritmo de ordenación dado y muestra los resultados.
     *
     * @param sorter El algoritmo de ordenación que se va a probar.
     */
    public static void testPerformance(Sorter sorter) {
        final int RANGO = 10_000;
        final int ITERACIONES = 500;
        final int INCREMENTOS = 1000;

        double[][] performanceResults = new double[RANGO / INCREMENTOS][2];
        for (int N = 1, k = 0; N <= RANGO; N += INCREMENTOS, k++) {
            // llamar 500 veces cada algoritmo

            COMPARACIONES = 0;
            MOVIMIENTOS = 0;
            for (int i = 0; i < ITERACIONES; i++) {
                int[] array = getRandomArray(N, Short.MIN_VALUE, Integer.MAX_VALUE);
                sorter.sort(array);
            }
            performanceResults[k][0] += sorter.getComparaciones();
            performanceResults[k][1] += sorter.getMovimientos();
            performanceResults[k][0] = performanceResults[k][0] / ((double) ITERACIONES);
            performanceResults[k][1] = performanceResults[k][1] / ((double) ITERACIONES);
        }


        System.out.println("{algoritmo}: ");
        System.out.println(performanceResults.length);
        for(double[] results: performanceResults)
            System.out.println(Arrays.toString(results).replace("[","").replace("]","").replace(",",""));
    }
    /**
     * Genera un arreglo aleatorio de enteros con un tamaño dado y valores en un rango específico.
     *
     * @param n       El tamaño del arreglo.
     * @param minVal  El valor mínimo para los elementos del arreglo.
     * @param maxVal  El valor máximo para los elementos del arreglo.
     * @return        El arreglo aleatorio generado.
     */
    public static int[] getRandomArray(int n, int minVal, int maxVal) {
        return new Random().ints(n, minVal, maxVal).toArray();
    }
    /**
     * Intercambia dos elementos en un arreglo dado.
     *
     * @param N El arreglo en el que se realizará el intercambio.
     * @param i La posición del primer elemento a intercambiar.
     * @param j La posición del segundo elemento a intercambiar.
     */
    public static void swap(int[] N, int i, int j) {
        int aux = N[i];
        N[i] = N[j];
        N[j] = aux;
    }
}


