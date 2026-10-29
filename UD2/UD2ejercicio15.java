import java.util.Scanner;
public class UD2ejercicio15 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int n = sc.nextInt();
        int num = 1;

        while (num <= n) {
            System.out.println(num);
            num++;
        }
        System.out.println("Llegaste hasta tu numero, el " + n);

        num = n;
        while (num >= 1){
            System.out.println(num);
            num--;
        }
    }
}
