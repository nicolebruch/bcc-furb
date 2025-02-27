/*Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.*/

import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Informe o cateto oposto: ");
            double catetoOposto = entrada.nextDouble();

            System.out.println("Informe o cateto adjacente: ");
            double catetoAdjacente = entrada.nextDouble();

            double hipotenusa = (catetoAdjacente * 2) + (catetoOposto * 2);

            System.out.println("O valor da hipotenusa é: " + hipotenusa);

        }
    }
}
