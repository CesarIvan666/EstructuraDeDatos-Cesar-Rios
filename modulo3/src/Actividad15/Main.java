package Actividad15;
import utils.Collections.BTree32;
/**
 * Clase principal para probar la implementación del árbol B 3-2.
 */
public class Main {
    public static void main(String[] args) {
        BTree32 bTree = new BTree32();

        // Insertar algunos valores en el árbol
        bTree.insert(5);
        bTree.insert(3);
        bTree.insert(15);
        bTree.insert(20);
        bTree.insert(1);
        bTree.insert(25);
        bTree.insert(13);
        bTree.insert(14);
        bTree.insert(24);
        bTree.insert(23);
        bTree.insert(22);

        // Buscar valores en el árbol
        System.out.println(bTree.search(25)); // Debería imprimir true
        System.out.println(bTree.search(16)); // Debería imprimir false
    }
}





