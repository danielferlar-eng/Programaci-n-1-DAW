import java.util.Scanner;
public class UD2ejercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero entero: ");
        int n = sc.nextInt();

        int contador = 0;

        while (n > 0){
            n = n / 10;
            contador++;
        }
        System.out.println("Tiene " + contador + " cifras");

    }
}
