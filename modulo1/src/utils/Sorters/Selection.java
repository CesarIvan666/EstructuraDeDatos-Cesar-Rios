package utils.Sorters;
import utils.*;
/**
 * Esta clase implementa el algoritmo de ordenación por selección para ordenar un arreglo de enteros.
 * Extiende la clase Sorter para aprovechar la implementación de los métodos swap y las variables COMPARACIONES y MOVIMIENTOS.
 */
public class Selection extends Sorter {
    /**
     * Ordena un arreglo de enteros utilizando el algoritmo de ordenación por selección.
     *
     * @param N El arreglo de enteros que se va a ordenar.
     */
    @Override
    public void sort(int[] N) {
        for(int i=0; i<N.length-1; i++){
            int minIndex = i;

            for(int j=i+1; j<N.length; j++){
                COMPARACIONES++;
                if(N[minIndex]>N[j]){
                    minIndex = j;
                }
            }

            COMPARACIONES++;
            if(minIndex!=i){
                swap(N, minIndex, i);
                MOVIMIENTOS++;
            }
        }
    }
}