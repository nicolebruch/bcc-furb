/*O custo do selo de uma carta com até 50 gramas é de R$ 0,45.
As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem aquele peso.
Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/

import java.util.Scanner;

public class Uni4Exe07 {

    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os
         * dados na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o peso da carta em gramas: ");
        double peso = entrada.nextDouble();

        /* fecho o scanner p/ não consumir memória */
        entrada.close();

        /* declaro o valor do selo */
        double valorSeloCinquentaGramas = 0.45;

        /*
         * variavel p caso o selo ultrapasse de 50 gramas,
         * com ela, o usuário irá pagar um adicional de R$ 0,45 por cada 20 gramas, ou
         * fração, em que excedem aquele peso.
         */
        /*
         * só utilizo essa variável para ver o quanto de peso ultrapassou de 50 gramas
         */
        double pesoSuperior = peso - 50;

        /*fluxograma pede p dar false caso o peso seja excedido, 
        então crio uma variável p verificar se o peso é válido ou não
         */
        boolean pesoValido = peso <= 50;

        /*crio uma condição para verificar se o peso é válido ou não */
        if (pesoValido) {
            /*caso sim, ele só paga o valor do selo de até 50 gramas */
            System.out.println("O valor do selo é: R$ " + valorSeloCinquentaGramas);
            /*se passar de 50 gramas, ele paga um preço superior, e divido por cada 20 gramas */
        } else {
            double valorSeloExcedente = (pesoSuperior / 20) * 0.45;
            double valorPagar = valorSeloCinquentaGramas + valorSeloExcedente;
            System.out.println("O valor do selo é: R$ " + valorPagar);
        }

    }
}