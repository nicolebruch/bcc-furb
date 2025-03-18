/*O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal.
O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, 
onde a massa está em quilogramas 
e a altura está em metros, 
de acordo com a fórmula:

IMC= Massa
    Altura²

Faça um algoritmo para classificar o IMC 
e dizer o grau de obesidade do indivíduo,
de acordo com a seguinte tabela:

IMC	         Classificação
< 18.5	        Magreza
18.5 - 24.9	    Saudável
25.0 - 29.9  	Sobrepeso
30.0 - 34.9	    Obesidade Grau I
35.0 - 39.9 	Obesidade Grau II (severa)
>= 40.0	        Obesidade Grau III (mórbida) */

import java.util.Scanner;

public class Uni4Exe21 {

    public static void main(String[] args) {

        /*peço o scanner */
        Scanner entrada = new Scanner(System.in);

        /*peço pro usuário informar as variáveis */
        System.out.println("Insira a sua altura em metros: ");
        double altura = entrada.nextDouble();

        System.out.println("Informe o seu peso em KG: ");
        double peso = entrada.nextDouble();

        /*fecho o scanner para não consumir memória */
        entrada.close();

        /*cálculo para o IMC */
        double calculoIMC = peso / (altura * altura);


        mostrarClassificacao(calculoIMC);

    }
    private static boolean classificacaoMagreza(double calculoIMC) {
        return calculoIMC < 18.5;

    }
    private static boolean classificacaoSaudavel(double calculoIMC) {
        return calculoIMC == 18.5 || calculoIMC <= 24.9;
    }

    private static boolean classificacaoSobrepeso(double calculoIMC) {
        return calculoIMC == 25.0 || calculoIMC <= 29.9;
    }

    private static boolean classificacaoObesidadeGrauI(double calculoIMC) {
        return calculoIMC == 30.0 || calculoIMC <= 34.9;
    }

    private static boolean classificacaoObesidadeGrauII(double calculoIMC) {
        return calculoIMC == 35.0 || calculoIMC <= 39.9;
    }

    private static boolean classificacaoObesidadeGrauIII(double calculoIMC) {
        return calculoIMC >= 40.0;
    }

    private static void mostrarClassificacao(double calculoIMC) {
        if (classificacaoMagreza(calculoIMC)) {
            System.out.println("Sua classificação de IMC é: Magreza, sendo de: " + calculoIMC);

        } else if (classificacaoSaudavel(calculoIMC)) {
            System.out.println("Sua classificação de IMC é: Saudável, sendo de: " + calculoIMC);

        } else if (classificacaoSobrepeso(calculoIMC)) {
            System.out.println("Sua classificação de IMC é: Sobrepeso, sendo de: " + calculoIMC);

        } else if (classificacaoObesidadeGrauI(calculoIMC)) {
            System.out.println("Sua classificação de IMC é: Obesidade Grau I, sendo de: " + calculoIMC);

        } else if (classificacaoObesidadeGrauII(calculoIMC)) {
            System.out.println("Sua classificação de IMC é: Obesidade Grau II, sendo de: " + calculoIMC);

        } else if (classificacaoObesidadeGrauIII(calculoIMC)) {
            System.out.println("Sua classificação de IMC é: Obesidade Grau III, sendo de: " + calculoIMC);

        } else {
            System.out.println("Sua classificação de IMC é: INVÁLIDA");
        }
    }
}
