import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        // cria um array com os tres valorzins
        int[] valores = {a, b, c};

        // ordena certin o array em ordem crescente
        java.util.Arrays.sort(valores);

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        // imprime uma linha em branco
        System.out.println();

        // imprime os valores na ordem em que foram lidos usando 'for'
        int[] originais = {a, b, c};
        for (int i = 0; i < originais.length; i++) {
            System.out.println(originais[i]);
        }

        entrada.close();
    }
}
