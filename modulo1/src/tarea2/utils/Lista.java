package tarea2.utils;
import java.util.Optional;

/**
 * Interfaz que define operaciones básicas para una lista genérica.
 *
 * @param <T> El tipo de elementos contenidos en la lista.
 */
public interface Lista<T> {
    /**
     * Agrega un elemento a la lista.
     *
     * @param t El elemento a agregar.
     */
    void add(T t);

    /**
     * Elimina un elemento de la lista.
     *
     * @param t El elemento a eliminar.
     */
    void remove(T t);

    /**
     * Obtiene un elemento de la lista en un índice específico.
     *
     * @param index El índice del elemento a obtener.
     * @return Un objeto Optional que contiene el elemento en el índice dado si está presente, o vacío si no lo está.
     */
    Optional<T> get(int index);

    /**
     * Actualiza un elemento en la lista con un nuevo valor.
     *
     * @param oldValue El valor antiguo del elemento a actualizar.
     * @param newValue El nuevo valor que reemplazará al antiguo.
     */
    void update(T oldValue, T newValue);

    /**
     * Obtiene el tamaño actual de la lista.
     *
     * @return El tamaño de la lista.
     */
    int size();

    /**
     * Verifica si la lista contiene un elemento específico.
     *
     * @param t El elemento a verificar.
     * @return true si la lista contiene el elemento, false en caso contrario.
     */
    boolean contains(T t);
}
