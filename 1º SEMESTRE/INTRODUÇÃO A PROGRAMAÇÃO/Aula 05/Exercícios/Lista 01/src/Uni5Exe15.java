/*
 * Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um
 * algoritmo para informar a média de cada aluno. Considere que a leitura dos
 * dados deve ser finalizada quando o nome do aluno for “fim”.
 */

import java.util.Scanner;

public class Uni5Exe15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno(ou 'fim' para encerrar o programa):");
        String nomeAluno = entrada.nextLine();

        while (!nomeAluno.equals("fim")) {
            System.out.println("Digite a nota 1:");
            double nota1 = entrada.nextDouble();

            System.out.println("Digite a nota 2:");
            double nota2 = entrada.nextDouble();

            entrada.nextLine();

            double media = (nota1 + nota2) / 2;
            System.out.println("A média de " + nomeAluno + " é " + media);

            System.out.println("Digite o nome do próximo aluno(ou 'fim' para encerrar o programa):");
            nomeAluno = entrada.nextLine();

        }

        System.out.println("Fim do programa");

        entrada.close();
    }
}