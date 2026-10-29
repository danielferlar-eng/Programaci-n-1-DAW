import java.util.Scanner;
public class UD2ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 Piedra 2 papel o 3 tijera");

        //Elecciones
        System.out.print("Elige Jugardor 1: ");
        int j1 = scanner.nextInt();

        System.out.print("Elige Jugardor 2: ");
        int j2 = scanner.nextInt();

        //Posibilidades
        if ((j1 < 1 || j1 > 3) || (j2 < 1 || j2 > 3)) {
            System.out.print("Error, elije 1, 2 o 3");
        } else if (j1 == j2) {
            System.out.print("Empate");

        } else if (j1 == 1 && j2 == 3 || j1 == 2 && j2 == 1 || j1 == 3 && j2 == 2) {
            System.out.println("Gana el Jugador 1");
        } else {
            System.out.println("Gana el Jugador 2");

        }
    }
        }
