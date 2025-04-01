/*Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  
Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s)   */

import java.util.Scanner;

public class Uni3Exe15 {
     public static void main(String[] args) {
          /*
           * Scanner pra poder estar puxando os dados
           * na memória que o usuário informou
           */
          Scanner entrada = new Scanner(System.in);

          /*
           * digito um número de até 3 digitos afim de
           * avaliar se tem centena, dezena e unidade
           */
          System.out.println("Digite um número de até 3 dígitos: ");
          int numero = entrada.nextInt();

          /* fecho o scanner para não consumir memória */
          entrada.close();

          /*
           * calculos pro programa entender se o número é
           * centena,dezena e unidade
           */

          /*
           * 384 / 100 = 3
           * 384 % 100 = 84
           * 84 / 10 = 8
           * 84 % 10 = 4
           */

          // 384 / 100 = 3
          int centena = numero / 100;

          // 384 % 100 = 84
          int resto = numero % 100;

          // 84 / 10 = 8
          int dezena = resto / 10;

          // 84 % 10 = 4
          int unidade = resto % 10;

          /* aqui eu printo a saída */
          System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
     }
}