/*Descreva um programa que a partir da distância percorrida 
e o do tempo gasto por um motorista durante uma viagem de final de semana,
calcule a velocidade média 
e a quantidade de combustível gasto na viagem,
sabendo que o automóvel faz 12 km por litro. */

import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* peço para informar a distância percorrida */
        System.out.println("Informe a distância percorrida: ");
        double distancia = entrada.nextDouble();

        /* peço para informar o tempo gasto */
        System.out.println("Informe o tempo gasto: ");
        double tempo = entrada.nextDouble();

        /* cálculo para saber a velocidade média */
        double velocidadeMedia = distancia / tempo;

        /* o automóvel faz 12km por litro */
        double kmPorLitro = 12;

        /*
         * cálculo para saber a quantidade de combustível
         * que foi gastado na viagem
         */
        double combustivelGasto = distancia / kmPorLitro;

        /*
         * aqui printo as informações sobre a quantidade gastada de combustível na
         * viagem e velocidade média
         */
        System.out.println("A velocidade média foi de: " + velocidadeMedia
                + "km/h e a quantidade de combustível gasto foi de: " + combustivelGasto + " litros");
    }
}
