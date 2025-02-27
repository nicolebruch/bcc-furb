/*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

°F = (9/5) °C + 32 */

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe os graus em Celsius: ");
        double celsius = entrada.nextDouble();
        double fa = celsius * (9 / 5) + 32;
        System.out.print("°F" + fa);
        entrada.close();
    }
}
