/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
Para isto ela entregou um valor em dólares para o atendente.
Considerando que o atendente tem a cotação do dólar,
descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.*/

import java.util.Scanner;

public class Uni3Exe08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos dólares você quer converter?");
        double qntdDolar = entrada.nextDouble();

        entrada.close();

        double cambioDolar = 5.83;

        double conversaoDolarParaReal = qntdDolar * cambioDolar;

        System.out.println("A conversão de dollar para real é igual a: " + conversaoDolarParaReal);

    }

}
