public class UD2ejercicio31 {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {

                            // Primer dígito
                            if (i == 3) {
                                System.out.print("E-");
                            } else {
                                System.out.print(i + "-");
                            }

                            // Segundo dígito
                            if (j == 3) {
                                System.out.print("E-");
                            } else {
                                System.out.print(j + "-");
                            }

                            // Tercer dígito
                            if (k == 3) {
                                System.out.print("E-");
                            } else {
                                System.out.print(k + "-");
                            }

                            // Cuarto dígito
                            if (l == 3) {
                                System.out.print("E-");
                            } else {
                                System.out.print(l + "-");
                            }

                            // Quinto dígito
                            if (m == 3) {
                                System.out.println("E");
                            } else {
                                System.out.println(m);
                            }

                        }
                    }
                }
            }
        }
    }
}

