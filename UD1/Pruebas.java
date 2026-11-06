import java.util.Scanner;
public class Pruebas {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre = leerNombre();
        int[] barcos = {4, 3, 3, 2, 2, 1};

        char[][] jugador = new char[10][10];
        char[][] disparosJugador = new char[10][10];
        char[][] pc = new char[10][10];
        char[][] disparosPC = new char[10][10];

        inicializarTablero(jugador);
        inicializarTablero(disparosJugador);
        inicializarTablero(pc);
        inicializarTablero(disparosPC);

        int total = sumaCeldas(barcos);
        int aciertosJugador = 0;
        int aciertosPC = 0;

        colocarBarcosJugador(jugador, disparosJugador, barcos);
        colocarBarcosPC(pc, barcos);

        while (aciertosJugador < total && aciertosPC < total) {

            borrarPantalla();
            visualizarTablero(jugador, disparosJugador);

            System.out.println("\nAciertos que te faltan para ganar: "
                    + (total - aciertosJugador));
            System.out.println("Aciertos que le faltan al PC: "
                    + (total - aciertosPC));

            if (disparoJugador(disparosJugador, pc, nombre))
                aciertosJugador++;

            if (aciertosJugador < total) {
                if (disparoPC(disparosPC, jugador))
                    aciertosPC++;
            }

            if (aciertosJugador < total && aciertosPC < total) {
                System.out.println("\nPulsa ENTER para continuar.");
                teclado.nextLine();
            }
        }

        borrarPantalla();

