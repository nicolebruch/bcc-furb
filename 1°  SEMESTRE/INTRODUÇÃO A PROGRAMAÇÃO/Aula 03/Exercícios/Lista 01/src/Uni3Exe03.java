/*Um motorista deseja abastecer seu tanque de combustível.
Escreva um programa para ler o preço do litro da gasolina
e o valor do pagamento
e exibir quantos litros ele conseguiu colocar no tanque. */

import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        // preço do litro da gasolina
        double precoLitroGasolina = 6.45;

        // peço para informar o valor que ele gostaria de gastar para encher o
        // combustível
        System.out.println("Valor que gostaria de gastar para encher o combustível: ");
        double valorPodeGastar = entrada.nextDouble();

        /* fecho o scanner para não consumir memória */
        entrada.close();

        // cálculo para saber quantos litros ele consegue abastecer
        double quantidadeDeLitroAEncher = valorPodeGastar / precoLitroGasolina;

        // aqui eu printo quantos litros ele consegue abastecer
        if (valorPodeGastar > precoLitroGasolina) {
            System.out.println("Você conseguirá abastecer:" + quantidadeDeLitroAEncher);
            // não consegue abastecer, pois está sem saldo
        } else {
            System.out.println("Você não possui saldo suficiente para abastecer.");
        }

    }
}