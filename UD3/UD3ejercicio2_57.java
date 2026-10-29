import java.util.Scanner;
public class UD3ejercicio2_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = pedirNumero(sc, 1, Integer.MAX_VALUE);

        if (esPrimo(n)) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo.");
        }
    }

    public static int pedirNumero(Scanner sc, int min, int max) {
        int n;
        do {
            System.out.print("Número (" + min + " o mayor): ");
            n = sc.nextInt();
            if (n < min || n > max) {
                System.out.println("Ese número no vale.");
            }
        } while (n < min || n > max);
        return n;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }
}

