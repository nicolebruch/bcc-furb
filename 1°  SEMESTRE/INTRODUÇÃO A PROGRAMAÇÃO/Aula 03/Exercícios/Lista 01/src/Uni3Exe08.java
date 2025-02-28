/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
Para isto ela entregou um valor em dólares para o atendente.
Considerando que o atendente tem a cotação do dólar,
descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.*/

import java.util.Scanner;

public class Uni3Exe08 {

    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* aqui só pergunto quantos dollares são */
        System.out.println("Quantos dólares você quer converter?");
        /* a variável que o usuário inseriu */
        double qntdDolar = entrada.nextDouble();

        /* fecho o scanner para não consumir memória com as entradas */
        entrada.close();

        /* declaro a devida variável para o meu cálculo */
        double cambioDolar = 5.83;

        /* aqui eu faço o cálculo de conversão */
        double conversaoDolarParaReal = qntdDolar * cambioDolar;

        /*
         * aqui eu printo e mostro pro usuário o valor total que deu
         * a conversão de dollares para reais
         */
        System.out.println("A conversão de dollar para real é igual a: " + conversaoDolarParaReal);

    }

}
