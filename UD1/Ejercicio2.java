public class Ejercicio2 {
    public static void main(String[] args) {

        int x = 2, y = 3;
        double n = 4, m = 5;

        System.out.println("NUMEROS Y OPERACIONES: ");
        System.out.println("Int: " + x + " → " + y);
        System.out.println("Double: " + n + " → " + m);
        System.out.println("Enteros: " + (x + y) + " | " + (x - y) + " | " + (x * y) + " | " + (x / y) + " resto: " + (x % y));
        System.out.println("Reales: " + (n + m) + " | " + (n - m) + " | " + (n * m) + " | " + (n / m) + " resto: " + (n % m));
        System.out.println("Mezclados: " + (x + n) + " | " + (y / m) + " | " + (y % n));
        System.out.println("Final: " + (x * 2) + " | " + (y * 2) + " | " + (n * 2) + " | " + (m * 2) + " || " + (x + y + n +m) + " || " + (x * y * n * m) );

    }
}
