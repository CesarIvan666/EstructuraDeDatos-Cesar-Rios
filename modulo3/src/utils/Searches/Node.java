package utils.Searches;

/**
 * Clase que representa un nodo en un árbol de búsqueda binaria.
 */
public class Node {
    int key;
    Node left, right;

    /**
     * Constructor para crear un nuevo nodo con un valor específico.
     * @param item El valor del nodo.
     */
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
