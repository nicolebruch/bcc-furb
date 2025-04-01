/*Grupo COMPOSTO E e OU (&& e ||) */
/*Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os
         * dados na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* pro usuário informar uma letra */
        System.out.println("Informe uma letra: ");
        char letra = entrada.next().charAt(0);

        /*
         * aqui é pro método main conseguir mostrar a mensagem dizendo
         * se é vogal ou se não é vogal
         */
        mostrarVogal(letra);

        /* fecho o scanner p/ não consumir memória */
        entrada.close();
    }

    /*
     * crio um método mais performático do que colocar uma condição enorme
     * dentro de um if e else
     */
    private static boolean vogal(char letra) {
        return Character.toUpperCase(letra) == 'A'
                || Character.toUpperCase(letra) == 'E'
                || Character.toUpperCase(letra) == 'I'
                || Character.toUpperCase(letra) == 'O'
                || Character.toUpperCase(letra) == 'U';
    }
    /*
     * crio um método void que serve apenas para eu mostrar
     * no terminal as respostas da condição que eu criei
     */
    private static void mostrarVogal(char letra) {
        /* crio uma condição que se for A,E,I,O,U é vogal */
        if (vogal(letra)) {
            System.out.println("A letra é uma vogal");
            /*
             * se não for nenhuma das letras ditas anteriormente,
             * não é vogal
             */
        } else {
            System.out.println("A letra não é uma vogal");
        }
    }
}
