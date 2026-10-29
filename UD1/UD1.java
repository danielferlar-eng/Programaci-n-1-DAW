import java.util.Scanner;
/** Calcula el precio final de un producto aplicando el IVA.
 * Autor: ... · Fecha: ... */
public class UD1 {
    public static void main(String[] args) {
        final double IVA = 0.21; // constante: el IVA general
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio sin IVA: ");
        double base = sc.nextDouble();
        double total = base * (1 + IVA); // expresión numérica
        System.out.printf("Precio final: %.2f euros%n", total);
        sc.close();
    }
}