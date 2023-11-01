package Actividad11;

import utils.Collections.Hashtable;

import java.util.List;

//Ejemplo de aplicación en una tabla
public class Main {
    /**
     * Método principal que demuestra el uso de la clase Hashtable.
     * Crea una Hashtable, agrega elementos, y realiza consultas para mostrar su funcionamiento.
     * @param args Argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear una instancia de Hashtable con claves de tipo String y valores de tipo Integer
        Hashtable<String, Integer> tabla = new Hashtable<>();

        // Agregar elementos a la Hashtable
        tabla.add("uno", 1);
        tabla.add("dos", 2);
        tabla.add("tres", 3);

        // Verificar si la Hashtable está vacía y obtener su tamaño
        System.out.println("¿La tabla está vacía? " + tabla.isEmpty());
        System.out.println("Tamaño de la tabla: " + tabla.Size());

        // Obtener los valores asociados a una clave
        List<Integer> valoresParaDos = tabla.getByKey("dos");
        System.out.println("Valores para 'dos': " + valoresParaDos);

        // Obtener todos los valores de la Hashtable
        List<Integer> todosLosValores = tabla.getValues();
        System.out.println("Todos los valores en la tabla: " + todosLosValores);
    }
}