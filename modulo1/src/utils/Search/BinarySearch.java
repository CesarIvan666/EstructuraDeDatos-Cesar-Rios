package utils.Search;

/**
 * Clase que contiene métodos para realizar la búsqueda binaria de un elemento en un arreglo ordenado.
 */
public class BinarySearch {

    /**
     * Método para realizar la búsqueda binaria de forma iterativa.
     *
     * @param arr   El arreglo donde se realizará la búsqueda.
     * @param target El elemento a buscar en el arreglo.
     * @return El índice del elemento si se encuentra, de lo contrario -1.
     */
    public static int iterativeBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Método para realizar la búsqueda binaria de forma recursiva.
     *
     * @param arr   El arreglo donde se realizará la búsqueda.
     * @param target El elemento a buscar en el arreglo.
     * @param left  El índice izquierdo del subarreglo.
     * @param right El índice derecho del subarreglo.
     * @return El índice del elemento si se encuentra, de lo contrario -1.
     */
    public static int recursiveBinarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                return recursiveBinarySearch(arr, target, mid + 1, right);
            } else {
                return recursiveBinarySearch(arr, target, left, mid - 1);
            }
        }
        return -1;
    }
}

