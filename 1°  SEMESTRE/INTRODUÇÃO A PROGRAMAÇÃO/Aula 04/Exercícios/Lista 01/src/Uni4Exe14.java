/*Leia uma data e determine se ela é válida. 
Ou seja, verifique se o mês está entre 1 e 12, 
e se o dia existe naquele mês. 
Note que fevereiro tem 29 dias em anos bissextos, 
e 28 dias em anos não bissextos.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {

        /* scanner para pegar os dados informados */
        Scanner entrada = new Scanner(System.in);

        /*
         * peço para informar dia, mes e ano para depois validar
         * essas datas
         */
        System.out.println("Digite o dia: ");
        int dia = entrada.nextInt();

        System.out.println("Digite o mês: ");
        int mes = entrada.nextInt();

        System.out.println("Digite o ano: ");
        int ano = entrada.nextInt();

        /* fecho o scanner pra não consumir memória */
        entrada.close();

        /*
         * aqui eu chamo o método que irá validar as datas
         * inseridas pelo usuário para mostrar se é válida
         */
        mostrarDataValida(dia, mes, ano);

    }

    /*
     * crio um método para verificar as datas informadas,
     * onde, caso nao entrem nessas condições, a data é inválida
     * e retorna "false"
     */
    public static boolean datasValidas(int dia, int mes, int ano) {
        /*
         * se o dia for maior que zero e menor que 32,
         * o mês for maior que zero e menor que 13
         * e o ano for maior que zero, então:
         * é uma data válida
         */
        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            /*
             * onde se o mes inserido for 1, 3, 5, 7, 8, 10 ou 12,
             * eles sempre possuem 31 dias, então:
             */
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                /* retorna 31 porque esses meses sempre possuem 31 dias */
                return dia <= 31;
            }
            /*
             * onde se o mes inserido for 4, 6, 9, 11,
             * eles sempre possuem 30 dias, então:
             */
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                /* retorna 30 porque esses meses sempre possuem 30 dias */
                return dia <= 30;
            } else if (mes == 2) {
                /*
                 * onde se o mes inserido for 2, ele sempre possuirá 28 dias,
                 * mas se o ano for bissexto, ele possuirá 29 dias, então:
                 */
                if (anoBissexto(ano)) {
                    /* retorna 29 porque o ano é bissexto e fevereiro possui 29 dias */
                    return dia <= 29;
                } else {
                    /* retorna 28 porque fevereiro possui 28 dias */
                    return dia <= 28;
                }
            }
        }
        /* se não for nenhuma das condições acima, a data é inválida */
        return false;
    }

    /*
     * crio um método p verificar se é ano bissexto, onde
     * se o ano for divisível por 4 e não for divisível por 100
     * ou se for divisível por 400, ele é bissexto
     * e retorna "true"
     */
    public static boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    /*
     * crio um método void que serve apenas para eu mostrar
     * no terminal as respostas da condição que eu criei
     */
    private static void mostrarDataValida(int dia, int mes, int ano) {
        if (datasValidas(dia, mes, ano)) {
            System.out.println("A data é válida");
        } else {
            System.out.println("A data é inválida");
        }
    }
}
