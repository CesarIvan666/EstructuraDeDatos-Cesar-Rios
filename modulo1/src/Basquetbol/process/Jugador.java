package Basquetbol.process;
/**
 * Clase que representa un jugador de baloncesto.
 */
public class Jugador {
    private String nombre;
    private int edad;
    /**
     * Constructor de la clase Jugador.
     *
     * @param nombre Nombre del jugador.
     * @param edad   Edad del jugador.
     */
    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * Obtiene el nombre del jugador.
     *
     * @return Nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene la edad del jugador.
     *
     * @return Edad del jugador.
     */
    public int getEdad() {
        return edad;
    }
}