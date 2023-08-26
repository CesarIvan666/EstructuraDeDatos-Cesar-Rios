package tarea2.autobuses.ui;
import tarea2.autobuses.process.Passenger;
import tarea2.utils.ListaEnlazada;

import java.util.Scanner;

/**
 * Clase que gestiona la interacción con los pasajeros en un sistema de transporte.
 */
public class BusCli {
    static Scanner in = new Scanner(System.in);
    static String name;
    static int number;
    static String choice;
    static boolean isVip;

    static ListaEnlazada<Passenger> passengerList = new ListaEnlazada<>();

    /**
     * Lee los datos de un pasajero desde la entrada estándar.
     *
     * @return Un objeto Passenger con los datos del pasajero leídos.
     */
    static Passenger readPassenger() {
        System.out.print("Nombre del Pasajero: ");
        name = in.nextLine();
        System.out.print("El Pasajero es VIP? [True/False]: ");
        isVip = in.nextBoolean();
        System.out.print("Registro del Pasajero: ");
        number = in.nextInt();
        System.out.println();
        in.nextLine();

        return new Passenger(name, number, isVip);
    }

    /**
     * Imprime la lista de pasajeros registrados.
     */
    static void printPassangers() {
        System.out.println("Pasajeros Registrados: ");
        System.out.print(passengerList);
    }

    /**
     * Agrega un pasajero a la lista.
     */
    static void addPassenger() {
        passengerList.add(readPassenger());
    }

    /**
     * Elimina un pasajero de la lista.
     */
    static void deletePassenger() {
        passengerList.remove(readPassenger());
    }

    /**
     * Obtiene y muestra los datos de un pasajero en base a su número de registro.
     */
    static void getPassenger() {
        System.out.println("Hay " + passengerList.size() + " pasajeros.");
        System.out.print("Numero de Pasajero: ");
        number = in.nextInt();
        System.out.println("Datos del Pasajero: " + passengerList.get(number));
        in.nextLine();
    }

    /**
     * Método principal que permite interactuar con el sistema de pasajeros.
     */
    public static void passengerPractice() {
        boolean exit = true;
        do {
            System.out.println("\n\nSeleccione una de las siguientes acciones");
            System.out.println("Añadir Pasajero: 1");
            System.out.println("Eliminar Pasajero: 2");
            System.out.println("Visualizar Pasajero: 3");
            System.out.println("Visualizar Pasajeros: 4");
            System.out.println("Salir: 5");
            System.out.print("Opcion: ");
            choice = in.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    addPassenger();
                    break;
                case "2":
                    deletePassenger();
                    break;
                case "3":
                    getPassenger();
                    break;
                case "4":
                    printPassangers();
                    break;
                default:
                    exit = false;
                    break;
            }
        } while (exit);
    }
}
