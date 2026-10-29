import java.util.Scanner;
public class UD3ejercicio1_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Suma:     " + sumar(num1, num2));
        System.out.println("Producto: " + multiplicar(num1, num2));
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
}

