package utils;
/**
 * Clase principal que inicia una prueba de rendimiento utilizando el algoritmo de ordenación de burbuja.
 */
class Main {
    /**
     * Método principal que inicia la prueba de rendimiento.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Obtener una instancia del algoritmo de ordenación
        Sorter s = SorterFactory.getSorter(SortingMethods.SELECTION);

        // Iniciar la prueba de rendimiento utilizando el algoritmo seleccionado
        PerformanceTester.testPerformance(s);
    }
}
