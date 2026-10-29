import java.util.Scanner;
public class UD3ejercicio2_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        if (b <= a) {
            System.out.println("B tiene que ser mayor que A.");
        } else {
            System.out.println(desdeHasta(a, b));
        }
    }

    public static String desdeHasta(int a, int b) {
        String resultado = "";
        for (int i = a; i <= b; i++) {
            resultado += i + " ";
        }
        return resultado;
    }
}
