/*Uma máquina de biscoito está com problemas. 
Quando ligada, após 1 hora ela quebra 1 biscoito, 
na segunda hora ela quebra 3 biscoitos, 
na hora seguinte ela quebra 3 vezes a quantidade de biscoitos 
quebrados na hora anterior, e assim por diante. 
Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia 
(a máquina opera 16 horas por dia).

Pense no resultado! */

public class Uni5Exe11 {
    public static void main(String[] args) {
        int biscoito = 1, totalQuebrado = 0;
        for (int horas_trabalhadas = 1, biscoitos_quebrados = 1; horas_trabalhadas <= 16
                && biscoitos_quebrados <= 16; horas_trabalhadas++, biscoitos_quebrados = 3) {
            biscoito = (biscoito * biscoitos_quebrados);
            totalQuebrado = biscoito + totalQuebrado;
            System.out.println("Na " + horas_trabalhadas + "° hora, a máquina quebra " + biscoito + " biscoito(s)");
        }
        System.out.println("Total de biscoitos quebrados em um dia: " + totalQuebrado);
    }
}
