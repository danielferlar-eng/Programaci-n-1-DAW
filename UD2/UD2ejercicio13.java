import java.util.Scanner;
public class UD2ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la nota (0 y 10): ");
        double nota = sc.nextDouble();

        switch ((int) nota) {
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.print("Dame un numero valido");
        }
        System.out.println(nota >= 5 ? "Aprobado" : "Suspendido");
    }
}
