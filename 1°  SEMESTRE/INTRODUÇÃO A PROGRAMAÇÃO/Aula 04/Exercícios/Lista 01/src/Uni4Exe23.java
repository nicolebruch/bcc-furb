/*Escreva um algoritmo que leia um número inteiro positivo representando um determinado mês do ano 
e escreva o mês por extenso. 
Para valores maiores do que 12 informe que o valor não é válido.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe23 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o mês em forma de número inteiro: ");
        int numeroMes = entrada.nextInt();

        switch (numeroMes) {
            case 1:
                System.out.println("Mês de Janeiro");
                break;
            case 2:
                System.out.println("Mês de Fevereiro");
                break;
            case 3:
                System.out.println("Mês de Março");
                break;
            case 4:
                System.out.println("Mês de Abril");
                break;
            case 5:
                System.out.println("Mês de Maio");
                break;
            case 6:
                System.out.println("Mês de Junho");
                break;
            case 7:
                System.out.println("Mês de Julho");
                break;
            case 8:
                System.out.println("Mês de Agosto");
                break;
            case 9:
                System.out.println("Mês de Setembro");
                break;
            case 10:
                System.out.println("Mês de Outubro");
                break;
            case 11:
                System.out.println("Mês de Novembro");
                break;
            case 12:
                System.out.println("Mês de Dezembro");
                break;
            default:
                System.out.println("Número inválido para o mês");
                break;
        }
    }
}
