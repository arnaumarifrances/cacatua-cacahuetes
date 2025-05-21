import java.util.Scanner;

public class Calcular {

    static double sumar(double a, double b) {
        return a + b;
    }

    static double restar(double a, double b) {
        return a - b;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salir = "salir";

        do {
            double num1, num2;

            // Validar num1
            while (true) {
                System.out.print("Ingresa primer número: ");
                if (sc.hasNextDouble()) {
                    num1 = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Eso no es un número válido.");
                    sc.next();
                }
            }

            // Validar num2
            while (true) {
                System.out.print("Ingresa segundo número: ");
                if (sc.hasNextDouble()) {
                    num2 = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Eso no es un número válido.");
                    sc.next();
                }
            }

            System.out.print("Operación (+, -, *, /): ");
            char operacion = sc.next().charAt(0);

            double resultado = 0;

            switch (operacion) {
                case '+':
                    resultado = sumar(num1, num2);
                    break;
                case '-':
                    resultado = restar(num1, num2);
                    break;
                case '*':
                    resultado = multiplicar(num1, num2);
                    break;
                case '/':
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operación no válida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("¿Deseas salir? (s para salir): ");
            salir = sc.next();

        } while (!salir.equalsIgnoreCase("s"));

        sc.close();
    }
}
