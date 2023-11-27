package utils.Searches;
import utils.Collections.BTree32;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un nodo en un árbol B 3-2.
 */
public class Node32 {
    public List<Integer> keys;
    public List<Node32> children;

    /**
     * Constructor para crear un nuevo nodo.
     */
    public Node32() {
        this.keys = new ArrayList<>();
        this.children = new ArrayList<>();
    }
}



