/*Uma granja possui um controle automatizado de cada frango da sua produção.
No pé direito do frango há um anel com um chip de identificação;
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, 
faça um programa para calcular o gasto total da granja para marcar todos os seus frangos. */

import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* Quantidade de frangos na granja */
        System.out.println("Quantos frangos existem na granja?");
        double frangosTotal = entrada.nextDouble();

        entrada.close(); // Fechando aqui o Scanner pra não consumir memória

        /* Cálculo dos gastos de aneis com base na quantidade de frangos */
        double gastoPeDireito = 4 * frangosTotal;
        /* Coloco vezes 2 porque são 2 aneis no pé esquerdo */
        double gastoPeEsquerdo = (3.50 * 2) * frangosTotal;

        /* Cálculo dos gastos totais com os frangos para identificação */
        double gastoTotal = gastoPeDireito + gastoPeEsquerdo;
        System.out.println("O gasto total para marcar " + frangosTotal + " é de: " + gastoTotal);
    }
}
