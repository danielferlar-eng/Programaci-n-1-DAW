import java.util.Scanner;
public class UD2ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    System.out.print("Dame un numero: ");
    int n = sc.nextInt();

    int contador = 0;
    int a = 0;

    while (contador <= 10) {
        System.out.println(n + " x " + contador + " = " + a);
        a = n * contador + n;
        contador++;
    }

    }
}
