package Actividad13;

import Actividad13.Process.CalculadorMediana;
import Actividad13.ui.CLI;
/**
 * Clase principal que inicia la aplicación para el cálculo de la mediana.
 */
public class Main {
    /**
     * Función principal para obtener valores, calcular la mediana y mostrar resultados.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        int[] valores = CLI.obtenerValores();
        CLI.mostrarValores(valores);

        double mediana = CalculadorMediana.calcularMediana(valores);
        System.out.println("La mediana de los valores es: " + mediana);
    }
}
