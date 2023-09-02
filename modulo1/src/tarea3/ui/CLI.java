package tarea3.ui;
import java.util.Scanner;
import tarea3.process.ExpConverter;

/**
 * Esta clase contiene el método principal que interactúa con el usuario para ingresar una expresión infija,
 * la convierte en una expresión postfija y la evalúa utilizando la clase ExpConverter.
 */
public class CLI {

    /**
     * El método principal de la aplicación que interactúa con el usuario para realizar la conversión
     * y evaluación de expresiones infijas.
     */
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introducir una expresión infija: ");
        String infixExp = scanner.nextLine();
        String postfixExp = ExpConverter.infixToPostfix(infixExp);

        System.out.println("Expresión postfija: " + postfixExp);
        System.out.println("Evaluación : " + ExpConverter.evaluate(postfixExp));

        scanner.close();
    }
}
