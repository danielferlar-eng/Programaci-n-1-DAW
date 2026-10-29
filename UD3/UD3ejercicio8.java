import java.util.Scanner;
public class UD3ejercicio8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Dame un numero: ");
    int n = sc.nextInt();

    int resultado = posi(n);
    System.out.print(resultado);
    }

    public static int posi(int n){
        if (n > 0){
            n = 1;
        }
        if (n < 0){
            n = -1;
        }
        if (n == 0){
            n = 0;
        }
        return n;
    }
}
