import java.util.Scanner;
public class UD2ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        int intentos = 0;

        do {
            System.out.print("Introduce tu edad (0-120): ");
            edad = sc.nextInt();
            intentos++;

            if (edad < 0 || edad > 120) {
                System.out.println("Error, la edad debe estar entre 0 y 120.");
            }

        } while (edad < 0 || edad > 120);

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        System.out.println("Número de intentos: " + intentos);

    }
}

