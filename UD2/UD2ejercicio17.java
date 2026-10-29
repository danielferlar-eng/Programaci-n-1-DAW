import java.util.Scanner;
public class UD2ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int n = sc.nextInt();

        int contador = 1;
        long multi = 1;

        while (contador <= n){
            multi *= contador;
            contador++;
        }
        System.out.println("Multiplicación: " + multi);


    }
}
