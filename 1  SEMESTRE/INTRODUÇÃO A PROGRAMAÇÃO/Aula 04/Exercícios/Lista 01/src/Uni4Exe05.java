
import java.util.Scanner;

/*Dada uma pergunta, “a cor é azul?”,
faça um programa que leia uma variável lógica com a resposta 
e responda “Sim”,caso a resposta seja true, 
ou “Não”, caso seja false.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/

public class Uni4Exe05 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os
         * dados na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* variável booleana que vai receber a resposta */
        System.out.println("A cor do fusca responsável pelos soquinho no amigo é azul?");
        boolean resposta = entrada.nextBoolean();

        /* condição p/ verificar se a resposta é verdadeira ou falsa */
        if (resposta = true) {
            System.out.println("Sim, a cor responsável pelos soquinho no amigo é azul");
            /* condição pro "false", caso não seja "true" */
        } else {
            System.out.println("Não, a cor responsável pelos soquinho no amigo não é azul");
        }
    }

}
