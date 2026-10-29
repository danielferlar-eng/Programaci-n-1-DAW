import java.util.Scanner;
public class UD2ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Cine");
        System.out.print("Para que dia quieres las entradas?: ");
        String miercoles = sc.nextLine();
//dia
        if (miercoles.equals("miercoles")) {
            System.out.println("Tienes un descuento de 2€");
        }
//años
        System.out.print("Cuantos años tienes?: ");
        int años = sc.nextInt();
        if (años > 14 || años < 65) {
            System.out.print("9€");
        } else if (años <= 14 ) {
            System.out.print("6€");
        }


    }
}