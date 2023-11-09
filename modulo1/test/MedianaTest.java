import static org.junit.Assert.assertEquals;

import Actividad13.Process.CalculadorMediana;
import org.junit.Test;

public class MedianaTest {

    @Test
    public void testCalcularMediana() {
        int[] valores = {7, 3, 1, 9, 4, 5, 8};
        // La mediana de esta lista de valores es 5.
        double medianaEsperada = 5;

        double medianaCalculada = CalculadorMediana.calcularMediana(valores);

        // Verificar si la mediana calculada es la esperada
        assertEquals(medianaEsperada, medianaCalculada, 0.001);
    }
}
