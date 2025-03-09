/*Faça um algoritmo que escreva o menu abaixo,
leia uma opção do usuário e execute a operação correspondente. 
O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções:
Escolha uma opção:
1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero).

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uni4Exe25Variacao {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Informe 2 números: ");
            double numero1 = entrada.nextDouble();
            double numero2 = entrada.nextDouble();

            System.out.println(
                    "Informe a operação que você deseja realizar, sendo:\n1 - Soma,\n2 - Diferença,\n3 - Produto,\n4 - Divisão");
            int opcaoOperacao = entrada.nextInt();

            switch (opcaoOperacao) {
                case 1 -> System.out.println(numero1 + numero2);
                case 2 -> System.out.println(numero1 - numero2);
                case 3 -> System.out.println(numero1 * numero2);
                case 4 -> {
                    if (numero2 == 0) {
                        System.out.println("Denominador não pode ser 0");
                        return;
                    }
                    System.out.println(numero1 / numero2);
                }
                default -> System.out.println("Opção inválida!");
            }
        } catch (InputMismatchException e) {
            System.err.println("Entre com um número válido!");
        }
    }
}
