import org.junit.Assert;
import utils.*;
import org.junit.Test;
import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;
import java.util.Optional;

/**
 * Esta clase contiene pruebas unitarias para los métodos de la clase Stack relacionados con push, pop, peek y operaciones relacionadas.
 */
public class StackTest {

    /**
     * Prueba el método push para agregar elementos a la pila.
     */
    @Test
    public void pushTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(78);
        stack.push(105);
        // Comprueba si el elemento en la parte superior de la pila es 105
        Assert.assertTrue(stack.peek().get() == 105);
        // Comprueba si el tamaño de la pila es 3
        Assert.assertEquals(3, stack.size());
    }

    /**
     * Prueba el método pop para eliminar el elemento en la parte superior de la pila.
     */
    @Test
    public void popTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(78);
        stack.push(105);
        stack.pop();
        // Comprueba si el elemento en la parte superior de la pila es 78 después de eliminar 105
        Assert.assertTrue(stack.peek().get() == 78);
        // Comprueba que el elemento en la parte superior de la pila no es igual a 105
        Assert.assertFalse(stack.peek().get() == 105);
        // Comprueba si el tamaño de la pila es 2 después de eliminar un elemento
        Assert.assertEquals(2, stack.size());
    }

    /**
     * Prueba el método pop cuando la pila está vacía.
     */
    @Test
    public void pop_empty_Test() {
        Stack<Integer> stack = new Stack<>();
        Optional<Integer> element = stack.pop();
        // Comprueba si el resultado de pop en una pila vacía es un Optional vacío
        Assert.assertTrue(element.isEmpty());
        // Comprueba que el tamaño de la pila sigue siendo 0
        Assert.assertEquals(0, stack.size());
    }

    /**
     * Prueba el método peek cuando la pila está vacía.
     */
    @Test
    public void peek_empty_Test() {
        Stack<Integer> stack = new Stack<>();
        Optional<Integer> element = stack.peek();
        // Comprueba si el resultado de peek en una pila vacía es un Optional vacío
        Assert.assertTrue(element.isEmpty());
        // Comprueba que el tamaño de la pila sigue siendo 0
        Assert.assertEquals(0, stack.size());
    }

    /**
     * Prueba el método isEmpty cuando la pila está vacía.
     */
    @Test
    public void is_EmptyTest() {
        Stack<Integer> stack = new Stack<>();
        // Comprueba si la pila está vacía
        Assert.assertTrue(stack.isEmpty());
    }

    /**
     * Prueba el método isEmpty cuando la pila no está vacía.
     */
    @Test
    public void is_not_EmptyTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        // Comprueba que la pila no está vacía después de agregar un elemento
        Assert.assertFalse(stack.isEmpty());
    }
}


