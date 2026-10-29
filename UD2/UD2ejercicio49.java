    import java.util.Scanner;

    /**
     * Ejercicio 49 · ¿Ha habido algún negativo?
     *
     * Basta con un booleano: empieza en false y se pone en true si aparece algún
     * negativo. No hace falta contar nada ni recordar cuál era.
     *
     * Una vez que está en true ya no puede volver atrás, así que el bucle podría
     * cortarse con un break; aquí se leen los diez de todas formas porque el
     * enunciado dice que se leen diez números.
     *
     * El enunciado original pedía resolverlo con una función. Los métodos se estudian
     * en la unidad siguiente, así que esto va dentro del main.
     */
    public class UD2ejercicio49 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            boolean hayNegativo = false;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Número " + i + ": ");
                int n = sc.nextInt();
                if (n < 0) {
                    hayNegativo = true;
                }
            }

            System.out.println(hayNegativo ? "Sí, había algún negativo." : "No, ninguno era negativo.");
        }
    }
