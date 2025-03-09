/*As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro 
e arredondado para cima ou para baixo dependendo do tempo.
Até 29 minutos depois da chegada, arredonda-se para baixo 
e após 30 minutos arredonda-se para cima. 
Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora 
e quem estacionar por 1 hora e 35 minutos pagará por duas horas. 
Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. 
Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. 
Por exemplo, o par 12 50 representará meio dia e cinquenta. 
Assim, faça um algoritmo que leia os horários de chegada 
e de partida e escreva na tela o preço a ser cobrado. 
Deverá haver validação de dados. Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas. 
Entretanto, se uma dada hora de chegada for superior à da partida, isso não é uma situação de erro, significará que a partida ocorreu no dia seguinte ao da chegada.
 */

import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /* recebe os horarios de chegada e partida */
        System.out.println("hora de chegada:");
        int horaChegada = entrada.nextInt();

        System.out.println("minuto de chegada:");
        int minutoChegada = entrada.nextInt();

        System.out.println("hora de partida:");
        int horaPartida = entrada.nextInt();

        System.out.println("minuto de partida:");
        int minutoPartida = entrada.nextInt();

        /* converte os horarios para minutos */
        int minutosChegada = converteHorariosParaMinutos(horaChegada, minutoChegada);
        int minutosPartida = converteHorariosParaMinutos(horaPartida, minutoPartida);

        /* ajusta para o caso da partida ser no dia seguinte */
        minutosPartida = ajustaParaDiaSeguinte(minutosChegada, minutosPartida);

        /* calcula o tempo total e arredonda as horas */
        int horasCobradas = calculaTempoTotalEAjustaHoras(minutosChegada, minutosPartida);

        /* calcula o preco total */
        double preco = calculaPrecoTotal(horasCobradas);

        /* exibe o valor final */
        mostrarValor(preco);

        /* fecha o scanner para não consumir memória */
        entrada.close();
    }

    /* metodo para converter os horarios para minutos */
    /* recebe as horas e minutos e converte para minutos totais */
    private static int converteHorariosParaMinutos(int hora, int minuto) {
        /* multiplica as horas por 60 para convertê-las em minutos e soma os minutos */
        return hora * 60 + minuto;
    }

    /* metodo para ajustar para o caso da partida ser no dia seguinte */
    /* se os minutos da partida forem menores que os minutos da chegada, */
    /*
     * isso significa que a partida ocorreu no dia seguinte, por isso somamos 24
     * horas (1440 minutos)
     */
    private static int ajustaParaDiaSeguinte(int minutosChegada, int minutosPartida) {
        /* verifica se a partida foi no dia seguinte */
        if (minutosPartida < minutosChegada) {
            minutosPartida += 24 * 60; /* adiciona 24 horas em minutos */
        }
        return minutosPartida;
    }

    /* metodo para calcular o tempo total e arredondar as horas */
    /* calcula a diferença entre o tempo de partida e chegada */
    /* e arredonda para cima ou para baixo dependendo dos minutos */
    private static int calculaTempoTotalEAjustaHoras(int minutosChegada, int minutosPartida) {
        /* calcula o tempo total em minutos */
        int tempoTotal = minutosPartida - minutosChegada;
        int horasCobradas;

        /* se os minutos forem 29 ou menos, arredonda para baixo (inteiro) */
        if (tempoTotal % 60 <= 29) {
            horasCobradas = tempoTotal / 60; /* arredonda para baixo */
        } else {
            horasCobradas = (tempoTotal / 60) + 1; /* arredonda para cima */
        }

        /* caso o tempo total seja menor que 1 hora (0 horas), considera-se 1 hora */
        if (horasCobradas == 0) {
            horasCobradas = 1;
        }
        return horasCobradas;
    }

    /* metodo para calcular o preco total */
    /* calcula o valor a ser pago com base nas horas cobradas */
    private static double calculaPrecoTotal(int horasCobradas) {
        double preco = 0;

        /* para as primeiras 2 horas, o preço é R$ 5,00 por hora */
        if (horasCobradas <= 2) {
            preco = horasCobradas * 5.00;
        }
        /* para as horas entre 3 e 4, o preço é R$ 7,50 por hora */
        else if (horasCobradas <= 4) {
            preco = 2 * 5.00 + (horasCobradas - 2) * 7.50;
        }
        /* para as horas acima de 4, o preço é R$ 10,00 por hora */
        else {
            preco = 2 * 5.00 + 2 * 7.50 + (horasCobradas - 4) * 10.00;
        }
        return preco;
    }

    /* metodo para exibir o valor final a ser pago */
    /* recebe o preco calculado e exibe no formato de moeda */
    private static void mostrarValor(double preco) {
        /* exibe o preço final formatado como R$ */
        System.out.println("total a pagar: " + preco);
    }
}