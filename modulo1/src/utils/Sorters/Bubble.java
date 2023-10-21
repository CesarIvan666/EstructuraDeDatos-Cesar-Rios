package utils.Sorters;
import utils.*;
/**
 * Esta clase implementa el algoritmo de ordenación de burbuja para ordenar un arreglo de enteros.
 * Extiende la clase Sorter para aprovechar la implementación de los métodos swap y las variables COMPARACIONES y MOVIMIENTOS.
 */
public class Bubble extends Sorter{
    /**
     * Ordena un arreglo de enteros utilizando el algoritmo de ordenación de burbuja.
     *
     * @param N El arreglo de enteros que se va a ordenar.
     */
    @Override
    public void sort(int[] N) {
        var len = N.length;
        var swapped = true;
        while(swapped){
            swapped = false;
            for(int i=1; i< len; i++){
                COMPARACIONES++;
                if(N[i-1]>N[i]){
                    swap(N, i-1, i);
                    MOVIMIENTOS++;
                    swapped = true;
                }
            }
        }
    }
}