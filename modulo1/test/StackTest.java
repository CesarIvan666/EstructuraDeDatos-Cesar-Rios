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
     * Prueba para el método push, que agrega elementos a la pila y verifica que se agreguen correctamente.
     */
    @Test
    public void pushTest(){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(78);
        stack.push(105);
        Assert.assertTrue(stack.peek().get()==105);
        Assert.assertEquals(3,stack.size());
    }

    /**
     * Prueba para el método pop, que elimina elementos de la pila y verifica que se eliminen correctamente.
     */
    @Test
    public void popTest(){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(78);
        stack.push(105);
        stack.pop();

        Assert.assertTrue(stack.peek().get() == 78);
        Assert.assertFalse(stack.peek().get()==105);
        Assert.assertEquals(2,stack.size());
    }

    /**
     * Prueba para el método pop en una pila vacía y verifica que devuelva un Optional vacío.
     */
    @Test
    public void pop_empty_Test(){
        Stack<Integer> stack = new Stack<>();
        Optional<Integer> element = stack.pop();

        Assert.assertTrue(element.isEmpty());
        Assert.assertEquals(0,stack.size());
    }

    /**
     * Prueba para el método peek en una pila vacía y verifica que devuelva un Optional vacío.
     */
    @Test
    public void peek_empty_Test(){
        Stack<Integer> stack = new Stack<>();
        Optional<Integer> element = stack.peek();

        Assert.assertTrue(element.isEmpty());
        Assert.assertEquals(0,stack.size());
    }

    /**
     * Prueba para el método isEmpty en una pila vacía y verifica que devuelva true.
     */
    @Test
    public void is_EmptyTest(){
        Stack<Integer> stack = new Stack<>();
        Assert.assertTrue(stack.isEmpty());
    }

    /**
     * Prueba para el método isEmpty en una pila con elementos y verifica que devuelva false.
     */
    @Test
    public void is_not_EmptyTest(){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        Assert.assertFalse(stack.isEmpty());
    }
}

