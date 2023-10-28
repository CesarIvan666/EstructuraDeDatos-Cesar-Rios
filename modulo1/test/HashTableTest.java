
import java.util.List;
import org.junit.Test;
import utils.Collections.Hashtable;
import static org.junit.Assert.*;

public class HashTableTest {

    /**
     * Prueba para comprobar los métodos isEmpty() y Size() de la Hashtable.
     */
    @Test
    public void testIsEmptyAndSize() {
        Hashtable<String, Integer> table = new Hashtable<>();
        assertTrue(table.isEmpty());
        assertEquals(0, table.Size());

        table.add("A", 1);
        assertFalse(table.isEmpty());
        assertEquals(1, table.Size());
    }

    /**
     * Prueba para validar el funcionamiento de los métodos add() y getByKey() de la Hashtable.
     */
    @Test
    public void testAddAndGetByKey() {
        Hashtable<String, String> table = new Hashtable<>();
        table.add("key1", "value1");
        table.add("key2", "value2");

        List<String> valuesForKey1 = table.getByKey("key1");
        List<String> valuesForKey2 = table.getByKey("key2");
        List<String> valuesForKey3 = table.getByKey("key3");

        assertEquals(1, valuesForKey1.size());
        assertEquals("value1", valuesForKey1.get(0));

        assertEquals(1, valuesForKey2.size());
        assertEquals("value2", valuesForKey2.get(0));

        assertEquals(0, valuesForKey3.size());
    }

    /**
     * Prueba para verificar el funcionamiento del método getValues() de la Hashtable.
     */
    @Test
    public void testGetValues() {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.add("A", 1);
        table.add("B", 2);

        List<Integer> values = table.getValues();

        assertEquals(2, values.size());
        assertTrue(values.contains(1));
        assertTrue(values.contains(2));
    }

    /**
     * Prueba para comprobar el manejo de excepciones al intentar agregar una clave duplicada.
     */
    @Test
    public void testAddingDuplicateKey() {
        Hashtable<String, String> table = new Hashtable<>();
        table.add("key", "value");

        assertThrows(IllegalArgumentException.class, () -> table.add("key", "new_value"));
    }
}
