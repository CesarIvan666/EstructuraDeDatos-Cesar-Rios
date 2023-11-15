package Actividad13.Process;
import java.util.Arrays;

import java.util.Arrays;

/**
 * Clase ProcessMediana que proporciona métodos para el cálculo de la mediana de una lista de valores.
 */
public class CalculadorMediana {
    /**
     * Calcula la mediana de una lista de valores.
     * @param valores La lista de valores no ordenados.
     * @return La mediana de la lista de valores.
     */
    public static double calcularMediana(int[] valores) {
        int[] valoresOrdenados = valores.clone();
        Arrays.sort(valoresOrdenados);

        int longitud = valoresOrdenados.length;
        if (longitud % 2 == 0) {
            int medio1 = valoresOrdenados[longitud / 2 - 1];
            int medio2 = valoresOrdenados[longitud / 2];
            return (double) (medio1 + medio2) / 2;
        } else {
            return (double) valoresOrdenados[longitud / 2];
        }
    }
}

