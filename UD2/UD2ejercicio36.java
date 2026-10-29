import java.util.Scanner;
public class UD2ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame la altura: ");
        int n = sc.nextInt();

        System.out.print("Dame un caracter: ");
        char caracter = sc.next().charAt(0);

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(caracter);
                }

                System.out.println();
            }
    }
}
