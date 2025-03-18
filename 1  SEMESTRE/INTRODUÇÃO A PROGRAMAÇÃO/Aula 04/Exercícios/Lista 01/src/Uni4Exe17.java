/*Para realizar o cálculo do Imposto de Renda a ser pago, 
é solicitado a renda anual 
e o número de dependentes do contribuinte. 
A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada dependente do contribuinte.
O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto. 
Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida;
para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. 
Rendas superiores a R$ 10.000,00 pagam 15% de imposto.
 */

import java.util.Scanner;

public class Uni4Exe17 {

    public static void main(String[] args) {

        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* pedindo para o usuário informar as variáveis */
        System.out.println("Informe a renda anual: ");
        double rendaAnual = entrada.nextDouble();

        System.out.println("Informe o número de dependentes: ");
        int numeroDependentes = entrada.nextInt();

        /* fecho o scanner para não consumir memória */
        entrada.close();

        /*
         * puxo o meu método void para printar na tela o resultado
         * do imposto.
         * ele puxa 2 métodos, o calcularRendaLiquida e o calcularImposto,
         * pois foram necessários para printar
         */
        mostrarResultadoImposto(calcularRendaLiquida(rendaAnual, numeroDependentes),
                calcularImposto(calcularRendaLiquida(rendaAnual, numeroDependentes)));

    }

    /* crio um método para calcular o imposto de renda */
    private static double calcularRendaLiquida(double rendaAnual, int numeroDependentes) {
        /*
         * o cálculo da renda líquida é feito da seguinte forma:
         * a renda anual menos o desconto de 2% para cada dependente
         * do contribuinte (por isso necessário multiplicar o valor da
         * renda anual para cada dependente)
         */
        double rendaLiquida = rendaAnual - (rendaAnual * (numeroDependentes * 0.02));
        /*
         * retorno o resultado do valor da renda liquida
         * que foi calculado no método
         */
        return rendaLiquida;
    }

    /* crio um método para calcular o imposto de renda */
    private static double calcularImposto(double rendaLiquida) {
        double imposto = 0;
        /*
         * caso o contribuinte tem renda líquida de até 2k,
         * ele não paga imposto nenhum sobre o valor da renda
         * líquida
         */
        if (rendaLiquida <= 2000) {
            imposto = 0;
            /*
             * caso o contribuinte tem renda líquida de 2k e 5k,
             * o imposto é de 5% sobre o valor da renda líquida
             */
        } else if (rendaLiquida > 2000 && rendaLiquida <= 5000) {
            imposto = rendaLiquida * 0.05;
            /*
             * caso o contribuinte tem renda líquida de 5k até 10k,
             * o imposto é de 10% sobre o valor da renda líquida
             */
        } else if (rendaLiquida > 5000 && rendaLiquida <= 10000) {
            imposto = rendaLiquida * 0.10;
            /*
             * caso o contribuinte tem renda líquida acima de 10k,
             * o imposto é de 15% sobre o valor da renda líquida
             */
        } else {
            imposto = rendaLiquida * 0.15;
        } /*
           * aqui eu retorno o valor do imposto que foi calculado
           * no método para cada condição
           */
        return imposto;
    }

    /* crio um método para mostrar o resultado do imposto de renda */
    private static void mostrarResultadoImposto(double rendaLiquida, double imposto) {
        /*
         * aqui eu mostro o resultado do imposto de renda
         * que foi calculado no método calcularImposto
         */
        System.out.println("O imposto de renda a ser pago é de: " + imposto);
        /*
         * aqui eu mostro o resultado da renda líquida
         * que foi calculado no método calcularRendaLiquida
         */
        System.out.println("A renda líquida é de: " + rendaLiquida);

    }

}
