/*Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro. */

import java.util.Scanner;

public class Uni3Exe14 {
     public static void main(String[] args) {
         /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);
        float distancia = entrada.nextFloat();
        float tempo = entrada.nextFloat();
        float autonomia = 12;
        float velocidademedia = distancia / tempo;
        float consumo = distancia / autonomia;
        System.out.println(velocidademedia);
        System.out.println(consumo);
        entrada.close();
    }
}

