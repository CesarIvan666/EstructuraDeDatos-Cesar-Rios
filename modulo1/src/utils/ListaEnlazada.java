package utils;
import java.util.Optional;
import java.util.Optional;

/**
 * La clase ListaEnlazada implementa la interfaz Lista y proporciona una implementación de una lista enlazada genérica.
 *
 * @param <T> El tipo de datos de los elementos de la lista.
 */
public class ListaEnlazada<T> implements Lista<T> {

    private Optional<Node<T>> head;
    private int length = 0;

    /**
     * Constructor de la clase ListaEnlazada que inicializa una lista enlazada vacía.
     */
    public ListaEnlazada() {
        this.head = Optional.empty();
    }

    /**
     * Devuelve el tamaño actual de la lista.
     *
     * @return El tamaño actual de la lista.
     */
    public int size() {
        return this.length;
    }

    @Override
    public void add(T data) {
        // Implementación del método add para agregar un elemento al final de la lista.
    }

    /**
     * Agrega un elemento al principio de la lista.
     *
     * @param data El elemento a agregar al principio de la lista.
     */
    public void addFirst(T data) {
        // Implementación del método addFirst para agregar un elemento al principio de la lista.
    }

    @Override
    public boolean contains(T key) {
        // Implementación del método contains para verificar si la lista contiene un elemento dado.
        return false;
    }

    @Override
    public Optional<T> get(int index) {
        // Implementación del método get para obtener un elemento en una posición específica de la lista.
        return null;
    }

    @Override
    public void update(T key, T newItem) {
        // Implementación del método update para actualizar un elemento existente en la lista.
    }

    @Override
    public void remove(T key) {
        // Implementación del método remove para eliminar un elemento de la lista.
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void removeLast() {
        // Implementación del método removeLast para eliminar el último elemento de la lista.
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst() {
        // Implementación del método removeFirst para eliminar el primer elemento de la lista.
    }

    @Override
    public String toString() {
        // Implementación del método toString para obtener una representación en cadena de la lista.
        return "";
    }
}

