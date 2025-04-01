import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor = entrada.nextDouble();

        if (valor >= 0 && valor <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25.0 && valor <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50.0 && valor <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75.0 && valor <= 100.0) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        entrada.close();
    }
}