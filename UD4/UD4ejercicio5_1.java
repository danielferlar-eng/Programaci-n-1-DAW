import java.util.Scanner;
public class UD4ejercicio5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime cuantas cadenas: ");
        int n = sc.nextInt();

        String[] cadenas = new String[n];

        llenar(cadenas, sc);
        mostrar(cadenas);

        System.out.println("Suma: " + sumar(cadenas));
        System.out.println("Maximo: " + maximo(cadenas));
        System.out.println("Minimo: " + minimo(cadenas));
        System.out.println("Media: " + media(cadenas));
    }

    // LLENAR EL ARRAY
    public static void llenar(String[] cadenas, Scanner sc) {
        sc.nextLine();

        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("Introduce la cadena numerica numero " + (i + 1) + ": ");
            cadenas[i] = sc.nextLine();
        }
    }

    // MOSTRAR EL ARRAY
    public static void mostrar(String[] cadenas) {
        for (String cadena : cadenas) {
            System.out.print(cadena + " ");
        }
        System.out.println();
    }

    // SUMAR LOS ELEMENTOS
    public static double sumar(String[] cadenas) {
        double suma = 0;

        for (int i = 0; i < cadenas.length; i++) {
            suma += Double.parseDouble(cadenas[i]);
        }

        return suma;
    }

    // BUSCAR EL MAXIMO
    public static double maximo(String[] cadenas) {
        double max = Double.parseDouble(cadenas[0]);

        for (int i = 1; i < cadenas.length; i++) {
            double numero = Double.parseDouble(cadenas[i]);

            if (numero > max) {
                max = numero;
            }
        }

        return max;
    }

    // BUSCAR EL MINIMO
    public static double minimo(String[] cadenas) {
        double min = Double.parseDouble(cadenas[0]);

        for (int i = 1; i < cadenas.length; i++) {
            double numero = Double.parseDouble(cadenas[i]);

            if (numero < min) {
                min = numero;
            }
        }

        return min;
    }

    // CALCULAR LA MEDIA
    public static double media(String[] cadenas) {
        return sumar(cadenas) / cadenas.length;
    }
}
