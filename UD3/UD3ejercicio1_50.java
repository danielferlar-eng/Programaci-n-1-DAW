import java.util.Scanner;
public class UD3ejercicio1_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Positivos: " + ContarPositivos(sc) + " de 10.");

        sc.close();
    }

    public static int ContarPositivos(Scanner sc) {
        int positivos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int n = sc.nextInt();

            if (n > 0) {
                positivos++;
            }
        }
        return positivos;
    }
}
