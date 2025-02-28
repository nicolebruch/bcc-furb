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

















        
         int numero = entrada.nextInt();
         int centena = numero / 100;
         numero %= 100;
         int dezena = numero / 10;
         numero %= 10;
         int unidade = numero / 1;
         System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
         entrada.close();
 
    } 
 }