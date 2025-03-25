/*Uma loja que trabalha com crediário funciona da seguinte maneira:
se o pagamento ocorre até o dia do vencimento,
o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. 
Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto,
e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso.
Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação
e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. 
Suponha que todo vencimento ocorre até o dia dez de cada mês 
e os clientes nunca deixam para pagar no mês seguinte.
*/

import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {
        /** cria o scanner para ler os dados do usuario */
        Scanner entrada = new Scanner(System.in);

        /** pede e armazena o dia do vencimento */
        System.out.println("informe o dia do vencimento: ");
        int diaVencimento = entrada.nextInt();

        /** pede e armazena o dia do pagamento */
        System.out.println("informe o dia do pagamento: ");
        int diaPagamento = entrada.nextInt();

        /** pede e armazena o valor da prestacao */
        System.out.println("informe o valor da prestacao: ");
        double valorPrestacao = entrada.nextDouble();

        /** fecha o scanner, ja pegamos todos os dados necessarios */
        entrada.close();

        /** chama o metodo que decide qual tipo de pagamento aplicar */
        calcularPagamento(diaVencimento, diaPagamento, valorPrestacao);
    }

    /** metodo que decide qual regra aplicar com base no dia do pagamento */
    private static void calcularPagamento(int diaVencimento, int diaPagamento, double valorPrestacao) {
        if (diaPagamento <= diaVencimento) {
            pagamentoEmDia(valorPrestacao);
        } else if (diaPagamento <= diaVencimento + 5) {
            pagamentoCincoDiasAtraso(valorPrestacao);
        } else {
            pagamentoMaisDeCincoDiasAtraso(diaVencimento, diaPagamento, valorPrestacao);
        }
    }

    /** metodo para pagamento em dia (desconto de 10%) */
    private static void pagamentoEmDia(double valorPrestacao) {
        double valorComDesconto = valorPrestacao * 0.1;
        System.out.println("Pagamento em dia. Desconto de 10% aplicado.");
        mostrarPagamento(valorComDesconto);
    }

    /** metodo para pagamento com ate 5 dias de atraso (sem desconto, sem multa) */
    private static void pagamentoCincoDiasAtraso(double valorPrestacao) {
        System.out.println("Pagamento com atraso de ate 5 dias. Sem desconto.");
        mostrarPagamento(valorPrestacao);
    }

    /** metodo para pagamento com mais de 5 dias de atraso (multa de 2% ao dia) */
    private static void pagamentoMaisDeCincoDiasAtraso(int diaVencimento, int diaPagamento, double valorPrestacao) {
        int diasAtraso = diaPagamento - diaVencimento;
        double valorComMulta = valorPrestacao + (valorPrestacao * (diasAtraso * 0.02));
        System.out.println("Pagamento com atraso de mais de 5 dias. Multa de 2% por dia aplicada.");
        mostrarPagamento(valorComMulta);
    }

    /** metodo para exibir o valor final a ser pago */
    private static void mostrarPagamento(double valorPagamento) {
        System.out.printf("O valor a ser pago é r$ %.2f\n", valorPagamento);
    }
}
