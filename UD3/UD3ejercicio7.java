import java.util.Scanner;
public class UD3ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la edad: ");
        int n = sc.nextInt();

        boolean resultado = edad(n);
        System.out.print(resultado);
    }

    public static boolean edad(int n){
        boolean edad = true;

        if (n >= 18){
            edad = true;

        } else {
            edad = false;
        }
        return edad;
    }
}
