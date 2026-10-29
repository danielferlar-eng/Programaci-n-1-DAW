import java.util.Scanner;

    /**
     * Ejercicio 50 · ¿Cuántos positivos?
     *
     * Es el ejercicio anterior con un cambio que lo explica todo: allí bastaba con
     * saber SI había pasado algo, y para eso sirve un booleano. Aquí hay que saber
     * CUÁNTAS veces ha pasado, y eso es un contador.
     *
     * El 0 no es positivo, así que la condición es > 0 y no >= 0.
     */
    public class UD2ejercicio50 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int positivos = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Número " + i + ": ");
                int n = sc.nextInt();
                if (n > 0) {
                    positivos++;
                }
            }

            System.out.println("Positivos: " + positivos + " de 10.");
        }
    }
