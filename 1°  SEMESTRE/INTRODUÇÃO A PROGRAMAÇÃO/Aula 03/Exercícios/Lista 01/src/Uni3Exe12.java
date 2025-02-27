/*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário. */

import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double reais_hora = 10;
        double reais_dependente = 60;
        double inss = 0.085;
        double ir = 0.05;
        System.out.print("Informar o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Horas trabalhadas: ");
        double horast = entrada.nextDouble();
        System.out.print("Número de dependentes: ");
        double dependentes = entrada.nextDouble();
        double salariobruto = horast * reais_hora * (dependentes * reais_dependente);
        System.out.print("O salário bruto de " + nome + " é: " + salariobruto);
        double salario_liquido = (salariobruto * inss) * ir;
        System.out.print("E seu salário liquido é: " + salario_liquido);
        entrada.close();
    }
}