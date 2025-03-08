
/*Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
 */

import java.util.Arrays;
import java.util.Scanner;

public class Uni4Exe24Variacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe três valores: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();

        System.out.println(
                "Informe a ordem que você queira que printe, sendo: 1 - Ordem Crescente, 2 - Ordem Decrescente, 3 - O maior número fique no meio");
        int opcoesOrdem = entrada.nextInt();

        entrada.close();

        switch(opcoesOrdem) {
            case 1:
                ordemCrescente(numero1, numero2, numero3);
                break;
            case 2:
                ordemDecrescente(numero1, numero2, numero3);
                break;
            case 3:
                maiorNoMeio(numero1, numero2, numero3);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void ordemCrescente(int numero1, int numero2, int numero3) {
        int[] numeros = { numero1, numero2, numero3 };
        /* poe em ordem descrecente */
        Arrays.sort(numeros);
        /* ordena os números automaticamente em ordem crescente */
        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2]);
    }

    private static void ordemDecrescente(int numero1, int numero2, int numero3) {
        int[] numeros = { numero1, numero2, numero3 };
        /* poe em ordem crescente */
        Arrays.sort(numeros);
        /* inverto os números */
        System.out.println(numeros[2] + " " + numeros[1] + " " + numeros[0]);
    }

    private static void maiorNoMeio(int numero1, int numero2, int numero3) {
        int[] numeros = { numero1, numero2, numero3 };
        /* ordena os números */
        Arrays.sort(numeros);

        /* coloco o número maior no meio */
        System.out.println(numeros[0] + " " + numeros[2] + " " + numeros[1]);
    }
}
