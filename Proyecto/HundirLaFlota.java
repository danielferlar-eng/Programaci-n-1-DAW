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
        char[][] tableroPC = new char[10][10];
        char[][] tableroDisparosPC = new char[10][10];

        inicializarTablero(tableroJugador);
        inicializarTablero(tableroDisparosJugador);
        inicializarTablero(tableroPC);
        inicializarTablero(tableroDisparosPC);

        visualizarTablero(tableroJugador, tableroDisparosJugador);

        leerCoordenada(
        """              
                
                Introduce la cordenada (Ejemplo: C3): 
                """);
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

    // Pide y valida una coordenada
    public static int[] leerCoordenada(String mensaje) {
        int[] posicion = new int[2];

        while (true) {
            System.out.print(mensaje);
            String coordenada = teclado.nextLine();

            if (coordenada.length() == 2) {

                char letra = Character.toUpperCase(coordenada.charAt(0));
                char numero = coordenada.charAt(1);

                if (letra >= 'A' && letra <= 'J' &&
                        numero >= '0' && numero <= '9') {

                    posicion[0] = letra - 'A';
                    posicion[1] = numero - '0';

                    return posicion;
                }
            }
            System.out.println("Coordenada incorrecta.");
        }
    }

    // ===== TABLERO =====

    // Inicializa el tablero
    public static void inicializarTablero(char[][] tablero) {
        for (int f = 0; f < tablero.length; f++) {
            for (int c = 0; c < tablero[f].length; c++) {
                tablero[f][c] = '~';
            }
        }
    }

    // Visualiza los dos tableros
    public static void visualizarTablero(char[][] tablero, char[][] tableroDisparos) {

        System.out.println("\n       TU FLOTA                 TUS DISPAROS");

        // Numeros del primer tablero
        System.out.print("  ");
        for (int c = 0; c < tablero[0].length; c++) {
            System.out.print(c + " ");
        }

        // Numeros del segundo tablero
        System.out.print("       ");
        for (int c = 0; c < tableroDisparos[0].length; c++) {
            System.out.print(c + " ");
        }

        System.out.println();

        // Filas y casillas de ambos tableros
        for (int f = 0; f < tablero.length; f++) {

            // Letra del primer tablero
            System.out.print((char) ('A' + f) + " ");

            // Casillas del primer tablero
            for (int c = 0; c < tablero[f].length; c++) {
                System.out.print(tablero[f][c] + " ");
            }

            // Letra del segundo tablero
            System.out.print("       " + (char) ('A' + f) + " ");

            // Casillas del segundo tablero
            for (int c = 0; c < tableroDisparos[f].length; c++) {
                System.out.print(tableroDisparos[f][c] + " ");
            }

            System.out.println();
        }
    }

    // ===== DISPAROS =====

    // ===== UTILIDADES =====

}