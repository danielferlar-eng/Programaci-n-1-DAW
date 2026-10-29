import java.util.Scanner;

/**
 * Ejercicio 51 · Suma y producto.
 *
 * El enunciado original pedía dos funciones, una para cada operación. Los métodos
 * se estudian en la unidad siguiente, así que aquí se resuelve en el main. En la
 * UD3 este ejercicio vuelve a aparecer, y entonces sí con dos métodos.
 */
public class UD2ejercicio51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        System.out.println("Suma:     " + (a + b));
        System.out.println("Producto: " + a * b);
    }
}