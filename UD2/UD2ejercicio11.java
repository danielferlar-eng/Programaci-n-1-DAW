import java.util.Scanner;
public class UD2ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que quieres hacer? + | - | * | / |?: ");
        String op = sc.nextLine().toLowerCase();
        System.out.println("Primer numero: ");
        double a = sc.nextDouble();
        System.out.println("Segundo numero: ");
        double b = sc.nextDouble();

        switch (op) {
            case "+":
                System.out.printf("%.2f +  %.2f = %.2f%n", a, b, a + b);
                break;
            case "-":
                System.out.printf("%.2f -  %.2f = %.2f%n", a, b, a - b);
                break;
            case "*":
                System.out.printf("%.2f *  %.2f = %.2f%n", a, b, a * b);
                break;
            case "/":
                System.out.printf("%.2f /  %.2f = %.2f%n", a, b, a / b);
                break;
        }
    }
}