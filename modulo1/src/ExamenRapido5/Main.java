package ExamenRapido5;
import ExamenRapido5.Process.EightQueen;

import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 8;

        List<List<Integer> > res = EightQueen.nQueen(n);
        System.out.println("Numero de soluciones: " + res.size() + '\n');

        for(List sol: res) {
            System.out.println("Coordenadas de Solucion (col, fila): ");
            for(int i=0; i<sol.size(); i++) {
                System.out.println( "(" + (i+1) + ", " + sol.get(i) + ")");
            }
        }
    }
}

