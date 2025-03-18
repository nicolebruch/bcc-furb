/*Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
(considere que a idade entre homens e mulheres sempre serão diferentes).
Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
e o produto das idades do homem mais novo com a mulher mais velha.
 */

import java.util.Scanner;

public class Uni4Exe16 {
    
    public static void main(String[] args) {

        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /*
         * peço ao usuário para informar a idade das 4 pessoas,
         * 2 homens e 2 mulheres
         */
        System.out.println("Informe a idade do primeiro homem: ");
        int idadeHomem1 = entrada.nextInt();

        System.out.println("Informe a idade do segundo homem: ");
        int idadeHomem2 = entrada.nextInt();

        System.out.println("Informe a idade da primeira mulher: ");
        int idadeMulher1 = entrada.nextInt();

        System.out.println("Informe a idade da segunda mulher: ");
        int idadeMulher2 = entrada.nextInt();

        /* fecho o scanner para não consumir memória */
        entrada.close();

        /*
         * aqui eu puxo o método void para o método main,
         * afim de visualizar no terminal o resultado.
         * 
         * no caso eu os seguintes métodos: soma das idades,
         * e o produto das idades. (os métodos de quem é mais novo
         * e mais velho está dentro desses métodos de soma e produto, pois
         * são utilizados para fazer a soma e o produto)
         */
        mostrarResultado(
                somaIdades(homensMaisVelhos(idadeHomem1, idadeHomem2), mulheresMaisNovas(idadeMulher1, idadeMulher2)),
                produtoIdades(homensMaisNovos(idadeHomem1, idadeHomem2),
                        mulheresMaisVelhas(idadeMulher1, idadeMulher2)));
    }

    /*
     * utilizando a alternativa de utilizar o operador ternário, onde não é
     * necessário
     * realizar uma saga de grandes e imensos ifs, deixando o código mais limpo e
     * legível
     */

    /*
     * ? → Se a condição for verdadeira, o valor após o ? será atribuído.
     * : → Se a condição for falsa, o valor após o : será atribuído.
     */
    private static int homensMaisVelhos(int idadeHomem1, int idadeHomem2) {
        /* retornar a idade do homem mais velho */
        return idadeHomem1 > idadeHomem2 ? idadeHomem1 : idadeHomem2;
    }

    /*
     * ? → Se a condição for verdadeira, o valor após o ? será atribuído.
     * : → Se a condição for falsa, o valor após o : será atribuído.
     */
    private static int homensMaisNovos(int idadeHomem1, int idadeHomem2) {
        /* retorna a idade do homem mais novo */
        return idadeHomem1 < idadeHomem2 ? idadeHomem1 : idadeHomem2;
    }

    /*
     * ? → Se a condição for verdadeira, o valor após o ? será atribuído.
     * : → Se a condição for falsa, o valor após o : será atribuído.
     */
    private static int mulheresMaisVelhas(int idadeMulher1, int idadeMulher2) {
        /* retorna a idade da mulher mais velha */
        return idadeMulher1 > idadeMulher2 ? idadeMulher1 : idadeMulher2;
    }

    /*
     * ? → Se a condição for verdadeira, o valor após o ? será atribuído.
     * : → Se a condição for falsa, o valor após o : será atribuído.
     */
    private static int mulheresMaisNovas(int idadeMulher1, int idadeMulher2) {
        /* retorna a idade da mulher mais nova */
        return idadeMulher1 < idadeMulher2 ? idadeMulher1 : idadeMulher2;
    }

    /* somo a idade do homem mais velho com a mulher mais nova */
    private static int somaIdades(int homemMaisVelho, int mulherMaisNova) {
        return homemMaisVelho + mulherMaisNova;
    }

    /* faço o produto do homem mais novo com a mulher mais velha */
    private static int produtoIdades(int homemMaisNovo, int mulherMaisVelha) {
        /* o produto é necessário multiplicar uma idade pela outra */
        return homemMaisNovo * mulherMaisVelha;
    }

    /* imprime o resultado da soma e do produto das idades */
    private static void mostrarResultado(int somaIdades, int produtoIdades) {
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + somaIdades);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produtoIdades);
    }

}
