/*Dado um valor inteiro maior do que 0 
informe se o valor é par ou ímpar.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /*peço pro usuário informar um número afim de verificar se é par ou ímpar */
        System.out.println("Digite um número inteiro maior que 0: ");
        int numero = entrada.nextInt();

        /* fecho o scanner p/ não consumir memória */
        entrada.close();

        /*condição p/ verificar se o número é divisível por 2 e o resto é
        * igual a zero, caso seja, ele é par
        */
        if (numero % 2 == 0) {
            System.out.println("O número é par");
            /*caso não seja essa situação, ele é ímpar */
        } else {
            System.out.println("O número é ímpar");
        }

        /*alternativa de utilizar o operador ternário */
        boolean par = numero % 2 == 0;
        String mensagem = par ? "O número é par" : "O número é ímpar";
        System.out.println(mensagem);



    }
}
