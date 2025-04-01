/*Dados 3 valores lado1, lado2, lado3, 
que representam os comprimentos dos lados de um triângulo, 
descreva um algoritmo que verifique se os mesmos podem ser os comprimentos dos lados de um triângulo.
Em caso afirmativo, verifique e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno".
Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

o comprimento de cada lado de um triângulo 
é menor que a soma dos comprimentos dos outros lados

um triângulo equilátero tem três lados iguais
um triângulo isóscele tem dois lados iguais e um diferente
um triângulo escaleno tem três lados diferentes

Se tiveres dúvidas em pensar que quais três lados (segmentos reta) sempre formam um triângulo olhe este PDF: Uni4Exe12_duvida
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {

        /* scanner para pegar as informações que o usuário fornece */
        Scanner entrada = new Scanner(System.in);

        /* usuário informando o comprimento dos três lados */
        System.out.println("Informe o valor do lado 1: ");
        double lado1 = entrada.nextDouble();

        System.out.println("Informe o valor do lado 2: ");
        double lado2 = entrada.nextDouble();

        System.out.println("Informe o valor do lado 3: ");
        double lado3 = entrada.nextDouble();

        entrada.close();

        /* método main mostrar se os lados formam um triângulo */
        mostrarTriangulo(lado1, lado2, lado3);
    }

    /*
     * crio um metodo p verificar se sao tringulos conforme o tamanho fornecido,
     * pois
     * se a soma de dois lados for menor que o terceiro, não é um triângulo
     */
    private static boolean saoTriangulos(double lado1, double lado2, double lado3) {
        return lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2;
    }

    /*
     * crio um metodo p verificar se sao tringulos equilateros conforme o tamanho
     * fornecido,
     * pois
     * se todos os lados forem iguais (da mesma medida), o triangulo é equilatero
     */
    private static boolean trianguloEquilatero(double lado1, double lado2, double lado3) {
        return lado1 == lado2 && lado2 == lado3;
    }

    /*
     * crio um metodo p verificar se sao triangulos isosceles conforme o tamanho
     * fornecido,
     * pois
     * se 2 lados forem iguais(da mesma medida), o triangulo é isosceles
     */
    private static boolean trianguloIsosceles(double lado1, double lado2, double lado3) {
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }

    /*
     * crio um metodo p verificar se sao triangulos escalenos conforme o tamanho
     * fornecido,
     * pois
     * se todos os lados forem diferentes(medida de todos os lados é diferente), o
     * triangulo é escaleno
     */
    private static boolean trianguloEscaleno(double lado1, double lado2, double lado3) {
        return lado1 != lado2 && lado1 != lado3 && lado2 != lado3;
    }

    /* metodo void para apenas mostrar ao usuário o tipo de triangulo */
    private static void mostrarTriangulo(double lado1, double lado2, double lado3) {
        if (saoTriangulos(lado1, lado2, lado3)) {
            /*
             * se 2 lados fornecidos somados forem maior que o lado que sobrou
             * é um triangulo
             */
            System.out.println("Os lados informados formam um triângulo");
            /*
             * se os 3 lados forem da mesma medida,
             * é um triangulo equilatero
             */
            if (trianguloEquilatero(lado1, lado2, lado3)) {
                System.out.println("É um triângulo equilátero");
                /*
                 * se apenas 2 lados forem da mesma medida,
                 * é um triangulo isosceles
                 */
            } else if (trianguloIsosceles(lado1, lado2, lado3)) {
                System.out.println("É um triângulo isósceles");
                /*
                 * se nenhum lado for da mesma medida,
                 * é um triangulo escaleno
                 */
            } else if (trianguloEscaleno(lado1, lado2, lado3)) {
                System.out.println("É um triângulo escaleno");
                /*
                 * se 2 lados fornecidos somados for menor que o lado que sobrou
                 * ele não é um triangulo
                 */
            } else {
                System.out.println("Os lados informados não formam um triângulo");
            }
        }
    }
}
