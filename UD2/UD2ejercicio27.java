public class UD2ejercicio27 {
     public static void main(String[] args) {

        for (int numero = 2; numero <= 100; numero++) {
            boolean tieneDivisor = false;

            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    tieneDivisor = true;
                    break;
                }
            }

            if (!tieneDivisor) {
                System.out.println(numero);
            }
        }
    }
}

