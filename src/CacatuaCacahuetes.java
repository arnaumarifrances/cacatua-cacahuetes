import java.util.Scanner;

public class CacatuaCacahuetes {

    static void dormirse() {
        System.out.println("zzZzzzz…");
    }

    static void pideComida() {
        Scanner sc = new Scanner(System.in);
        String comida = "";

        while (true) {
            System.out.print("¿Qué le das de comer a la cacatúa? ");
            comida = sc.nextLine();

            if (comida.equalsIgnoreCase("cacahuetes")) {
                dormirse();
                break;
            } else {
                System.out.println("cacatúa cacahuetes!");
            }
        }
    }

    public static void main(String[] args) {
        pideComida();
    }
}
