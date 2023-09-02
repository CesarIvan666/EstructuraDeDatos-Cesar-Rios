package tarea3.process;
import utils.*;
//import java.util.Stack;
/**
 * La clase ExpConverter proporciona métodos para convertir expresiones infix en postfix
 * y evaluar expresiones postfix.
 */
public class ExpConverter {

    /**
     * Devuelve la precedencia de un operador dado.
     *
     * @param ch El operador para el cual se desea obtener la precedencia.
     * @return La precedencia del operador (1 para + y -, 2 para * y /, 3 para ^), o -1 si no es un operador válido.
     */
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    /**
     * Convierte una expresión infix en una expresión postfix.
     *
     * @param exp La expresión infix a convertir.
     * @return La expresión postfix resultante.
     */
    public static String infixToPostfix(String exp) {
        String result = new String("");
        var stack = new Stack<Character>();

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                result += c;

            else if (c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty()
                        && stack.peek().get() != '(') {
                    result += stack.pop().get();
                }

                stack.pop();
            } else {
                while (!stack.isEmpty()
                        && Prec(c) <= Prec(stack.peek().get())) {

                    result += stack.pop().get();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek().get() == '(')
                return "Expresión no válida";
            result += stack.pop().get();
        }

        return result;
    }

    /**
     * Evalúa una expresión postfix y devuelve el resultado.
     *
     * @param exp La expresión postfix a evaluar.
     * @return El resultado de la evaluación de la expresión.
     */
    public static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c))
                stack.push(c - '0');
            else {
                int val1 = stack.pop().get();
                int val2 = stack.pop().get();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop().get();
    }
}
