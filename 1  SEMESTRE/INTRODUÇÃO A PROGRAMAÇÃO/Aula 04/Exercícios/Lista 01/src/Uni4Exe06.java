/*Faça um algoritmo que leia um caractere.
Caso seja digitada a letra 'M' escreva “Masculino”.
Se for digitada a letra 'F' escreva “Feminino”.
Se for informado 'I' escreva “Não Informado”.
Qualquer outra letra digitada escreva “Entrada Incorreta”.
Atenção: antes de testar a letra, converta-a para maiúscula. */

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os
         * dados na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu gênero digitando 'M' para Masculino ou 'F' para Feminino: ");
        char genero = entrada.next().charAt(0);

        /*utilizo o "Character.toUppercase" ao invés do "equalsIgnoreCase"
         * pois estou trabalhando com um char e não com uma string
        */
        if (Character.toUpperCase(genero) == 'M') {
            System.out.println("Seu gênero é Masculino");
        } else if (Character.toUpperCase(genero) == 'F') {
            System.out.println("Seu gênero é Feminino");
        } else {
            System.out.println("Entrada Incorreta");
        }
    }
}
