package Actividad9;
import utils.*;
import utils.Collections.Grafo;
import java.util.LinkedList;
import java.util.Stack;

import utils.Arista;
/**
 * Clase que contiene métodos para realizar búsquedas en un grafo utilizando BFS y DFS.
 */
public class SearchGraph {

    /**
     * Realiza una búsqueda en el grafo utilizando el algoritmo Breadth-First Search (BFS).
     *
     * @param grafo    El grafo en el que se realizará la búsqueda.
     * @param inicio   El vértice de inicio de la búsqueda.
     * @param objetivo El vértice objetivo que se desea encontrar.
     * @return El vértice objetivo si se encuentra, o null si no se encuentra.
     */
    public static Vertice breadthFirstSearch(Grafo grafo, String inicio, String objetivo) {

        var target = new Vertice(objetivo);

        if (target.equals(new Vertice(inicio))) return target;

        LinkedList<Arista> visited = new LinkedList<Arista>();
        LinkedList<Arista> queue = new LinkedList<Arista>();

        queue = new LinkedList<Arista>(grafo.getAdyacencias(new Vertice(inicio)));

        while (!queue.isEmpty()) {

            var currentEdge = queue.poll();
            if (currentEdge.getV2().equals(target)) {
                return currentEdge.getV2();
            } else {
                visited.add(currentEdge);
                queue.addAll(new LinkedList<Arista>(grafo.getAdyacencias(currentEdge.getV2())));
                queue.removeAll(visited);
            }
        }

        return null;
    }

    /**
     * Realiza una búsqueda en el grafo utilizando el algoritmo Depth-First Search (DFS).
     *
     * @param grafo    El grafo en el que se realizará la búsqueda.
     * @param inicio   El vértice de inicio de la búsqueda.
     * @param objetivo El vértice objetivo que se desea encontrar.
     * @return El vértice objetivo si se encuentra, o null si no se encuentra.
     */
    public static Vertice deepFirstSearch(Grafo grafo, String inicio, String objetivo) {

        var target = new Vertice(objetivo);
        if (target.equals(new Vertice(inicio))) return target;

        var stack = new Stack<Arista>();
        var visited = new Stack<Arista>();

        stack.addAll(grafo.getAdyacencias(new Vertice(inicio)));
        while (!stack.isEmpty()) {
            var current = stack.pop();
            if (current.getV2().equals(target)) {
                return current.getV2();
            }
            visited.push(current);
            stack.addAll(grafo.getAdyacencias(current.getV2()));
            stack.removeAll(visited);
        }
        return null;
    }
}
