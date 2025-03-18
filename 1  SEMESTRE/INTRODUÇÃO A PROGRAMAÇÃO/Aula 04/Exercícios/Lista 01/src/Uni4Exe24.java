
/*Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
 */

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {

        /** cria um objeto scanner para ler os dados fornecidos pelo usuario */
        Scanner entrada = new Scanner(System.in);

        /** solicita ao usuario que informe tres valores inteiros */
        System.out.println("Informe tres valores: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();

        /**
         * exibe um menu de opcoes para o usuario escolher a ordem que deseja imprimir
         * os numeros
         */
        System.out.println(
                "Informe a ordem que voce queira que printe, sendo: 1 - Ordem Crescente, 2 - Ordem Decrescente, 3 - O maior numero fique no meio");
        /** le a opcao escolhida pelo usuario */
        int opcoesOrdem = entrada.nextInt();

        /** fecha o scanner apos a leitura dos dados */
        entrada.close();

        /** verifica qual opcao foi escolhida e chama a funcao correspondente */
        switch (opcoesOrdem) {
            case 1:
                ordenarCrescente(numero1, numero2, numero3);
                /** chama o metodo para ordenar em ordem crescente */
                break;
            case 2:
                ordenarDecrescente(numero1, numero2, numero3);
                /** chama o metodo para ordenar em ordem decrescente */
                break;
            case 3:
                maiorNoMeio(numero1, numero2, numero3);
                /** chama o metodo para colocar o maior numero no meio */
                break;
            default:
                /** caso o usuario escolha uma opcao invalida, exibe uma mensagem de erro */
                System.out.println("Opcao invalida.");
                break;
        }
    }

    /**
     * metodo para ordenar os numeros em ordem crescente
     */
    private static void ordenarCrescente(int numero1, int numero2, int numero3) {
        /**
         * declaracao das variaveis para armazenar os numeros na ordem desejada
         * numeroMenor - menor numero
         * numeroDoMeio - numero do meio
         * numeroMaior - maior numero
         */
        int numeroMenor, numeroDoMeio, numeroMaior;

        /**
         * verifica se o numero1 e o menor entre os tres numeros
         * se for, atribui numeroMenor a numero1 e faz a verificacao dos outros dois
         * numeros
         */
        if (numero1 <= numero2 && numero1 <= numero3) {
            numeroMenor = numero1;
            /**
             * verifica se o numero2 e menor ou igual ao numero3
             * se for, numero2 e o numeroDoMeio e numero3 e o maior
             * caso contrario, numero3 e o numeroDoMeio e numero2 e o maior
             */
            if (numero2 <= numero3) {
                numeroDoMeio = numero2;
                numeroMaior = numero3;
            } else {
                numeroDoMeio = numero3;
                numeroMaior = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            numeroMenor = numero2;
            /**
             * verifica se o numero1 e menor ou igual ao numero3
             * se for, numero1 e o numeroDoMeio e numero3 e o maior
             * caso contrario, numero3 e o numeroDoMeio e numero1 e o maior
             */
            if (numero1 <= numero3) {
                numeroDoMeio = numero1;
                numeroMaior = numero3;
            } else {
                numeroDoMeio = numero3;
                numeroMaior = numero1;
            }
        } else {
            numeroMenor = numero3;
            /**
             * verifica se o numero1 e menor ou igual ao numero2
             * se for, numero1 e o numeroDoMeio e numero2 e o maior
             * caso contrario, numero2 e o numeroDoMeio e numero1 e o maior
             */
            if (numero1 <= numero2) {
                numeroDoMeio = numero1;
                numeroMaior = numero2;
            } else {
                numeroDoMeio = numero2;
                numeroMaior = numero1;
            }
        }

        /** imprime os numeros na ordem crescente */
        System.out.println(numeroMenor + " " + numeroDoMeio + " " + numeroMaior);
    }

    /**
     * metodo para ordenar os numeros em ordem decrescente
     */
    private static void ordenarDecrescente(int numero1, int numero2, int numero3) {
        int numeroMenor, numeroDoMeio, numeroMaior;

        /**
         * verifica se o numero1 e o maior entre os tres
         * se for, atribui numeroMaior a numero1 e faz a verificacao dos outros dois
         * numeros
         */
        if (numero1 >= numero2 && numero1 >= numero3) {
            numeroMaior = numero1;
            /**
             * verifica se o numero2 e maior ou igual ao numero3
             * se for, numero2 e o numeroDoMeio e numero3 e o menor
             * caso contrario, numero3 e o numeroDoMeio e numero2 e o menor
             */
            if (numero2 >= numero3) {
                numeroDoMeio = numero2;
                numeroMenor = numero3;
            } else {
                numeroDoMeio = numero3;
                numeroMenor = numero2;
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            numeroMaior = numero2;
            /**
             * verifica se o numero1 e maior ou igual ao numero3
             * se for, numero1 e o numeroDoMeio e numero3 e o menor
             * caso contrario, numero3 e o numeroDoMeio e numero1 e o menor
             */
            if (numero1 >= numero3) {
                numeroDoMeio = numero1;
                numeroMenor = numero3;
            } else {
                numeroDoMeio = numero3;
                numeroMenor = numero1;
            }
        } else {
            numeroMaior = numero3;
            /**
             * verifica se o numero1 e maior ou igual ao numero2
             * se for, numero1 e o numeroDoMeio e numero2 e o menor
             * caso contrario, numero2 e o numeroDoMeio e numero1 e o menor
             */
            if (numero1 >= numero2) {
                numeroDoMeio = numero1;
                numeroMenor = numero2;
            } else {
                numeroDoMeio = numero2;
                numeroMenor = numero1;
            }
        }

        /** imprime os numeros na ordem decrescente */
        System.out.println(numeroMaior + " " + numeroDoMeio + " " + numeroMenor);
    }

    /**
     * metodo para ordenar os numeros de forma que o maior fique no meio
     */
    private static void maiorNoMeio(int numero1, int numero2, int numero3) {
        int numeroMenor, numeroDoMeio, numeroMaior;

        /**
         * verifica se o numero1 e o menor entre os tres
         * se for, atribui numeroMenor a numero1 e faz a verificacao dos outros dois
         * numeros
         */
        if (numero1 <= numero2 && numero1 <= numero3) {
            numeroMenor = numero1;
            /**
             * verifica se o numero2 e maior ou igual ao numero3
             * se for, numero2 e o numeroMaior e numero3 e o numeroDoMeio
             * caso contrario, numero3 e o numeroMaior e numero2 e o numeroDoMeio
             */
            if (numero2 >= numero3) {
                numeroMaior = numero2;
                numeroDoMeio = numero3;
            } else {
                numeroMaior = numero3;
                numeroDoMeio = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            numeroMenor = numero2;
            /**
             * verifica se o numero1 e maior ou igual ao numero3
             * se for, numero1 e o numeroMaior e numero3 e o numeroDoMeio
             * caso contrario, numero3 e o numeroMaior e numero1 e o numeroDoMeio
             */
            if (numero1 >= numero3) {
                numeroMaior = numero1;
                numeroDoMeio = numero3;
            } else {
                numeroMaior = numero3;
                numeroDoMeio = numero1;
            }
        } else {
            numeroMenor = numero3;
            /**
             * verifica se o numero1 e maior ou igual ao numero2
             * se for, numero1 e o numeroMaior e numero2 e o numeroDoMeio
             * caso contrario, numero2 e o numeroMaior e numero1 e o numeroDoMeio
             */
            if (numero1 >= numero2) {
                numeroMaior = numero1;
                numeroDoMeio = numero2;
            } else {
                numeroMaior = numero2;
                numeroDoMeio = numero1;
            }
        }

        /** imprime os numeros de forma que o maior fique no meio */
        System.out.println(numeroMenor + " " + numeroMaior + " " + numeroDoMeio);
    }
}
