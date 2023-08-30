import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;
import tarea2.utils.ListaEnlazada;

/**
 * Clase de pruebas para la implementación de ListaEnlazada.
 */
public class ListaEnlazadaTest {

    /**
     * Prueba para obtener un elemento fuera de los límites de la lista.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void getIndexOutOfBoundsTest() {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.add(5);
        lista.get(1);
        assertEquals(1, lista.size());
    }

    /**
     * Prueba para obtener un elemento con un índice negativo.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void getNegativeIndexTest() {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.add(5);
        lista.get(-1);
        assertEquals(1, lista.size());
    }

    /**
     * Prueba para agregar dos elementos y obtenerlos correctamente.
     */
    @Test
    public void add2Element2Test() {
        ListaEnlazada<Optional<Integer>> lista = new ListaEnlazada<>();
        lista.add(Optional.of(5));
        lista.add(Optional.of(78));
        assertEquals(Optional.of(5), lista.get(0));
        assertEquals(Optional.of(78), lista.get(1));
        assertEquals(2, lista.size());
    }

    /**
     * Prueba para agregar un elemento y obtenerlo correctamente.
     */
    @Test
    public void add1ElementTest() {
        ListaEnlazada<Optional<Integer>> lista = new ListaEnlazada<>();
        lista.add(Optional.of(5));
        assertEquals(Optional.of(5), lista.get(0));
        assertEquals(1, lista.size());
    }
}
