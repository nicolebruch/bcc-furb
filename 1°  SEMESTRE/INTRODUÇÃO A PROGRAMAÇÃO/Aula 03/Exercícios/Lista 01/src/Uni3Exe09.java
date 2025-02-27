/*Descreva um programa que calcule o volume de uma lata de óleo. Fórmula: */

import java.util.Scanner;

public class Uni3Exe09 {

    public static void main(String[] args) {
        {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Informe a altura da lata: ");
            double altura = entrada.nextDouble();

            System.out.println("Informe a largura da lata: ");
            double largura = entrada.nextDouble();

            System.out.println("Informe o comprimento da lata: ");
            double comprimento = entrada.nextDouble();

            double calculoVolumeLata = altura * largura * comprimento;

            System.out.println("O volume da Lata é: " + calculoVolumeLata);

        }
    }
}
