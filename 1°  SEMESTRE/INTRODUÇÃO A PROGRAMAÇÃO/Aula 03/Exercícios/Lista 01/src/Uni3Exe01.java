/*Uma imobiliária vende apenas terrenos retangulares. 
Faça um programa para ler as dimensões de um terreno 
e depois exibir a área do terreno. */

import java.util.Scanner;

public class Uni3Exe01 {

    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);
        /* Declarando a largura do terreno */
        System.out.println("Informe a largura do terreno");
        float largura = entrada.nextFloat();

        /* Declarando o comprimento do terreno */
        System.out.println("Informe o comprimento do terreno");
        float comprimento = entrada.nextFloat();

        entrada.close();

        /* Realizando o cálculo da Área do Terreno */
        float areaTerreno = largura * comprimento;
        System.out.println("A área do terreno é igual a: " + areaTerreno);

    }

}
