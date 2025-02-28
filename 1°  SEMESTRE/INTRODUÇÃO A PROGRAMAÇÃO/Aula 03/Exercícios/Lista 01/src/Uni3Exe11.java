/*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

°F = (9/5) °C + 32 */

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* peço para informar quantos graus em Celsius tá, pra ser convertido */
        System.out.println("Informe quantos graus Celsius você quer converter para Fahrenheit: ");
        double celsius = entrada.nextDouble();

        /* fecho o scanner para não encher a memória */
        entrada.close();

        /* realizo o cálculo da conversão de graus */
        double conversaoFahrenheit = (9.0 / 5.0) * celsius + 32.0;

        /* printo quanto vai dar essa conversão */
        System.out.println("A temperatura em Fahrenheit é: " + conversaoFahrenheit);
    }
}
