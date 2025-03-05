/*Escreva um algoritmo que obtém do usuário 3 valores inteiros 
representando as três cartas deste usuário em uma mão de jogo de truco 
(1 = AS; 
2 = 2; 
3 = 3; 
7 = 7; 
11 = Valete; 
12 = Dama; 
13 = Rei). 
O algoritmo deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), 
"SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou 
"NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). 
Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
Dica: criar variáveis intermediárias para contar a quantidade de "boas".
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {

        /* scanner p pegar as informações do usuário */
        Scanner entrada = new Scanner(System.in);

        /* usuário me informando o valor das 3 cartas */
        System.out.println("Informe o valor da primeira carta: ");
        int carta1 = entrada.nextInt();

        System.out.println("Informe o valor da segunda carta: ");
        int carta2 = entrada.nextInt();

        System.out.println("Informe o valor da terceira carta: ");
        int carta3 = entrada.nextInt();

        /* fechando o scanner para não consumir memória */
        entrada.close();

    }

    /*
     * crio um método para validar se a carta1 é igual a "1", "2" ou "3",
     * pois caso for, é uma carta boa
     */
    private static boolean cartaUmBoa(int carta1) {
        return carta1 == 1 || carta1 == 2 || carta1 == 3;
    }

    /*
     * crio um método para validar se a carta2 é igual a "1", "2" ou "3",
     * pois caso for, é uma carta boa
     */
    private static boolean cartaDoisBoa(int carta2) {
        return carta2 == 1 || carta2 == 2 || carta2 == 3;
    }

    /*
     * crio um método para validar se a carta3 é igual a "1", "2" ou "3",
     * pois caso for, é uma carta boa
     */
    private static boolean cartaTresBoa(int carta3) {
        return carta3 == 1 || carta3 == 2 || carta3 == 3;
    }

    private static int contaCartasBoas(int carta1, int carta2, int carta3) {
        /*
         * é um contador, onde verifica quantas cartas boas vao ser inseridas,
         * as cartas boas sao consideradas "1", "2" e "3"
         */
        int quantidadeCartasBoas = 0;

        /*
         * se a carta1 tiver uma carta boa,
         * o contador vai sair de "0" para "1"
         */
        if (cartaUmBoa(carta1)) {
            quantidadeCartasBoas++;
        }
        /*
         * se a carta2 tiver uma carta boa,
         * o contador vai sair de "0" para "1", ou
         * de "1" para "2"
         */
        if (cartaDoisBoa(carta2)) {
            quantidadeCartasBoas++;
        }
        /*
         * se a carta3 tiver uma carta boa,
         * o contador vai sair de "0" para "1", ou
         * de "1" para "2", e caso todas sejam boas,
         * de "2" para "3"
         */
        if (cartaTresBoa(carta3)) {
            quantidadeCartasBoas++;
        }

        /*
         * vai retornar quantas cartas eram boas das 3
         * que o usuário informou
         */
        return quantidadeCartasBoas;
    }

    /* metodo vai mostrar ao usuário o resultado, onde */
    private static void mostrarResultado(int quantidadeCartasBoas) {
        /*
         * imprimir na tela a palavra "TRUCO"
         * (se APENAS UMA das três cartas for AS, 2 ou 3)
         */
        if (quantidadeCartasBoas == 1) {
            System.out.println("TRUCO");
        } else if (quantidadeCartasBoas == 2) {
            /*
             * imprimir na tela a palavra "SEIS"
             * (se APENAS DUAS das três cartas for AS, 2 ou 3)
             */
            System.out.println("SEIS");
            /*
             * imprimir na tela a palavra "NOVE"
             * (se AS TRÊS cartas forem AS, 2 ou 3)
             */
        } else if (quantidadeCartasBoas == 3) {
            System.out.println("NOVE");
        }
    }
}
