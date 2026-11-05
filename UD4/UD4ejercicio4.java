import java.util.Scanner;
public class UD4ejercicio4 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Dame dos valores enteros");
    System.out.print("Valor 1: ");
    int n = sc.nextInt();
    System.out.print("Valor 2: ");
    int m = sc.nextInt();

    int i[] = new int[n];

    for (int b : i){
        i[b] = m;
        System.out.print(i[b] + " ");
    }
}
}
