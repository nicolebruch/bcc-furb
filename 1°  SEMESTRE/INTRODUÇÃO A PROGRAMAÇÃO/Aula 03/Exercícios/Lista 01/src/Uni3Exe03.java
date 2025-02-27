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

        double precoLitroGasolina = 6.45;

        System.out.println("Valor que gostaria de gastar para encher o combustível: ");
        double valorPodeGastar = entrada.nextDouble();

        double quantidadeDeLitroAEncher = valorPodeGastar / precoLitroGasolina;

        if (valorPodeGastar > precoLitroGasolina) {
            System.out.println("Você conseguirá abastecer:" + quantidadeDeLitroAEncher);
        } else {
            System.out.println("Você não possui saldo suficiente para abastecer.");
        }

    }
}