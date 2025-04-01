/*Dado um número de ponto flutuante maior do que 0,
informe se foram digitadas ou não casas decimais no número.*/

import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {

        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* peço pro usuário informar um número de ponto flutuante maior que 0 */
        System.out.println("Digite um número de ponto flutuante maior que 0: ");
        double numero = entrada.nextDouble();

        /* fecho o scanner p/ não consumir memória */
        entrada.close();

        /*
         * condição p/ verificar se o número é divisível por 1 e o resto é
         * igual a zero, caso seja, ele não tem casas decimais
         */
        if (numero % 1 == 0) {
            System.out.println("O número não tem casas decimais");
            /* caso não seja essa situação, ele tem casas decimais */
        } else {
            System.out.println("O número tem casas decimais");
        }

        /* alternativa de utilizar o operador ternário */
        boolean casaDecimal = numero % 1 == 0;
        String mensagem = casaDecimal ? "O número não é decimal" : "O número é decimal";
        System.out.println(mensagem);

    }
}
