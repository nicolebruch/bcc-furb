/*Uma fábrica de refrigerantes vende seu produto em três formatos: 
lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
Se um comerciante compra uma determinada quantidade de cada formato,
faça um programa para calcular quantos litros de refrigerante ele comprou. */

import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* questionando a quantidade unitaria de cada produto */
        System.out.println("Informe a quantidade de produtos comprados:");

        /* quantas latas 350ml */
        System.out.println("Lata de 350ml: ");
        double qntdLata350 = entrada.nextDouble();

        /* quantas garrafas 600ml */
        System.out.println("Garrafa de 600ml: ");
        double qntdGarrafa600 = entrada.nextDouble();

        /* quantas garrafas de 2L */
        System.out.println("Quantidade de garrafa de 2 litros: ");
        double qntdGarrafa2L = entrada.nextDouble();

        /* fechando meu scan pra nao ocupar memoria das respostas */
        entrada.close();

        /* calculo para saber a quantidade de litros que foram comprados */

        double lata350 = 350 * qntdLata350;
        double garrafa600 = 600 * qntdGarrafa600;
        double garrafa2L = 2 * qntdGarrafa2L;

        /*
         * quantidade total, onde eu preciso dividir por 1000,
         * pois as unidades de medida da lata350 e a garrafa600 estao em ml e eu quero
         * em litros,
         * igual a garrafa de 2L
         */
        double quantidadeTotal = (lata350 / 1000) + (garrafa600 / 1000) + garrafa2L;
        System.out.print("A quantidade total de litros é: " + quantidadeTotal);

    }
}