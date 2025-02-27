/*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos. */

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Preço do produto: ");
        int valor = entrada.nextInt();
        System.out.println("Valor pago: ");
        int pagou = entrada.nextInt();
        int troco = pagou - valor;
        int nota100 = troco / 100;
        troco %= 100;
        int nota10 = troco / 10;
        troco %= 10;
        int nota1 = troco / 1;
        System.out.println("Preço do produto: " + valor);
        System.out.println("Valor pago: " + pagou);
        System.out.println("Troco " + troco);
        System.out.println("Cédulas: ");
        System.out.println(nota100 + " notas de R$ 100,00");
        System.out.println(nota10 + " notas de R$ 10,00");
        System.out.println(nota1 + " notas de R$ 1,00");
        entrada.close();
    }
}
