
/*
Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,
descreva um algoritmo que calcule a média de aproveitamento
e o conceito do aluno, 
usando a fórmula:

media=(notaProva1+notaProva22+notaProva33+notaExercicios)/7


media	       conceito
>= 9.0	        A
>= 7.5 e < 9.0	B
>= 6.0 e < 7.5	C
>= 4.0 e < 6.0	D
< 4.0	        E

O algoritmo deve escrever a média de aproveitamento,
o conceito correspondente 
e a mensagem "aprovado" caso o conceito seja A, B ou C,
e "reprovado" caso o conceito seja D ou E.
*/
import java.util.Scanner;

public class Uni4Exe20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a sua primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe a sua segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Informe a sua terceira nota: ");
        double nota3 = entrada.nextDouble();

        System.out.println("Informe a sua nota de exercícios realizados: ");
        double notaExercicios = entrada.nextDouble();

         /* fecho o scanner para não consumir memória */
        entrada.close();

        double mediaNotas = (nota1 + nota2 * 2 + nota3 * 3 + notaExercicios) / 7;

        mostrarSituacao(mediaNotas);
    }

    private static boolean conceitoA(double mediaNotas) {
        return mediaNotas >= 9.0;
    }

    private static boolean conceitoB(double mediaNotas) {
        return mediaNotas >= 7.5 || mediaNotas < 9.0;
    }

    private static boolean conceitoC(double mediaNotas) {
        return mediaNotas >= 4.0 || mediaNotas < 6.0;
    }

    private static boolean conceitoD(double mediaNotas) {
        return mediaNotas >= 4.0 || mediaNotas < 6.0;
    }

    private static boolean conceitoE(double mediaNotas) {
        return mediaNotas < 4.0;
    }

    private static void mostrarSituacao(double mediaNotas) {
        if (conceitoA(mediaNotas)) {
            System.out.println("APROVADO! " + " A média de nota é igual a: " + mediaNotas + ", conceito A.");

        } else if (conceitoB(mediaNotas)) {
            System.out.println("APROVADO! " + " A média de nota é igual a: " + mediaNotas + ", conceito B.");

        } else if (conceitoC(mediaNotas)) {
            System.out.println("APROVADO! " + " A média de nota é igual a: " + mediaNotas + ", conceito C.");

        } else if (conceitoD(mediaNotas)) {
            System.out.println("Reprovado! " + " A média de nota é igual a: " + mediaNotas + ", conceito D.");

        } else if (conceitoE(mediaNotas)) {
            System.out.println("Reprovado! " + " A média de nota é igual a: " + mediaNotas + ", conceito E.");

        } else {
            System.out.println("Média inválida");
        }
    }
}