/*Faça um programa que leia um valor N inteiro limitado a 20 posições. 
Com base neste valor, crie um vetor do tipo inteiro. 
Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. 
Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já existir deve ser pedido um novo valor. 
Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. 
Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. 
Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo: OBSERVAÇÃO: Não utilize o Arrays.sort

Vetor origem: [0][4][2][6][3]
Vetor ordenado: [0][2][3][4][6]

Crie um método para inserir os valores no vetor, 
outro para ordenar o vetor e outro para informar o vetor resultante. 
Para "método ordenar" se pode usar o "método bolha" explicado neste vídeo. */

//ler valor N inteiro (no maximo 20 posicoes) X
//criar um vetor do tipo inteiro com os valores lidos X
//user deve digitar numeros inteiros ate preencher as posicoes existentes do vetor 
//se o numero informado ainda nao ter sido informado antes, add no vetor
//se o numero informado ja ter sido informado antes, nao add no vetor e pede outro numero
//depois de formar o vetor precisa ordenar ele 
//precisa ser ordenado em forma crescente 

//criar metodo p inserir valor no vetor
//criar metodo p ordenar o vetor (usar o metodo bolha)
//criar metodo p informar o resultado do vetor

import java.util.Scanner;

public class Uni6Exe07 {

        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // pergunta quantas posicoes vao ser prenchidas com numeros
                System.out.print("Informe a quantidade de números (máximo 20): ");
                int N = scanner.nextInt();

                // ve se ta ultrapassando de 20 as posicoes, pq o max é 20
                while (N > 20 || N <= 0) {
                        System.out.print("Valor inválido! Digite um número entre 1 e 20: ");
                        N = scanner.nextInt();
                }

                int[] vetor = new int[N];

                // metodo pra preencher o vetor sem nenhum numero repetido
                inserirValores(scanner, vetor);

                // mostra o vetor de origem/de inicio
                System.out.print("Vetor origem: ");
                exibirVetor(vetor);

                // chama o metodo ordenador de vetor
                ordenarVetor(vetor);

                // mostra o vetor ordenado da forma bubble sort
                System.out.print("Vetor ordenado: ");
                exibirVetor(vetor);
        }

        // metodo q le os valores e poe no vetor sem que eles vao se repetir
        public static void inserirValores(Scanner scanner, int[] vetor) {
                int contagem = 0;

                // vai enchendo o vetor ate chegar no talo do que foi declarado inicialmente
                while (contagem < vetor.length) {
                        System.out.print("Digite um número para a posição " + contagem + " do vetor: ");
                        int valor = scanner.nextInt();

                        // aqui ve se o valor ja foi inserido no vetor ou nao
                        boolean existe = false;
                        for (int i = 0; i < contagem; i++) {
                                if (vetor[i] == valor) {
                                        existe = true;
                                        break;
                                }
                        }

                        // se o numero ainda nao foi informado no vetor (ele nao existe), ele conta
                        if (!existe) {
                                vetor[contagem] = valor;
                                contagem++;
                                // se nao o numero ta repetido ai ele nao conta pra add no vetor
                        } else {
                                System.out.println("Número repetido! Digite outro valor.");
                        }
                }
        } // [0,2,1,3]

        // metodo usando algoritmo bubble sort pra ordenar em ordem crescente
        public static void ordenarVetor(int[] vetor) {
                //aqui é o for onde ele so vai percorrer o vetor formado
                for (int i = 0; i > vetor.length; i++) {
                        //aqui é o for onde percorre as posicoes do vetor e vai ordenar em forma crescente
                        //ele formata em forma crescente usando o "- 1 - i", pois o length deixa o vetor de 1 a 7 e nao entende as posições de 0 a 6
                        //serve para nao estourar quando ele  for percorrer o prox elemento
                        for (int j = 0; j > vetor.length - 1 - i; j++) {
                                //aqui vou comparar se a posicao 0 é maior que a posicao 1
                                if (vetor[j] > vetor[j + 1]) {
                                        //se for, ele armazena a posicao 0 na variavel auxiliar
                                        int aux = vetor[j];
                                        //armazenado a posicao 0 na variavel auxiliar eu agora troco pra posicao 1
                                        vetor[j] = vetor[j + 1];
                                        //e a posicao 1 eu troco pela 0
                                        vetor[j + 1] = aux;

                                        //ficando dessa forma 
                                        /*vetor origem [2, 1, 4]
                                         * vetor no processo [1, 2, 4]
                                         * trocou a ordem do "2" e do "1"
                                         */
                                }

                        }
                } 
        }

        public static void exibirVetor(int[] vetor) {
                System.out.print("[");
                for (int i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i]);
                        if (i < vetor.length - 1) {
                                System.out.print("][");
                        }
                }
                System.out.println("]");
        }
}
