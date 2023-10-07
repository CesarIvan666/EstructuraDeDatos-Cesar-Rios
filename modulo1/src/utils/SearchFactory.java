package utils;
import utils.Search.*;
/**
 * Esta clase es una fábrica que proporciona instancias de algoritmos de búsqueda basadas en el método especificado.
 */
public class SearchFactory {

    /**
     * Obtiene una instancia del algoritmo de búsqueda correspondiente al método especificado.
     *
     * @param method El método de búsqueda deseado.
     * @return Una instancia de la clase Sorter que implementa el algoritmo de búsqueda seleccionado.
     */
    public static Sorter getSearcher(SearchingMethods method) {
        Sorter s;
        switch (method) {
            case LINEAR:
                s = new Linear();
                break;
            case BINARY:
                s = new Binary();
                break;
            default:
                s = null;
        }
        return s;
    }
}

