import java.util.Scanner;
public class UD2ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int minimo = 1;
            int maximo = 10;
            int intento;
            boolean acierto = false;

                System.out.println("Piensa un número del 1 al 10.");
                System.out.println("Yo intentaré adivinarlo en 3 intentos.");

                for (int i = 1; i <= 3; i++) {

                    intento = (minimo + maximo) / 2;

                    System.out.println("¿El número es " + intento + "?");
                    String respuesta = scanner.nextLine();

                    if (respuesta.equalsIgnoreCase("si") ||
                            respuesta.equalsIgnoreCase("sí")) {

                        System.out.println("Gané");
                        acierto = true;
                        break;

                    } else {

                        System.out.println("¿Es mayor o menor?");
                        respuesta = scanner.nextLine();

                        if (respuesta.equalsIgnoreCase("mayor")) {
                            minimo = intento + 1;
                        } else if (respuesta.equalsIgnoreCase("menor")) {
                            maximo = intento - 1;
                        }
                    }
                }

                if (!acierto) {
                    System.out.println("No he conseguido adivinarlo en 3 intentos.");
                    System.out.println("Me arriesgo a decir que es el " + minimo);
                }

                scanner.close();
            }
        }