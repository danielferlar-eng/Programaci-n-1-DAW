import java.util.Scanner;
public class UD2ejercicio23 {
    public static void main(String[] args){

    int par = 0;
    int impar = 0;
        //version 1
/*
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                par += i;
            } else {
                impar += i;
            }
        }
        System.out.println("Suma de los pares: " + par);
        System.out.println("Suma de los impares: " + impar);

         */
        //version 2
        for (int i = 100; i <= 200; i++) {
            par += i;
        }
        for (int i = 101; i <= 200; i++) {
            impar += i;
        }
        System.out.println("Suma de los pares: " + par);
        System.out.println("Suma de los impares: " + impar);
    }
}
