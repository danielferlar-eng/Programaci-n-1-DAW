import java.util.Scanner;
public class Pruebas   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero != 0) {
            int cifra = numero % 10;
            invertido = invertido * 10 + cifra;
            numero = numero / 10;
        }

        System.out.println("Numero al reves: " + invertido);

        if (original == invertido) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
    }
}

