import java.util.Scanner;
public class UD2ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
       do {

           System.out.print("""
                   --- MENÚ ---
                   1. Sumar dos números
                   2. ¿Es par?
                   3. Factorial
                   0. Salir
                   Opción:  """);
           a = sc.nextInt();

           switch (a){
               case 1 :
                   System.out.print("Primer numero: ");
                   int primero = sc.nextInt();
                   System.out.print("Segundo numero: ");
                   int segundo = sc.nextInt();

                   System.out.println("Resultado: " + (primero + segundo));

               break;

               case 2 :
                   System.out.print("Dime el numero: ");
                   int dos = sc.nextInt();

                   if ( dos % 2 == 0){
                       System.out.println("Es par");
                   } else if ( dos % 2 != 0){
                   System.out.println("Es impar");
                   }
                   break;

               case 3 :
                   System.out.print("Dame el numero: ");
                   int facto = sc.nextInt();

                   if (facto < 0) {
                       System.out.println("No existe factorial");
                   } else {
                       long factorial = 1;

                       for (int i = 1; i <= facto; i++) {
                           factorial *= i;
                       }

                       System.out.println("Factorial: " + factorial);
                   }
               break;
               case 0:
                   System.out.println("Saliendo del programa...");
                   break;

               default:
                   System.out.println("Opcion no valida");
                   break;
           }

       } while ( a != 0);

    }
}

