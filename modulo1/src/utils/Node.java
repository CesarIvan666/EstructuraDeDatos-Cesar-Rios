package utils;
import java.util.Optional;

/**
 * Clase que define un nodo utilizado en estructuras de datos enlazadas.
 *
 * @param <T> El tipo de dato contenido en el nodo.
 */
public class Node<T> {
    T data;
    Optional<Node<T>> next;

    /**
     * Constructor para inicializar un nodo con el dato proporcionado.
     *
     * @param data El dato a almacenar en el nodo.
     */
    Node(T data) {
        this.data = data;
        this.next = Optional.empty();
    }
}

