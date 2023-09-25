import org.junit.Assert;
import org.junit.Test;
import java.util.Optional;
import utils.*;
import static org.junit.Assert.assertEquals;

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

    //pruebas para metodos addfirst y removefirst
    /**
     * Prueba para agregar elementos al principio de la lista y verificar que se agreguen correctamente.
     */
    @Test
    public void addFirstTest(){
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.addFirst(5);
        lista.addFirst(78);
        lista.addFirst(105);
        Assert.assertTrue(lista.get(0).get()==105);
        Assert.assertFalse(lista.get(0).get()==5);
        Assert.assertEquals(3,lista.size());
    }
    /**
     * Prueba para agregar un elemento al principio de la lista y verificar que se agregue correctamente.
     */
    @Test
    public void addFirst_and_add_Test(){
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.addFirst(5);
        lista.add(78);
        lista.addFirst(105);
        Assert.assertTrue(lista.get(0).get()==105);
        Assert.assertTrue(lista.get(1).get()==5);
        Assert.assertTrue(lista.get(2).get()==78);
        Assert.assertEquals(3,lista.size());
    }

    /**
     * Prueba para eliminar el primer elemento de la lista y verificar que se elimine correctamente.
     */
    @Test
    public void removeFirstTest(){
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.add(5);
        lista.add(78);
        lista.add(105);
        lista.removeFirst();

        Assert.assertFalse(lista.contains(5));
        Assert.assertTrue(lista.get(0).get()==78);
        Assert.assertTrue(lista.get(1).get()==105);
        Assert.assertEquals(2,lista.size());
    }
}


