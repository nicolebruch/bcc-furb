/*Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:

8,10,16,18,32,34,64, ...
O valor n deve ser lido e deve ser maior do que 2. 
 */

//vai variando de 2 e 4, 2 e 4, 2 e 4

public class Uni5Exe05 {
    public static void main(String[] args) {

        int numero1 = 2;
        int numero2 = 4;
        int soma = 0;

        for (int i = 1; i <= 64; i++) {
            soma += numero1 + i;
            soma += numero2 + i;
            System.out.println("A serie é: " + soma);

        }

    }

}
