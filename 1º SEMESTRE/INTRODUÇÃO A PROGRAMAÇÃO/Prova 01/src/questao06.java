/*Seu João quer comparar o consumo de energia elétrica de sua residência nos últimos três meses
para avaliar possíveis mudanças de hábitos e economia na conta de luz. Ele registrou o consumo
mensal (em kWh), que sempre será diferente a cada mês. Para facilitar a análise, ele deseja um
menu com as seguintes opções:
Menu:
a) Maior consumo registrado
b) Menor consumo registrado
c) Consumos ordenados do menor para o maior
d) Média do consumo nos três meses
O menu deve ser implementado utilizando o comando switch em vez de if/else. Os únicos valores a
serem digitados são os três consumos mensais e a opção escolhida no menu. Lembre-se que o
menu só irá executar uma única vez. Para testar uma segunda opção é necessário executar o
programa novamente. */

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // pegando os valores de consumo dos 3 meses
        System.out.println("Informe o consumo do mês 1");
        double consumo1 = entrada.nextDouble();

        System.out.println("Informe o consumo do mês 2");
        double consumo2 = entrada.nextDouble();

        System.out.println("Informe o consumo do mês 3");
        double consumo3 = entrada.nextDouble();

        // pegando a opção do menu
        System.out.println(
                "Menu: \n a) Maior consumo registrado \n b) Menor consumo registrado \n c) Consumos ordenados do menor para o maior \n d) Média do consumo nos três meses");

        String opcao = entrada.next().toUpperCase();

        switch (opcao) {
            // aqui valido qual consumo é o maior registrado
            case "A":
                // validando qual dos 3 consumos é o maior
                if ((consumo1 > consumo2) && (consumo1 > consumo3)) {
                    System.out.println("Maior consumo: " + consumo1);
                } else if ((consumo2 > consumo1) && (consumo2 > consumo3)) {
                    System.out.println("Maior consumo: " + consumo2);
                } else {
                    System.out.println("Maior consumo: " + consumo3);
                }
                break;
            // aqui valido qual consumo é o menor registrado
            case "B":
                // validando qual dos 3 consumos é o menor
                if ((consumo1 < consumo2) && (consumo1 < consumo3)) {
                    System.out.println("Menor consumo: " + consumo1);
                } else if ((consumo2 < consumo1) && (consumo2 < consumo3)) {
                    System.out.println("Menor consumo: " + consumo2);
                } else {
                    System.out.println("Menor consumo: " + consumo3);
                }
                break;
            // aqui eu ordeno consumos de menor para maior
            case "C":
                // validando se o consumo 1 é o menor de todos
                if ((consumo1 < consumo2) && (consumo1 < consumo3)) {
                    /* ai ele ordena os consumos e deixa o consumo 1 como primeiro */
                    System.out.println("Consumos ordenados: " + consumo1 + ", " + consumo2 + ", " + consumo3);
                } else if ((consumo2 < consumo1) && (consumo2 < consumo3)) {
                    /* se caso o consumo 2 for menor entre todos os consumos, ele vai na frente */
                    System.out.println("Consumos ordenados: " + consumo2 + ", " + consumo1 + ", " + consumo3);
                    /*
                     * se caso nem o consumo 1 nem o consumo 2 for menor, então
                     * é o consumo 3 que é o menor de todos e ele vai na frente
                     */
                } else {
                    System.out.println("Consumos ordenados: " + consumo3 + ", " + consumo1 + ", " + consumo2);
                }
                break;
            /*
             * calculo a média dos consumos, somando todos e dividindo pela quantidade de
             * consumos
             */
            case "D":
                double media = (consumo1 + consumo2 + consumo3) / 3;
                System.out.println("Média dos consumos: " + media);
                break;
            /*
             * default caso seja digitado alguma opção diferente das letras informadas no
             * menu
             */
            default:
                System.out.println("Opção inválida");
                break;
        }

        entrada.close();

    }

}
