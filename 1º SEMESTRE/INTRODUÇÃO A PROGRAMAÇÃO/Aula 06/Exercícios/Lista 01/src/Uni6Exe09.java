/*Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. 
Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e métodos para a resolução deste exercício. */


import java.util.Scanner;

public class Uni6Exe09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int quantidadePessoas = 30;
        int[] vetorSexo = new int[quantidadePessoas];
        int[] vetorNota = new int[quantidadePessoas];
        int[] vetorIdade = new int[quantidadePessoas];

        int quantidadeHomens = 0;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println((i + 1) + "ª pessoa:");
            vetorSexo[i] = lerSexo(scanner);
            vetorNota[i] = lerNota(scanner);
            vetorIdade[i] = lerIdade(scanner);

            if (vetorSexo[i] == 2) {
                quantidadeHomens++;
            }
        }

        double mediaTotal = calcularMedia(vetorNota, quantidadePessoas);
        double mediaHomens = (quantidadeHomens > 0)
            ? calcularMediaHomens(vetorSexo, vetorNota, quantidadePessoas)
            : 0;

        int notaMulherMaisJovem = obterNotaMulherMaisJovem(vetorSexo, vetorNota, vetorIdade, quantidadePessoas);
        int mulheresAcimaDeCinquenta = contarMulheresComMaisDe50ComNotaSuperiorAMedia(
            vetorSexo, vetorNota, vetorIdade, quantidadePessoas, mediaTotal
        );

        imprimirResultados(mediaTotal, mediaHomens, notaMulherMaisJovem, mulheresAcimaDeCinquenta, quantidadeHomens);

        scanner.close();
    }

    public static int lerSexo(Scanner scanner) {
        int sexo;
        do {
            System.out.print("Informe o sexo (1 para feminino, 2 para masculino): ");
            sexo = scanner.nextInt();
            if (sexo < 1 || sexo > 2) {
                System.out.println("Opção inválida. Digite 1 para feminino ou 2 para masculino.");
            }
        } while (sexo < 1 || sexo > 2);
        return sexo;
    }

    public static int lerNota(Scanner scanner) {
        int nota;
        do {
            System.out.print("Informe a nota (de 0 a 10): ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Deve estar entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }

    public static int lerIdade(Scanner scanner) {
        int idade;
        do {
            System.out.print("Informe a idade: ");
            idade = scanner.nextInt();
            if (idade < 0) {
                System.out.println("Idade inválida. Deve ser maior que zero.");
            }
        } while (idade < 0);
        return idade;
    }

    public static double calcularMedia(int[] vetorNotas, int total) {
        int soma = 0;
        for (int nota : vetorNotas) {
            soma += nota;
        }
        return (double) soma / total;
    }

    public static double calcularMediaHomens(int[] vetorSexo, int[] vetorNota, int total) {
        int soma = 0;
        int quantidadeHomens = 0;
        for (int i = 0; i < total; i++) {
            if (vetorSexo[i] == 2) {
                soma += vetorNota[i];
                quantidadeHomens++;
            }
        }
        return quantidadeHomens > 0 ? (double) soma / quantidadeHomens : 0;
    }

    public static int obterNotaMulherMaisJovem(int[] vetorSexo, int[] vetorNota, int[] vetorIdade, int total) {
        int menorIdade = Integer.MAX_VALUE;
        int nota = 0;
        for (int i = 0; i < total; i++) {
            if (vetorSexo[i] == 1 && vetorIdade[i] < menorIdade) {
                menorIdade = vetorIdade[i];
                nota = vetorNota[i];
            }
        }
        return nota;
    }

    public static int contarMulheresComMaisDe50ComNotaSuperiorAMedia(
        int[] vetorSexo, int[] vetorNota, int[] vetorIdade, int total, double mediaTotal
    ) {
        int contador = 0;
        for (int i = 0; i < total; i++) {
            if (vetorSexo[i] == 1 && vetorIdade[i] > 50 && vetorNota[i] > mediaTotal) {
                contador++;
            }
        }
        return contador;
    }

    public static void imprimirResultados(
        double mediaTotal,
        double mediaHomens,
        int notaMulherMaisJovem,
        int mulheresComMaisDe50,
        int quantidadeHomens
    ) {
        System.out.printf("Nota média atribuída ao cinema: %.2f%n", mediaTotal);
        if (quantidadeHomens > 0) {
            System.out.printf("Nota média atribuída pelos homens: %.2f%n", mediaHomens);
        } else {
            System.out.println("Nenhum homem participou da avaliação.");
        }
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota superior à média: " + mulheresComMaisDe50);
    }
}
