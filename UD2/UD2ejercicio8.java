import java.util.Scanner;
public class UD2ejercicio8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un año: ");
            int año = sc.nextInt();

            if (año % 400 == 0) {
                System.out.println("Es bisiesto");
            } else if (año % 100 == 0) {
                System.out.println("No es bisiesto");
            } else if (año % 4 == 0) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        }
    }
