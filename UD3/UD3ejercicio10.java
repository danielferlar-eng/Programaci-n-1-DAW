import java.util.Scanner;
public class UD3ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer valor: ");
        int a = sc.nextInt();

        System.out.print("Segundo valor: ");
        int b = sc.nextInt();

        System.out.print("Tercer valor: ");
        int c = sc.nextInt();

        int resultado = maximo(a, b);
        resultado = maximo(resultado, c);

        System.out.println("El mayor es " + resultado);
    }

    public static int maximo(int a, int b) {
        return a > b ? a : b;
    }
}

