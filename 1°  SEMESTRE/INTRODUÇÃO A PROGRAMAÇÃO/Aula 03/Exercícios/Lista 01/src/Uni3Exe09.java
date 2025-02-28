/*Descreva um programa que calcule o volume de uma lata de óleo. Fórmula: */

import java.util.Scanner;

public class Uni3Exe09 {

    public static void main(String[] args) {
        {
            /*
             * Scanner pra poder estar puxando os dados
             * na memória que o usuário informou
             */
            Scanner entrada = new Scanner(System.in);

            /* peço p me informar a altura da lata que preciso calcular */
            System.out.println("Informe a altura da lata: ");
            double altura = entrada.nextDouble();

            /* p calcular, preciso da largura da lata */
            System.out.println("Informe a largura da lata: ");
            double largura = entrada.nextDouble();

            /* p calcular, tambem preciso do comprimento da lata */
            System.out.println("Informe o comprimento da lata: ");
            double comprimento = entrada.nextDouble();

            /* aqui eu realizo o calculo do volume da lata */
            double calculoVolumeLata = altura * largura * comprimento;

            /* e printo quanto é o volume da lata baseado nos seus tamanhoss */
            System.out.println("O volume da Lata é: " + calculoVolumeLata);

        }
    }
}
