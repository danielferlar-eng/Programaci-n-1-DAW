import java.util.Scanner;
public class UD4ejercicio1 {
    public static void main(String[] args){
        System.out.print("Dime cuantas cadenas: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] cadenas = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la cadena numerica numero "+(i+1)+ ": ");
            cadenas[i] = sc.nextLine();
        }

        for (String cadena : cadenas){
            System.out.print(cadena + " ");
        }
    }
}
