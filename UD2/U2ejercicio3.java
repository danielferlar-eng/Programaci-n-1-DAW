import java.util.Scanner;
public class U2ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Producto: " );
        String producto = sc.nextLine();

        System.out.print("Unidades: ");
        int unidades = sc.nextInt();

        System.out.print("Precio unitario: ");
        double precio =sc.nextDouble();
        double total = unidades * precio;

        System.out.println("\n--- RESUMEN DEL PEDIDO ---");
        System.out.println(producto + " x" + unidades);
        System.out.printf("Total: %10.2f euros%n", total);

    }
}
