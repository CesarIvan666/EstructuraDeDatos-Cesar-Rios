package utils.Collections;
import utils.Searches.Node32;

import java.util.List;

/**
 * Clase que representa un árbol B 3-2.
 */
public class BTree32 {
    private Node32 root;

    /**
     * Constructor para crear un árbol B 3-2 vacío.
     */
    public BTree32() {
        root = new Node32();
    }

    /**
     * Busca un valor en el árbol.
     * @param key El valor a buscar.
     * @return true si el valor se encuentra en el árbol, false en caso contrario.
     */
    public boolean search(int key) {
        return search(root, key);
    }

    private boolean search(Node32 node, int key) {
        if (node == null) {
            return false;
        }

        List<Integer> keys = node.keys;
        int i = 0;
        while (i < keys.size() && key > keys.get(i)) {
            i++;
        }

        if (i < keys.size() && key == keys.get(i)) {
            return true; // Encontrado
        } else if (node.children.size() > i) {
            return search(node.children.get(i), key); // Buscar en el subárbol correspondiente
        } else {
            return false; // No encontrado
        }
    }

    /**
     * Inserta un valor en el árbol.
     * @param key El valor a insertar.
     */
    public void insert(int key) {
        insert(root, key);
    }

    private void insert(Node32 node, int key) {
        if (node.keys.size() < 2) {
            // Si el nodo no está lleno, simplemente insertamos la clave
            insertKey(node, key);
        } else {
            // Si el nodo está lleno, dividimos el nodo y propagamos la clave al padre
            Node32 newRoot = new Node32();
            newRoot.children.add(root);
            splitNode(newRoot, 0);
            root = newRoot;
            insert(newRoot, key);
        }
    }

    private void insertKey(Node32 node, int key) {
        int i = 0;
        while (i < node.keys.size() && key > node.keys.get(i)) {
            i++;
        }
        node.keys.add(i, key);
    }

    private void splitNode(Node32 parentNode, int childIndex) {
        Node32 nodeToSplit = parentNode.children.get(childIndex);
        Node32 newNode = new Node32();

        // Mover la clave del medio al padre
        int middleIndex = nodeToSplit.keys.size() / 2;
        int middleKey = nodeToSplit.keys.get(middleIndex);
        insertKey(parentNode, middleKey);

        // Mover las claves y los hijos restantes al nuevo nodo
        newNode.keys.addAll(nodeToSplit.keys.subList(middleIndex + 1, nodeToSplit.keys.size()));
        nodeToSplit.keys.subList(middleIndex, nodeToSplit.keys.size()).clear();

        if (!nodeToSplit.children.isEmpty()) {
            newNode.children.addAll(nodeToSplit.children.subList(middleIndex + 1, nodeToSplit.children.size()));
            nodeToSplit.children.subList(middleIndex + 1, nodeToSplit.children.size()).clear();
        }

        parentNode.children.add(childIndex + 1, newNode);
    }
}

