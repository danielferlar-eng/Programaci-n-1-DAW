import java.util.Scanner;
public class UD3ejercicio1_49 {
        public static void main(String[] args) {

            System.out.println(hayNegativo() ? "Sí, había algún negativo." : "No, ninguno era negativo.");
}
public static boolean hayNegativo() {
    Scanner sc = new Scanner(System.in);
    boolean hayNegativo = false;
    for (int i = 1; i <= 10; i++) {
        System.out.print("Número " + i + ": ");
        int n = sc.nextInt();
        if (n < 0) {
            hayNegativo = true;
        }
    }
    sc.close();
    return hayNegativo;
    }
}