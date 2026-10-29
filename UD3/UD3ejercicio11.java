import java.util.Scanner;
public class UD3ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame la altura: ");
        int n = sc.nextInt();

        System.out.print("Dame un caracter: ");
        char caracter = sc.next().charAt(0);

        int resultado = caracter(n, caracter);
    }

    public static int caracter(int n, char caracter) {
        for (int f = 1; f <= n; f++) {
            for (int e = 1; e <= n - f; e++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= 2 * f - 1; a++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
        return caracter;
    }
}


