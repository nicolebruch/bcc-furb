/*Descreva um algoritmo para calcular o valor de S dado por:

S = 3/2 + 5/6 + 7/12 + 9/20 + 11/30 + ...

Considere os 20 primeiros termos da série.

Pense no resultado!*/

public class Uni5Exe04 {
    public static void main(String[] args) {

        double soma = 0;
        double numerador = 3;
        double denominador = 2;

        for (int i = 1; i <= 20; i++) {
            soma = soma + (numerador / denominador);
            numerador = numerador + 2; 
            denominador = denominador + i;
        }
        System.out.println("A soma da série é: " + soma);
    }

}
