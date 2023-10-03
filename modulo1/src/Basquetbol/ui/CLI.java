package Basquetbol.ui;
import java.util.ArrayList;
import java.util.Scanner;
import Basquetbol.process.Jugador;

/**
 * Clase principal que gestiona la interfaz de usuario para el registro de jugadores de baloncesto.
 */
public class CLI {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        System.out.println("Bienvenido al registro de jugadores de baloncesto.");

        while (true) {
            System.out.print("Ingrese el nombre del jugador (o escriba 'fin' para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break; // Salir del bucle si el usuario escribe "fin"
            }

            System.out.print("Ingrese la edad del jugador: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            Jugador jugador = new Jugador(nombre, edad);
            jugadores.add(jugador);
        }

        System.out.println("\nJugadores registrados:");

        if (jugadores.isEmpty()) {
            System.out.println("No se han registrado jugadores.");
        } else {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre() + " - " + jugador.getEdad() + " años");
            }
        }

        // Filtrar jugadores menores de 18 años utilizando removeIf
        jugadores.removeIf(jugador -> jugador.getEdad() < 18);

        System.out.println("\nJugadores aceptados:");

        if (jugadores.isEmpty()) {
            System.out.println("No se han registrado jugadores aceptados.");
        } else {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre());
            }
            System.out.println("Número total de jugadores aceptados: " + jugadores.size());
        }

        scanner.close();
    }
}