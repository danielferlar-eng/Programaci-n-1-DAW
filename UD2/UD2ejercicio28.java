import java.util.Scanner;
public class UD2ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String prohibidos = "\\|@#~\u20AC\u00AC!\u00BB\u00B7$%&/()=";

        System.out.print("Escribe una cadena: ");
        String cadena = sc.nextLine();

        boolean n = false;

        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < prohibidos.length(); j++) {
                if (cadena.charAt(i) == prohibidos.charAt(j)) {
                    n = true;
                }
            }
        }

        if (n) {
            System.out.println("Sí, contiene algún carácter prohibido.");
        } else {
            System.out.println("No contiene ningún carácter prohibido.");
        }
    }
}

