public class UD3ejercicio13 {
    public static void main(String[] args) {
        double n = 3.14159;

        System.out.println(redondear(n)); // 3
        System.out.println(redondear(n, 2)); // 3.14
        System.out.println(redondear(n, 2, true)); // 3.15, siempre hacia arriba
        System.out.println(redondear(2.341, 1, true)); // 2.4
    }

    // Al entero más cercano.
    public static long redondear(double n) {
        return Math.round(n);
    }

    // A ese número de decimales: se multiplica, se redondea y se vuelve a dividir.
    public static double redondear(double n, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(n * factor) / factor;
    }

    // Igual, pero si alAlza es true nunca redondea hacia abajo.
    public static double redondear(double n, int decimales, boolean alAlza) {
        double factor = Math.pow(10, decimales);
        if (alAlza) {
            return Math.ceil(n * factor) / factor;
        }
        return Math.round(n * factor) / factor;
    }
}
