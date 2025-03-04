/*Dados dois valores inteiros, 
escreva um algoritmo que informe se eles são múltiplos ou não. */

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {

        /* scanner para pegar os dados que for informado */
        Scanner entrada = new Scanner(System.in);

        /* peço pro usuário inserir o primeiro número */
        System.out.println("Informe um número inteiro: ");
        int numero1 = entrada.nextInt();

        /* peço pro usuário inserir o segundo número */
        System.out.println("Informe outro número inteiro: ");
        int numero2 = entrada.nextInt();

        /* faço condição pra caso o resto dos números seja igual a zero */
        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            /* se os restos forem igual a zero, são múltiplos */
            System.out.println("Os números: " + numero1 + " e " + numero2 + " são múltiplos");
            /* se caso não, (sobrar resto), eles não são múltiplos */
        } else {
            System.out.println("Os números " + numero1 + " e " + numero2 + " não são múltiplos");
        }
    }
}
