import java.util.Scanner;
public class Pruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer numero: ");
        int a = sc.nextInt();

        System.out.print("Segundo numero: ");
        int b = sc.nextInt();

        int resultado = mayor(a, b);

        System.out.println("El mayor es: " + resultado);

        sc.close();
    }

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return b; //o a, es indiferente
        }
    }
}