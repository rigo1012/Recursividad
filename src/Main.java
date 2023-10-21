public class Main {


            public static void main(String[] args) {
                int n = 10;
                for (int j = 0; j < n; j++) {
                    System.out.print(numero(j) + " ");
                }
            }

            public static int numero(int n) {
                if (n <= 1) {
                    return n;
                } else {
                    return numero(n - 1) + numero(n - 2);
                }
            }
        }

