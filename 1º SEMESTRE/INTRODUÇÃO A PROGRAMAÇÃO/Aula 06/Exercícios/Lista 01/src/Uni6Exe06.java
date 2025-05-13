/*Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. 
Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. 
Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. Informe para o usuário se este valor informado se encontra cadastrado no vetor.
 Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.
 */

//Ler valor N inteiro
//Com o valor N inteiro criar um vetor tipo real 
//Perguntar quantidade N de valores reais pra poder preencher o vetor
//Ler outro valor real 
//Informar se esse outro valor real se encontra no vetor

//Criar método para ler o vetor 
//Criar método para retornar verdadeiro ou falso se ele encontra o valor real no vetor 

import java.util.Scanner;

public class Uni6Exe06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // pergunta a quantidade de valor p por dentro do vetor
        System.out.print("Informe a quantidade de valores: ");
        int N = scanner.nextInt();

        double vetor[] = new double[N];

        // pergunta um valor pra poder consultar se tá dentro do vetor
        System.out.print("Informe um valor para buscar no vetor: ");
        double valorBusca = scanner.nextDouble();

        lerValores(scanner, vetor);
        valorExisteNoVetor(vetor, valorBusca);
    }

    public static void lerValores(Scanner scanner, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número para a posição: " + i + " do vetor");
            vetor[i] = scanner.nextDouble();
        }
    }

    public static boolean valorExisteNoVetor(double[] vetor, double valorBusca) {
        for (int v = 0; v < vetor.length; v++) {
            if (vetor[v] == valorBusca) {
                System.out.println("Possui o valor no vetor declarado");
                return true;
            }
        }
        System.out.println("Não possui o valor no vetor declarado");
        return false;

    }
}