/*Dado um caractere indicando uma opção, escreva um algoritmo para:

se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe qual cálculo você deseja realizar, sendo:\n" + //
                "T = Calcular a área de um triângulo. \n" + //
                "Q =  Calcular a área de um quadrado. \n" + //
                "R = Calcular a área de um retângulo. \n" + //
                "C = Calcular a área de um círculo.");
        char calculoRealizar = entrada.next().charAt(0);

        switch (calculoRealizar) {
            case 'T':
                calcularAreaTriangulo(entrada);
                break;
            case 'Q':
                calcularAreaQuadrado(entrada);
                break;
            case 'R':
                calcularAreaRetangulo(entrada);
                break;
            case 'C':
                calcularAreaCirculo(entrada);
                break;
            default:
                System.out.println("O cálculo é inválido.");
        }

        entrada.close();
    }

    private static void calcularAreaTriangulo(Scanner entrada) {
        System.out.print("Informe a base do triângulo: ");
        double baseTriangulo = entrada.nextDouble();
        System.out.print("Informe a altura do triângulo: ");
        double alturaTriangulo = entrada.nextDouble();
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("A área do triângulo é: " + areaTriangulo);
    }

    private static void calcularAreaQuadrado(Scanner entrada) {
        System.out.print("Informe o lado do quadrado: ");
        double ladoQuadrado = entrada.nextDouble();
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A área do quadrado é: " + areaQuadrado);
    }

    private static void calcularAreaRetangulo(Scanner entrada) {
        System.out.print("Informe a base do retângulo: ");
        double baseRetangulo = entrada.nextDouble();
        System.out.print("Informe a altura do retângulo: ");
        double alturaRetangulo = entrada.nextDouble();
        double areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("A área do retângulo é: " + areaRetangulo);

    }

    private static void calcularAreaCirculo(Scanner entrada) {
        System.out.print("Informe o raio do círculo: ");
        double raioCirculo = entrada.nextDouble();
        double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
        System.out.println("A área do círculo é: " + areaCirculo);
    }

}