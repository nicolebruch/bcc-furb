/*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos. */

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double azulejo = 12.50;
        // 1 metro quadrado é formado por 9 azulejos
        double preco_m2 = azulejo * 9;
        System.out.print("Informe o comprimento: ");
        double comprimento = entrada.nextDouble();
        System.out.print("Informe a altura : ");
        double altura = entrada.nextDouble();
        double area = comprimento * altura;
        System.out.print("O preço a ser pago é: R$" + area * preco_m2);
        entrada.close();
    }
}
