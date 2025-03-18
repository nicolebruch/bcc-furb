/*Descreva um programa que leia o comprimento dos catetos
de um triângulo retângulo 
e calcule o comprimento da hipotenusa.*/

import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        {
            /*
             * Scanner pra poder estar puxando os dados
             * na memória que o usuário informou
             */
            Scanner entrada = new Scanner(System.in);

            /*
             * aqui to pedindo p inserir o valor do cateto oposto
             * do triangulo retangulo para poder calcular a hipotenusa
             */
            System.out.println("Informe o cateto oposto: ");
            double catetoOposto = entrada.nextDouble();

            /*
             * aqui eu to pedindo p inserir o valor do cateto adjacente
             * do triangulo retangulo para poder calcular a hipotenusa
             */
            System.out.println("Informe o cateto adjacente: ");
            double catetoAdjacente = entrada.nextDouble();

            /* fecho o scanner para não consumir memória */
            entrada.close();

            /* aqui eu to calculando o valor da hipotenusa */
            double hipotenusa = (catetoAdjacente * 2) + (catetoOposto * 2);

            /* aqui eu printo o valor da hipotenusa */
            System.out.println("O valor da hipotenusa é: " + hipotenusa);
        }
    }
}
