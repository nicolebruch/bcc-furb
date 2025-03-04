
/*Um casal possui três filhos: 
Marquinhos, Zezinho e Luluzinha.
Faça um algoritmo para ler as idades dos filhos
e exibir quem é o caçula da família; 
suponha que não haja empates. */

import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {

        /* scanner para pegar os dados que for informado */
        Scanner entrada = new Scanner(System.in);

        /* pedindo pra informar a idade das criança */
        System.out.println("Informe a idade do Marquinhos: ");
        int idadeMarquinhos = entrada.nextInt();

        System.out.println("Informe a idade do Zezinho: ");
        int idadeZezinho = entrada.nextInt();

        System.out.println("Informe a idade da Luluzinha");
        int idadeLuluzinha = entrada.nextInt();

        /*
         * crio um if, caso a idade de marquinhos seja menor que a idade do
         * zezinho e da luluzinha, ele é o caçula
         */
        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("Marquinhos é o caçula");
            /*
             * crio um else if, caso a idade do zezinho seja menor que a idade
             * do marquinhos e da luluzinha, ele é o caçula
             */
        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            System.out.println("Zezinho é o caçula");
            /*
             * caso nenhum dos 2 (marquinhos e zezinho) seja o caçula, a luluzinha
             * que é a caçula
             */
        } else {
            System.out.println("Luluzinha é a caçula");
        }
    }
}
