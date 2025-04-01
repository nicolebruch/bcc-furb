import java.util.Scanner;

public class Main01 {

        public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        int somaCD = C + D;
        int somaAB = A + B;

        if (B > C && D > A && somaCD > somaAB && C >= 0 && D >= 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");

        } else {
            System.out.println("Valores nao aceitos");
        }

    }

}


