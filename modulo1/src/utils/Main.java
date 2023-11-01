package utils;
import utils.*;
/**
 * Clase principal que inicia una prueba de rendimiento utilizando el algoritmo de ordenación de burbuja.
 */

public class Main {
    /**
     * Método principal que inicia la prueba de rendimiento.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
          Sorter s = SorterFactory.getSorter(SortingMethods.MERGE);
//        Sorter s = SearchFactory.getSearcher(SearchingMethods.BINARY);
        PerformanceTester.testPerformance(s);
    }
}
