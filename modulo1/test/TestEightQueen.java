import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import ExamenRapido5.Process.EightQueen;
public class TestEightQueen {

    @Test
    public void testEightQueen() {
        EightQueen eightQueen = new EightQueen();
        int n = 8; // Número de reinas y tamaño del tablero

        List<List<Integer>> solutions = eightQueen.nQueen(n);

        assertNotNull(solutions);
        assertFalse(solutions.isEmpty());
        assertEquals(92, solutions.size()); // Verificar que existen 92 soluciones para 8 reinas
    }

    @Test
    public void testNQueenSolutionValidity() {
        EightQueen eightQueen = new EightQueen();
        int n = 8; // Número de reinas y tamaño del tablero

        List<List<Integer>> solutions = eightQueen.nQueen(n);

        for (List<Integer> solution : solutions) {
            assertTrue(isValidSolution(solution, n));
        }
    }

    // Método para comprobar la validez de una solución específica
    private boolean isValidSolution(List<Integer> solution, int n) {
        if (solution.size() != n) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (solution.get(i).equals(solution.get(j)) || Math.abs(solution.get(i) - solution.get(j)) == Math.abs(i - j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
