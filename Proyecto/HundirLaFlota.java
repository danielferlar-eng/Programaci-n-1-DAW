import java.util.Scanner;
public class HundirLaFlota {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("""
                =========================
                     HUNDIR LA FLOTA
                  Daniel Fernandez Lara
                      DAW 2026/2027
                =========================
                """);
        String nombre = leerNombre();

        char[][] tableroJugador = new char[10][10];
        char[][] tableroDisparosJugador = new char[10][10];
        char[][] tablero = new char[10][10];
        char[][] tableroDisparos = new char[10][10];

        inicializarTablero(tableroDisparosJugador);
        inicializarTablero(tableroDisparos);
        inicializarTablero(tablero);
        inicializarTablero(tableroJugador);
        visualizarTablero(tablero, tableroDisparos);
    }

    // ===== ENTRADA =====

    // Pide y guarda el nombre
    public static String leerNombre() {
        String nombre;

        do {
            System.out.print("Introduce tu nombre: ");
            nombre = teclado.nextLine();
        } while (nombre.length() == 0);

        return nombre;
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int f = 0; f < tablero.length; f++)
            for (int c = 0; c < tablero[f].length; c++)
                tablero[f][c] = '~';
    }

    public static void visualizarTablero(char[][] tablero, char[][] tableroDisparos) {
        System.out.println("\n   TU FLOTA                TUS DISPAROS");

        //letras y agua
        for (int f = 0; f < tablero.length; f++) {
            //letras
            System.out.print((char) ('A' + f) + " ");
            //agua
            for (int c = 0; c < tablero[f].length; c++)
                System.out.print(tablero[f][c] + " ");

            //letras
            System.out.print("   " + (char) ('A' + f) + " ");
            //agua
            for (int c = 0; c < tableroDisparos[f].length; c++)
                System.out.print(tableroDisparos[f][c] + " ");

            System.out.println();
        }
        //numeros primer tablero
        System.out.print("  ");
        for (int c = 0; c < tablero[0].length; c++)
            System.out.print(c + " ");

        //numeros segundo tablero
        System.out.print("     ");
        for (int c = 0; c < tableroDisparos[0].length; c++)
            System.out.print(c + " ");

        System.out.println();
        }
    }