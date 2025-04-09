/*Descreva um algoritmo que calcule e 
escreva a soma da seguinte série de 100 termos: 
1/1 + 1/2 + 1/3 + 1/4 + ... + 1/100*/

//precisa usar o FOR

public class Uni5Exe03 {
    public static void main(String[] args) {

        double soma = 0;
        double i = 1;

        for (i = 1; i <= 100; i++) {
            soma = soma + (1 / i);
        }
        System.out.println("A soma da série é: " + soma);

    }

}
