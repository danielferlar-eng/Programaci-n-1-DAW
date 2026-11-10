import java.util.Scanner;
public class HundirLaFlota {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("""
                =========================
                     HUNDIR LA FLOTA
                  Daniel Fernandez Lara
                      DAW 2026/2027
                =========================
                """);
        System.out.print("Introduce tu nombre: ");
        String name = teclado.nextLine();

        char[][] tableroJugador = new char[10][10];
        char[][] tableroDisparosJugador = new char[10][10];
        char[][] tableroPC = new char[10][10];
        char[][] tableroDisparosPC = new char[10][10];

        inicializarTablero(tableroDisparosJugador);
        inicializarTablero(tableroDisparosPC);
        inicializarTablero(tableroPC);
        inicializarTablero(tableroJugador);
    }

    public static void inicializarTablero(char[][] tablero){
        for (int f = 0; f < tablero.length; f++)
            for (int c = 0; c < tablero[f].length; c++)
                tablero[f][c] = '~';
    }

    public static void visualizarTablero(char[][] tablero, char[][] tableroDisparos){
        System.out.print(" ");
       for (int a = 0; a < tablero[0].length; a++) {
           System.out.print(a + " ");
       }
        System.out.println();

        for (int i = 0; i < tablero.length; i++){
            char letra = (char) ('A' + i);
            System.out.print(letra + " ");

        for (int j = 0; j < tablero[i].length; j++) {
            System.out.print(tablero[i][j] + " ");
            System.out.print(tableroDisparos[i][j] + " ");
        }

        System.out.println();
    }
}
}
