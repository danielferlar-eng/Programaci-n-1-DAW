import java.util.Scanner;
public class UD2ejercicio21 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Dame un numero: ");
    int n = sc.nextInt();


    //Ejercicio 18 con for
        int a = 0;

        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(n + " x " + contador + " = " + a);
            a = n * contador + n;
        }
    }
}
//Ejercicio 15 con for
/*   for (int num = 1; num <= n; num++) {
            System.out.println(num);

        }
        System.out.println("Llegaste hasta tu numero, el " + n);

        for (int num = n; num >= 1; num--){
            System.out.println(num);
     }
*/
//Ejercicio 16 con for
/*        int suma = 0;

        for (int contador = 1; contador <= n; contador++){
            suma += contador;
        }
        System.out.println("Suma: " + suma);
        System.out.printf("media; %.2f", suma / (double) n);
*/
