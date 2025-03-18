/*A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, >>vou usar o if<<
cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
o valor por hora
e escreva o salário total do funcionário,que deverá ser acrescido das horas extras, 
caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* declarando variáveis */

        double jornadaSemanal = 40;
        double mesEmSemanas = 4;

        /*
         * declarando o cálculo da jornada mensal,
         * pois só tem em semanas
         */
        double jornadaMensal = jornadaSemanal * mesEmSemanas;

        /*
         * peço para o usuário informar as horas trabalhadas
         * no mês p/ ver se fez hora extra
         */
        System.out.println("Digite o número de horas trabalhadas em um mês: ");
        double horasTrabalhadasMes = entrada.nextDouble();

        /*
         * peço para o usuário informar o valor da hora trabalhada
         * p/ poder calcular o salário dele
         */
        System.out.println("Digite o valor por hora trabalhada: ");
        double valorPorHoraTrabalhada = entrada.nextDouble();

        /* fecho o scanner p/ não consumir memória */
        entrada.close();

        /*
         * aqui calculo a hora extra q o funcionário fez,
         * caso sobre algum resto na subtração, é sinal que
         * ele fez hora extra, se não,, sobrar resto ele não fez
         */
        double horasExtras = horasTrabalhadasMes - jornadaMensal;

        /* aqui eu faço o cálculo base do salário (sem a hora extra) */
        double salarioBase = jornadaMensal * valorPorHoraTrabalhada;

        /*
         * faço a minha condição de que, se as horas trabalhadas
         * do funcionário forem maior que a jornada mensal proposta,
         * é sinal que ele fez hora extra
         */
        if (horasTrabalhadasMes > jornadaMensal) {
            /*
             * então eu calculo o salário dele com o valor da hora extra que seria de 50%,
             * porém...
             * eu não multiplico por 0.50 e sim por 1.5, pois 100% + 50% = 150% = 1.5, onde
             * o
             * 100% é o valor da hora extra que o funcionário trabalhou e o
             * 50% é o valor da hora extra que precisa ser pago (acréscimo no salário)
             */
            double salarioBaseComHoraExtra = horasExtras * (valorPorHoraTrabalhada * 1.5) + salarioBase;
            System.out.println("O salário total do funcionário com hora extra é de: " + salarioBaseComHoraExtra);
            /*
             * se a hora de trabalho do funcionário não passar
             * da jornada mensal, então ele não fez hora extra.
             */
            /* neste caso, ele vai ser remunerado sem hora extra */
        } else {
            System.out.println("O salário total do funcionário sem hora extra é de: " + salarioBase);
        }

    }
}