        if (aciertosJugador == total) {
            System.out.println("¡Enhorabuena, " + nombre + "! ¡Has ganado!");
        } else {
            System.out.println("¡El ordenador ha ganado!");
            System.out.println("\nFlota del ordenador:");
            visualizarTablero(pc, disparosJugador);
        }
    }

    // ===== ENTRADA =====

    // Pide el nombre.
    public static String leerNombre() {
        String nombre;

        do {
            System.out.print("Introduce tu nombre: ");
            nombre = teclado.nextLine();
        } while (nombre.length() == 0);

        return nombre;
    }

    // Comprueba el formato de una coordenada.
    public static boolean coordenadaValida(String c) {
        return c.length() == 2
                && Character.toUpperCase(c.charAt(0)) >= 'A'
                && Character.toUpperCase(c.charAt(0)) <= 'J'
                && c.charAt(1) >= '0'
                && c.charAt(1) <= '9';
    }

    // Lee una coordenada.
    public static int[] leerCoordenada(String mensaje) {
        String c;
        int[] posicion = new int[2];

        do {
            System.out.print(mensaje);
            c = teclado.nextLine();

            if (!coordenadaValida(c))
                System.out.println("Coordenada no válida. Ejemplo: B7.");

        } while (!coordenadaValida(c));

        posicion[0] = Character.toUpperCase(c.charAt(0)) - 'A';
        posicion[1] = c.charAt(1) - '0';

        return posicion;
    }

    // Lee la orientación.
    public static int leerOrientacion() {
        String o;

        do {
            System.out.print("Orientación (H/V): ");
            o = teclado.nextLine().toUpperCase();
        } while (!o.equals("H") && !o.equals("V"));

        if (o.equals("H"))
            return 1;

        return 0;
    }

    // ===== TABLERO =====

    // Inicializa el tablero.
    public static void inicializarTablero(char[][] tablero) {
        for (int f = 0; f < tablero.length; f++)
            for (int c = 0; c < tablero[f].length; c++)
                tablero[f][c] = '~';
    }

    // Muestra los dos tableros.
    public static void visualizarTablero(char[][] tablero, char[][] tableroDisparos) {

        System.out.println("\n   TU FLOTA              TUS DISPAROS");

        System.out.print("  ");
        for (int c = 0; c < tablero[0].length; c++)
            System.out.print(c + " ");

        System.out.print("    ");
        for (int c = 0; c < tableroDisparos[0].length; c++)
            System.out.print(c + " ");

        System.out.println();

        for (int f = 0; f < tablero.length; f++) {

            System.out.print((char) ('A' + f) + " ");

            for (int c = 0; c < tablero[f].length; c++)
                System.out.print(tablero[f][c] + " ");

            System.out.print("   " + (char) ('A' + f) + " ");

            for (int c = 0; c < tableroDisparos[f].length; c++)
                System.out.print(tableroDisparos[f][c] + " ");

            System.out.println();
        }
    }

    // Comprueba si el barco cabe.
    public static boolean cabeBarco(char[][] tablero, int longitudBarco,
                                    int fila, int columna, int orientacion) {

        if (orientacion == 1)
            return columna + longitudBarco <= tablero[0].length;

        return fila + longitudBarco <= tablero.length;
    }

    // Comprueba si hay colisión.
    public static boolean hayColision(char[][] tablero, int longitudBarco,
                                      int fila, int columna, int orientacion) {

        for (int i = 0; i < longitudBarco; i++) {

            if (orientacion == 1 && tablero[fila][columna + i] == 'B')
                return true;

            if (orientacion == 0 && tablero[fila + i][columna] == 'B')
                return true;
        }

        return false;
    }

    // Coloca un barco.
    public static boolean colocarBarco(char[][] tablero, int longitudBarco,
                                       int fila, int columna, int orientacion,
                                       boolean jugador) {

        if (!cabeBarco(tablero, longitudBarco, fila, columna, orientacion)) {
            if (jugador)
                System.out.println("El barco no cabe en esa posición.");
            return false;
        }

        if (hayColision(tablero, longitudBarco, fila, columna, orientacion)) {
            if (jugador)
                System.out.println("El barco choca con otro.");
            return false;
        }

        for (int i = 0; i < longitudBarco; i++) {
            if (orientacion == 1)
                tablero[fila][columna + i] = 'B';
            else
                tablero[fila + i][columna] = 'B';
        }

        return true;
    }

    // Coloca los barcos del jugador.
    public static void colocarBarcosJugador(char[][] tablero,
                                            char[][] tableroDisparos,
                                            int[] barcos) {

        for (int i = 0; i < barcos.length; i++) {

            boolean colocado = false;

            while (!colocado) {
                borrarPantalla();
                visualizarTablero(tablero, tableroDisparos);

                System.out.println("\nBarco de " + barcos[i] + " casillas.");

                int[] p = leerCoordenada("Casilla de inicio: ");
                int o = leerOrientacion();

                colocado = colocarBarco(tablero, barcos[i],
                        p[0], p[1], o, true);
            }
        }
    }

    // Coloca los barcos del ordenador.
    public static void colocarBarcosPC(char[][] tablero, int[] barcos) {

        for (int i = 0; i < barcos.length; i++) {

            boolean colocado = false;

            while (!colocado) {
                int f = (int) (Math.random() * tablero.length);
                int c = (int) (Math.random() * tablero[0].length);
                int o = (int) (Math.random() * 2);

                colocado = colocarBarco(tablero, barcos[i], f, c, o, false);
            }
        }
    }

    // ===== DISPAROS =====

    // Disparo del jugador.
    public static boolean disparoJugador(char[][] tableroDisparosJugador,
                                         char[][] tableroPC, String nombre) {

        int[] p;
        int f, c;

        do {
            p = leerCoordenada(nombre + ", coordenada de disparo (ej. B7): ");
            f = p[0];
            c = p[1];

            if (tableroDisparosJugador[f][c] != '~')
                System.out.println("Ya habías disparado a esa casilla.");

        } while (tableroDisparosJugador[f][c] != '~');

        if (tableroPC[f][c] == 'B') {
            tableroPC[f][c] = 'T';
            tableroDisparosJugador[f][c] = 'T';
            System.out.println("¡Tocado!");
            return true;
        }

        tableroPC[f][c] = '*';
        tableroDisparosJugador[f][c] = '*';
        System.out.println("Agua.");

        return false;
    }

    // Disparo del ordenador.
    public static boolean disparoPC(char[][] tableroDisparosPC,
                                    char[][] tableroJugador) {

        int f, c;

        do {
            f = (int) (Math.random() * tableroJugador.length);
            c = (int) (Math.random() * tableroJugador[0].length);
        } while (tableroDisparosPC[f][c] != '~');

        if (tableroJugador[f][c] == 'B') {
            tableroJugador[f][c] = 'T';
            tableroDisparosPC[f][c] = 'T';
            System.out.println("El ordenador te ha tocado.");
            return true;
        }

        tableroJugador[f][c] = '*';
        tableroDisparosPC[f][c] = '*';
        System.out.println("El ordenador ha fallado.");

        return false;
    }

    // ===== UTILIDADES =====

    // Suma las casillas de los barcos.
    public static int sumaCeldas(int[] unVector) {
        int suma = 0;

        for (int i = 0; i < unVector.length; i++)
            suma += unVector[i];

        return suma;
    }

    // Borra la pantalla.
    public static void borrarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}