/*Dadas as coordenadas (X e Y) de um Ponto,
você deve informar em qual quadrante ele está localizado

0, se os dois valores forem zero
1, se os dois valores forem positivos
2, se x for positivo e y, negativo
3, se os dois valores forem negativos
4, se x for negativo e y, positivo

Para resolver este problema 
pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {

        /*
         * crio o scanner p pegar os dados inseridos
         * no terminal
         */
        Scanner entrada = new Scanner(System.in);

        /*
         * peço pro usuário informar o valor de X
         * e de Y
         */
        System.out.println("Informe o valor de X: ");
        float valorX = entrada.nextFloat();

        System.out.println("Informe o valor de Y: ");
        float valorY = entrada.nextFloat();

        /* fecho o scanner para não consumir memória */
        entrada.close();

        /*
         * puxo o meu método void no meu método main
         * para poder aparecer no terminal a condição
         * baseada na resposta do usuário
         */
        mostrarQuadrante(valorX, valorY);

    }

    /* metodo p validar o quadrante zero */
    private static boolean quadranteZero(float valorX, float valorY) {
        return valorX == 0 && valorY == 0;

    }

    /* metodo p validar o quadrante um */
    private static boolean quadranteUm(float valorX, float valorY) {
        return valorX > 0 && valorY > 0;

    }

    /* metodo p validar o quadrante dois */
    private static boolean quadranteDois(float valorX, float valorY) {
        return valorX > 0 && valorY < 0;
    }

    /* metodo p validar o quadrante tres */
    private static boolean quadranteTres(float valorX, float valorY) {
        return valorX < 0 && valorY < 0;
    }

    /* metodo p validar o quadrante quatro */
    private static boolean quadranteQuatro(float valorX, float valorY) {
        return valorX < 0 && valorY > 0;
    }

    /*
     * metodo void para aparecer no terminal qual quadrante as coordenadas
     * se encontram com base no que o usuário nos forneceu de ponto X e Y
     */
    private static void mostrarQuadrante(float valorX, float valorY) {
        if (quadranteZero(valorX, valorY)) {
            System.out.println("O ponto X: " + valorX + " e o ponto Y: " + valorY + " estão no quadrante zero.");

        } else if (quadranteUm(valorX, valorY)) {
            System.out.println("O ponto X: " + valorX + " e o ponto Y: " + valorY + " estão no quadrante um.");

        } else if (quadranteDois(valorX, valorY)) {
            System.out.println("O ponto X: " + valorX + " e o ponto Y: " + valorY + " estão no quadrante dois.");
        } else if (quadranteTres(valorX, valorY)) {
            System.out.println("O ponto X: " + valorX + " e o ponto Y: " + valorY + " estão no quadrante três.");
        } else if (quadranteQuatro(valorX, valorY)) {
            System.out.println("O ponto X: " + valorX + " e o ponto Y: " + valorY + " estão no quadrante quatro.");
        } else {
            System.out
                    .println("O ponto X: " + valorX + " e o ponto Y: " + valorY + " não pertencem a nenhum quadrante");

        }
    }
}