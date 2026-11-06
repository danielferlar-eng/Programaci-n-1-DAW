import java.util.Scanner;
public class UD4ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = sc.nextDouble();
        }

        // a) todos los valores
        System.out.print("Valores:");
        for (double item : v) {
            System.out.print(" " + item);
        }
        System.out.println();

        // b) la suma
        double suma = 0;
        for (double value : v) {
            suma += value;
        }
        System.out.println("Suma: " + suma);

        // c) máximo y mínimo: el candidato inicial es el primer elemento
        double max = v[0];
        double min = v[0];
        for (double item : v) {
            max = Math.max(max, item);
            min = Math.min(min, item);
        }
        System.out.println("Máximo: " + max + "   Mínimo: " + min);

        // d) suma de positivos y de negativos, por separado
        double sumaPos = 0;
        double sumaNeg = 0;
        for (double value : v) {
            if (value > 0) {
                sumaPos += value;
            }
            if (value < 0) {
                sumaNeg += value;
            }
        }
        System.out.println("Positivos: " + sumaPos + "   Negativos: " + sumaNeg);

        // e) la media: se divide entre v.length, no entre 10
        System.out.printf("Media: %.2f%n", suma / v.length);
    }
}
