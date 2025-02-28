/*Uma loja de calçados está concedendo 12% de desconto nos produtos.
Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos
 e quanto deve custar o produto com o desconto. 
 O preço do par de sapatos deve ser informado pelo usuário. 
 Como resultado, o programa deverá exibir as seguintes mensagens:
O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {

    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        // Utilizando classe do DecimalFormat para formatar decimais
        DecimalFormat df = new DecimalFormat("0.00");

        /* Informando o nome do sapato */
        System.out.println("Informe o nome do Sapato:");
        String nomeSapato = entrada.next();

        /* Informando o valor do sapato */
        System.out.println("Informe o valor do Sapato:");
        double precoSapato = entrada.nextDouble();

        /* Fazendo o cálculo do desconto (Caso o cliente tenha desconto) */
        double valorDesconto = precoSapato * 0.12;
        double valorTotalComDesconto = precoSapato - valorDesconto;

        // Chamando o método para mostrar a mensagem de desconto
        mostrarMensagemDeDesconto(valorDesconto, valorTotalComDesconto, nomeSapato, df);

        //Fechando o Scanner para não consumir memória
        entrada.close();
    }

    // Verifica se produto tem desconto
    // Criei um método porque é mais performático do que colocar uma condição enorme
    // dentro do IF
    private static boolean temDesconto(String nomeSapato) {
        return nomeSapato.equalsIgnoreCase("Salto")
                || nomeSapato.equalsIgnoreCase("Tenis")
                || nomeSapato.equalsIgnoreCase("Sandalia");
    }

    // Método que só serve p/ mostrar algo ao usuário, pois tem void
    // Então o método se chama "mostrarMensagemDeDesconto"

    /*
     * Aqui preciso chamar os meus atributos/variáveis novamente,
     * pois o método não consegue acessar as variáveis que foram declaradas em outro
     * método,
     * no caso na "main"
     */

    // Então no caso, coloco os atributos que preciso utilizar nesse outro método na
    // parte dos parâmetros
    private static void mostrarMensagemDeDesconto(Double valorDesconto, Double valorTotalComDesconto, String nomeSapato,
            DecimalFormat df) {
        /* Realizo uma condição, para só dar desconto a nomes de sapatos específicos */
        // Aqui eu só puxo o meu método no "if" e o seu parâmetro chamado "nomeSapato"
        if (temDesconto(nomeSapato)) {
            System.out.println("Você tem direito ao desconto de 12% R$" + df.format(valorDesconto) + "! Ficando por: R$"
                    + df.format(valorTotalComDesconto));
        } else {
            // Caso não seja os nomes que estão na condição, ele não deixará levar o
            // desconto
            System.out.println("Você não tem direito ao desconto.");
        }
    }

}