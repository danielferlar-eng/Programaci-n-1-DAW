import java.util.Scanner;
public class UD2ejercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int n = sc.nextInt();

    for (int i = n; i >= 0; i-=2){
            System.out.println(i);
        }
        System.out.println("¡Despegue!");

    }
}
