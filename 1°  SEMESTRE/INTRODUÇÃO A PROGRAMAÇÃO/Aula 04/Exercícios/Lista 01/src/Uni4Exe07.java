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




























    }
}