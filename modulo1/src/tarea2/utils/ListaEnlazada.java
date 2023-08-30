package tarea2.utils;

import tarea2.utils.Lista;
import tarea2.utils.Node;
import java.util.Optional;

/**
 * Implementación de una lista enlazada que implementa la interfaz Lista<T>.
 *
 * @param <T> El tipo de elementos contenidos en la lista.
 */
public class ListaEnlazada<T> implements Lista<T> {

    Optional<Node<T>> head;
    private int length = 0;

    /**
     * Constructor de la lista enlazada.
     */
    public ListaEnlazada() {
        this.head = Optional.empty();
    }

    /**
     * Obtiene el tamaño actual de la lista enlazada.
     *
     * @return El tamaño de la lista.
     */
    public int size() {
        return this.length;
    }

    /**
     * Agrega un elemento a la lista enlazada.
     *
     * @param data El elemento a agregar.
     */
    public void add(T data) {
        var temp = Optional.ofNullable(new Node<T>(data));

        if (head.isPresent()) {
            var X = head;

            while (X.get().next.isPresent()) {
                X = X.get().next;
            }

            X.get().next = temp;
        } else {
            head = temp;
        }
        length++;
    }

    /**
     * Verifica si la lista enlazada contiene un elemento específico.
     *
     * @param key El elemento a buscar.
     * @return true si la lista contiene el elemento, false en caso contrario.
     */
    public boolean contains(T key) {
        var temp = head;

        while (temp.isPresent()) {
            if (String.valueOf(temp.get().data).equals(String.valueOf(key))) {
                return true;
            }
            temp = temp.get().next;
        }
        return false;
    }

    /**
     * Obtiene un elemento de la lista enlazada en un índice específico.
     *
     * @param index El índice del elemento a obtener.
     * @return Un objeto Optional que contiene el elemento en el índice dado si está presente, o vacío si no lo está.
     */
    public Optional<T> get(int index) {
        if (index > length - 1 || index < 0) {
            System.out.println("Position Unavailable in LinkedList");
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }

        int pos = 0;
        for (var temp = head; temp.isPresent(); temp = temp.get().next) {
            if (pos == index) return Optional.of(temp.get().data);
            pos++;
        }
        return null;
    }

    /**
     * Actualiza un elemento en la lista enlazada con un nuevo valor.
     *
     * @param key     El valor antiguo del elemento a actualizar.
     * @param newItem El nuevo valor que reemplazará al antiguo.
     */
    public void update(T key, T newItem) {
        var temp = head;

        while (temp.isPresent()) {
            if (String.valueOf(temp.get().data).equals(String.valueOf(key))) {
                temp.get().data = newItem;
                return;
            }
            temp = temp.get().next;
        }

        System.out.println("El elemento a Actualizar no existe");
    }

    /**
     * Elimina un elemento de la lista enlazada.
     *
     * @param key El elemento a eliminar.
     */
    public void remove(T key) {
        if (length == 0) return;

        var prev = Optional.ofNullable(new Node<T>(null));
        prev.get().next = head;

        var next = head.get().next;
        var temp = head;

        boolean exists = false;

        if (head.get().data == key) {
            head = head.get().next;
            exists = true;
        }

        while (temp.get().next.isPresent()) {
            if (String.valueOf(temp.get().data).equals(String.valueOf(key))) {
                prev.get().next = next;
                exists = true;
                break;
            }

            prev = temp;
            temp = temp.get().next;
            next = temp.get().next;
        }

        if (exists == false && String.valueOf(temp.get().data).equals(String.valueOf(key))) {
            prev.get().next = Optional.empty();
            exists = true;
        }
        if (exists) {
            length--;
        } else {
            System.out.println("El valor dado no esta presente en la lista");
        }
    }

    /**
     * Devuelve una representación en forma de cadena de la lista enlazada.
     *
     * @return Una cadena que representa los elementos en la lista.
     */
    public String toString() {
        if (length == 0) return "";

        var X = head;
        String S = "";
        int n = 0;

        while (X.isPresent()) {
            S += n + ". " + String.valueOf(X.get().data) + "\n";
            X = X.get().next;
            n++;
        }
        return S;
    }
}

