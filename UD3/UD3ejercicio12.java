import java.util.Scanner;
public class UD3ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        int dni = sc.nextInt();

        char letra = calcularLetra(dni);

        System.out.println("letra: " + letra);
    }

    public static char calcularLetra(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int resto = dni % 23;

        return letras.charAt(resto);
    }
}


