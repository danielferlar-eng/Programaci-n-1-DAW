import java.util.Scanner;
public class UD2ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;
        int mayor = 0;
        int menor = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.print("Introduce un número (0 para terminar): ");
        numero = sc.nextInt();

        if (numero != 0) {
            mayor = numero;
            menor = numero;
        }

        while (numero != 0) {

            cantidad++;
            suma += numero;

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }

            System.out.print("Introduce un número (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cantidad de números: " + cantidad);
        System.out.println("Suma: " + suma);

        if (cantidad > 0) {
            double media = (double) suma / cantidad;

            System.out.println("Media: " + media);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        } else {
            System.out.println("No se han introducido números.");
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

    }
}
