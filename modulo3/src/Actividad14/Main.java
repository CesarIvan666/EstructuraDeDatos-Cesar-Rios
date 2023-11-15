package Actividad14;
import utils.Searches.BinarySearchTree;


/**
 * Clase principal que contiene el método main para probar la implementación del árbol de búsqueda binaria.
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insertar algunos valores en el árbol
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Imprimir el árbol en orden
        System.out.println("Árbol en orden:");
        tree.inorder();

        // Buscar valores en el árbol
        int keyToSearch = 40;
        if (tree.search(keyToSearch)) {
            System.out.println("\n" + keyToSearch + " encontrado en el árbol.");
        } else {
            System.out.println("\n" + keyToSearch + " no encontrado en el árbol.");
        }
    }
}

