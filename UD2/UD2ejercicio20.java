import java.util.Scanner;
public class UD2ejercicio20 {
    public static void main(String[] args){
        System.out.print("Introduce un numero entero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int invert = 0;

        while (n != 0){
            int cifra = n % 10;
            invert = invert * 10 + cifra;
            n = n / 10;
        }
        System.out.println("Numero invertido: " + invert);

        if (original == invert) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }

    }
}
