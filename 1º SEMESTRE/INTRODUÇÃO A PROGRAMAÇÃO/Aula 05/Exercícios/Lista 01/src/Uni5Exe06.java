
/*Descreva um algoritmo que leia a altura de 20 pessoas 
e calcule a média de altura das mesmas.

 */
import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Adicione a altura da " + i + "° pessoa");
            int altura = ler.nextInt();
            soma = altura + soma;
        }
        int media = soma / 20;
        System.out.println("A média de altura é: " + media);
        ler.close();
    }
}
