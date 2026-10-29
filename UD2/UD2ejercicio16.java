import java.util.Scanner;
public class UD2ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int n = sc.nextInt();

        int contador = 1;
        int suma = 0;

        while (contador <= n){
            suma += contador;
            contador++;
        }
        System.out.println("Suma: " + suma);
        System.out.printf("media; %.2f", suma / (double) n);
    }
}
