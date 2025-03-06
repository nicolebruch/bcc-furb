/*Uma loja que trabalha com crediário funciona da seguinte maneira: 
se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. 
Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto,
e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso.
Faça um algoritmo que leia o dia do vencimento,
o dia do pagamento
e o valor da prestação
e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens.
Suponha que todo vencimento ocorre até o dia dez de cada mês
e os clientes nunca deixam para pagar no mês seguinte. */

import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o dia do vencimento: ");
        int diaVencimento = entrada.nextInt();

        System.out.println("Informe o dia do pagamento: ");
        int diaPagamento = entrada.nextInt();

        System.out.println("Informe o valor da prestação: ");
        int valorPrestacao = entrada.nextInt();

        entrada.close();

        double pagamentoEmDia = pagamentoEmDia(diaVencimento, diaPagamento, valorPrestacao);
        double pagamentoCincoDiasAtraso = pagamentoCincoDiasAtraso(diaVencimento, diaPagamento, valorPrestacao);
        double pagamentoMaisDeCincoDiasAtraso = pagamentoMaisDeCincoDiasAtraso(diaVencimento, diaPagamento, valorPrestacao);

        mostrarPagamento(pagamentoEmDia);
        mostrarPagamento(pagamentoCincoDiasAtraso);
        mostrarPagamento(pagamentoMaisDeCincoDiasAtraso);
    }

    private static double pagamentoEmDia(int diaVencimento, int diaPagamento, int valorPrestacao) {
        double valorPagamento = 0;
        if (diaPagamento <= diaVencimento) {
            valorPagamento = valorPrestacao - (valorPrestacao * 0.10);
            System.out.println("Pagamento em dia");
        }
        return valorPagamento;
    }

    private static double pagamentoCincoDiasAtraso(int diaVencimento, int diaPagamento, int valorPrestacao) {
        double valorPagamento = 0;
        if (diaPagamento <= diaVencimento + 5) {
            valorPagamento = valorPrestacao;
            System.out.println("Pagamento com atraso de até 5 dias");
        }
        return valorPagamento;
    }

    private static double pagamentoMaisDeCincoDiasAtraso(int diaVencimento, int diaPagamento, int valorPrestacao) {
        double valorPagamento = 0;
        if (diaPagamento > diaVencimento + 5) {
            int diasAtraso = diaPagamento - diaVencimento;
            valorPagamento = valorPrestacao + (valorPrestacao * (diasAtraso * 0.02));
            System.out.println("Pagamento com atraso de mais de 5 dias");
        }
        return valorPagamento;
    }

    private static void mostrarPagamento(double valorPagamento) {
        System.out.println("O valor a ser pago é de R$ " + valorPagamento);
    }
}

/*nao soube implementar esse exercicio, 
PRECISO refazer... ta triste a situacao desse
exercicio*/ 