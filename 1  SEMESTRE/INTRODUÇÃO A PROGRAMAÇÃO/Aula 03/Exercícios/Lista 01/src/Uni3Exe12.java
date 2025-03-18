/*Uma empresa tem para um funcionário os seguintes dados:
o nome, o número de horas trabalhadas mensais 
e o número de dependentes. 
A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho)
e R$ 60,00 por dependente (valor para cálculo do salário família) 
e são feitos descontos de 8,5% sobre o salário trabalho para o INSS 
e de 5% sobre o salário trabalho para o imposto de renda.
Descreva um programa que informe 
o nome, o salário bruto 
e o salário líquido do funcionário. */

import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* declaro as variáveis aqui */
        double salarioTrabalho = 10.00;
        double salarioFamilia = 60.00;
        double inss = 0.085;

        /* peço para informar o nome do funcionario */
        System.out.println("Informe o nome do funcionário: ");
        String nome = entrada.nextLine();

        /* peço para informar o numero de horas trabalhadas */
        System.out.println("Informe o número de horas trabalhadas: ");
        double horasTrabalhadas = entrada.nextDouble();

        /*
         * peço para informar o número de dependentes que seria
         * a quantidade de pessoas na família
         */
        System.out.println("Informe o número de dependentes: ");
        double dependentes = entrada.nextDouble();

        /* fechando o scanner para não consumir memória */
        entrada.close();

        /*
         * aqui eu realizo o cálculo do salário bruto onde incluo o valor do salario
         * familia e quantidade de dependentes
         */
        double salarioBruto = (horasTrabalhadas * salarioTrabalho) + (dependentes * salarioFamilia);

        /* já aqui é o cálculo do salário liquido, onde preciso incluir o inss */
        double salarioLiquido = salarioBruto - (salarioBruto * inss) - (salarioBruto * 0.05);

        /* printo as informações finais */
        System.out.println("O funcionário " + nome + "possui o salário bruto de: " + salarioBruto
                + " e o salário líquido de: " + salarioLiquido);
    }
}