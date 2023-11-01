package utils.Sorters;
import utils.*;
/**
 * Esta clase implementa el algoritmo de ordenación Merge Sort para ordenar un arreglo de enteros.
 * Extiende la clase Sorter para aprovechar la implementación de las variables COMPARACIONES y MOVIMIENTOS.
 */
public class Merge extends Sorter {

    /**
     * Ordena un arreglo de enteros utilizando el algoritmo de ordenación Merge Sort.
     *
     * @param N El arreglo de enteros que se va a ordenar.
     */
    public void sort(int N[]) {
        mergeSort(N);
    }

    /**
     * Divide y fusiona recursivamente un arreglo de enteros utilizando el algoritmo Merge Sort.
     *
     * @param arr El arreglo de enteros que se va a ordenar y fusionar.
     * @return El arreglo ordenado fusionado.
     */
    public int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int midpoint = arr.length / 2;
        int[] left = new int[midpoint];
        int[] right;

        if (arr.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }

        for (int i = 0; i < midpoint; i++) {
            left[i] = arr[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[midpoint + j];
        }

        int[] result;
        result = merge(mergeSort(left), mergeSort(right));

        return result;
    }

    /**
     * Fusiona dos arreglos ordenados en uno solo.
     *
     * @param n1 El primer arreglo ordenado.
     * @param n2 El segundo arreglo ordenado.
     * @return El arreglo resultante de la fusión de los dos arreglos ordenados.
     */
    public int[] merge(int[] n1, int[] n2) {
        int[] N = new int[n1.length + n2.length];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < N.length; i++) {
            if (index1 == n1.length) {
                N[i] = n2[index2];
                index2++;
                ++MOVIMIENTOS;
            } else if (index2 == n2.length) {
                N[i] = n1[index1];
                index1++;
                ++MOVIMIENTOS;
            } else if (n1[index1] < n2[index2]) {
                N[i] = n1[index1];
                index1++;
                ++COMPARACIONES;
            } else {
                N[i] = n2[index2];
                index2++;
                ++MOVIMIENTOS;
            }
        }

        return N;
    }
}

