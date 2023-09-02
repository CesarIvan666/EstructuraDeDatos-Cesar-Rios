package tarea3.ui;
import java.util.Scanner;
import tarea3.process.ExpConverter;

import java.util.Scanner;

/**
 * La clase CLI proporciona una interfaz de línea de comandos para interactuar con la conversión de expresiones infix a postfix
 * y la evaluación de expresiones postfix.
 */
public class CLI {
    /**
     * El método principal de la aplicación de línea de comandos.
     * Permite al usuario ingresar una expresión infix, la convierte en postfix
     * y muestra la expresión postfix y su evaluación.
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

