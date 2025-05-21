import java.util.Scanner;

public class Saludar {

    // 1.1 Sin parámetros y sin return
    static void saludar1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un saludo: ");
        String saludo = sc.nextLine();
        System.out.print("Escribe tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println(saludo + " " + nombre);
    }

    // 1.2 Con parámetros y sin return
    static void saludar2(String saludo, String nombre) {
        System.out.println(saludo + " " + nombre);
    }

    // 1.3 Con parámetros y con return
    static String saludar3(String saludo, String nombre) {
        return saludo + " " + nombre;
    }

    public static void main(String[] args) {
        // 1.1
        saludar1();

        // 1.2
        saludar2("Hola", "Andrés");

        // 1.3
        String saludoFinal = saludar3("Hola", "Andrés");
        System.out.println(saludoFinal);
    }
}
