import java.util.Scanner;
public class UD3ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        dibujarFigura(n);
    }

    public static void dibujarFigura(int n) {

        for (int fila = 1; fila <= n; fila++) {

            for (int columna = 1; columna <= n; columna++) {

                if (fila == columna) {
                    System.out.print(fila);
                } else {
                    System.out.print("0");
                }

            }

            System.out.println();
        }
    }
}
