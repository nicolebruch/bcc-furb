/*Uma fábrica de refrigerantes vende seu produto em três formatos: 
lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
Se um comerciante compra uma determinada quantidade de cada formato,
faça um programa para calcular quantos litros de refrigerante ele comprou. */

import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de produtos comprados:");
        System.out.print("Lata de 350ml: ");
        double lata1 = entrada.nextFloat();

        System.out.print("Lata de 600ml: ");
        double lata2 = entrada.nextFloat();

        System.out.print("Informe de 2 litros: ");
        double garrafa = entrada.nextFloat();

        entrada.close();

        double lata350 = 350 * lata1;
        double lata600 = 600 * lata2;
        double garrafa2 = 2 * garrafa;

        double quantidadeTotal = (lata350 / 1000) + (lata600 / 1000) + garrafa2;
        System.out.print("A quantidade total de litros é: " + quantidadeTotal);

    }
}