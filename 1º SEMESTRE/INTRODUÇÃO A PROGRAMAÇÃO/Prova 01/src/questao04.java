/*Questão 4 (2,0)
Para esta questão se pede para desenvolver o programa em Java.
Ao se considerar que um problema já foi resolvido e descrito no fluxograma abaixo, implemente o
seu código em Java usando o VSCode (ou o editor da sua escolha). Esta implementação deve seguir
fielmente o que está representado neste diagrama. Caso ache alguma diferença do seu código
fonte para o Fluxograma será descontado 0,25 por erro cometido. */

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um esporte");
        String esporte = entrada.nextLine();

        System.out.println("Informe um estilo musical");
        String estilo = entrada.nextLine();

        if ((esporte.isBlank()) && (estilo.isBlank())) {
            System.out.println("Não é possível informar os dados");
            System.out.println("Vazio");

        } else {
            System.out.println("Esporte: " + esporte);

            if ((estilo.isBlank())) {
                System.out.println("Estilo vazio");
            } else {
                System.out.println("Estilo: " + estilo);
            }
        }
        System.out.println("FIM");
        entrada.close();
    }
}