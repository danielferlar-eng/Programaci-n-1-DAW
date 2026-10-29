import java.util.Scanner;
public class UD3ejercicio5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String n = sc.nextLine();

        System.out.print("Limite inferior: ");
        int inf = sc.nextInt();

        System.out.print("Limite superior: ");
        int sup = sc.nextInt();

        String resultado = subcadena(n, inf, sup);

        System.out.println("La subcadena es: " + resultado);
    }

    public static String subcadena(String n, int inf, int sup){
            String resultado = "";

            if (inf < 0) {
                inf = 0;
            }

            if (sup > n.length()) {
                sup = n.length();
            }

            if (inf > sup) {
                return "";
            }

            for (int i = inf; i < sup; i++) {
                resultado += n.charAt(i);
            }

            return resultado;

        }
    }

