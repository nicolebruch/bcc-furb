/*Em postos de combustível, os tipos mais comuns de combustíveis são identificados pelas seguintes
letras: G para gasolina, E para etanol e D para diesel. Faça um programa que leia uma letra e exiba o
nome do combustível correspondente. Se for digitada qualquer outra letra, escreva "Entrada
Incorreta". */

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String tipoCombustivel = entrada.next().toUpperCase();

        if (tipoCombustivel.equals("G")) {
            System.out.println("Gasolina");

        } else if (tipoCombustivel.equals("E")) {
            System.out.println("Etanol");

        } else if (tipoCombustivel.equals("D")) {
            System.out.println("Diesel");
        } else {
            System.out.println("Entrada Incorreta");
        }
        entrada.close();
    }
}
