import java.util.Scanner;
public class UD3ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero de millas: ");
        int n = sc.nextInt();

        double resultado = pen(n);
    }

    public static double pen(int n){
        double kilometros = n * 1.60934;

        System.out.println(n + " millas equivalen a " + kilometros + " kilómetros.");

        return n;
    }
}
