import java.util.Scanner;
public class UD2ejercicio7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dime la nota (0 y 10): ");
    double nota = scanner.nextDouble();

    if (nota < 0 || nota > 10) {
        System.out.print("Dame una nota que este dentro del rango");
    } else if (nota < 5) {
        System.out.print("Insuficiente");
    } else if (nota < 6) {
        System.out.print("Suficiente");
    } else if (nota < 7) {
    System.out.print("Bien");
    } else if (nota < 9) {
    System.out.print("Notable");
    } else if (nota < 10 || nota == 10) {
        System.out.print("Sobresaliente");
    }
    }
}
