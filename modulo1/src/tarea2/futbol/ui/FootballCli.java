package tarea2.futbol.ui;
import tarea2.futbol.process.FootBallPlayer;
import tarea2.utils.ListaEnlazada;

import java.util.Scanner;
import java.util.Scanner;

/**
 * Clase que gestiona una práctica de fútbol, incluyendo la construcción de equipos y la asignación de jugadores a ellos.
 */
public class FootballCli {

    static Scanner in = new Scanner(System.in);
    static String name;
    static int number;
    static boolean isCaptain;

    static ListaEnlazada<FootBallPlayer> players = new ListaEnlazada<>();
    static ListaEnlazada<FootBallPlayer> team1 = new ListaEnlazada<>();
    static ListaEnlazada<FootBallPlayer> team2 = new ListaEnlazada<>();

    /**
     * Método principal que gestiona una práctica de fútbol, construye los equipos y muestra sus integrantes.
     */
    public static void footBallPractice() {
        teamBuilder();
        System.out.println("---------Equipo 1-----------");
        System.out.println(team1);
        System.out.println();
        System.out.println("---------Equipo 2-----------");
        System.out.println(team2);
    }

    /**
     * Construye los equipos asignando capitanes y jugadores a los equipos.
     */
    static void teamBuilder() {
        // Capitanes
        team1.add(readCaptain());
        team2.add(readCaptain());

        System.out.println("------Registro de Jugadores------");
        for (int i = 0; i < 8; i++) {
            players.add(readPlayer());
        }

        System.out.println("------Eleccion de Jugadores------");
        // Jugadores para el equipo 1
        for (int i = 0; i < 4; i++) {
            assignPlayerToTeam(team1, "1");
        }
        // Jugadores para el equipo 2
        for (int i = 0; i < 4; i++) {
            assignPlayerToTeam(team2, "2");
        }
    }

    /**
     * Lee los datos de un capitán desde la entrada estándar.
     *
     * @return Un objeto FootBallPlayer que representa al capitán.
     */
    static FootBallPlayer readCaptain() {
        System.out.print("Nombre del Capitan: ");
        name = in.nextLine();
        System.out.print("Numero del Capitan: ");
        number = in.nextInt();
        System.out.println();
        in.nextLine();

        return new FootBallPlayer(name, number, true);
    }

    /**
     * Asigna un jugador a un equipo específico, verificando su existencia y disponibilidad.
     *
     * @param team     El equipo al que se asignará el jugador.
     * @param teamNum  El número del equipo (1 o 2) para mostrar en los mensajes.
     */
    static void assignPlayerToTeam(ListaEnlazada<FootBallPlayer> team, String teamNum) {
        FootBallPlayer p;
        boolean cont = false;
        do {
            System.out.println("Equipo " + teamNum);
            System.out.print("Nombre del Jugador: ");
            name = in.nextLine();
            System.out.print("Numero del Jugador: ");
            number = in.nextInt();
            System.out.println();
            in.nextLine();
            p = new FootBallPlayer(name, number, false);
            cont = players.contains(p);
            if (cont) {
                team.add(p);
                players.remove(p);
            } else {
                System.out.println("El jugador que busca no existe en la lista o ya fue elegido. Intente de nuevo");
            }
        } while (!cont);
    }

    /**
     * Lee los datos de un jugador desde la entrada estándar.
     *
     * @return Un objeto FootBallPlayer que representa al jugador.
     */
    static FootBallPlayer readPlayer() {
        System.out.print("Nombre del Jugador: ");
        name = in.nextLine();
        System.out.print("Numero del Jugador: ");
        number = in.nextInt();
        System.out.println();
        in.nextLine();

        return new FootBallPlayer(name, number, false);
    }
}
