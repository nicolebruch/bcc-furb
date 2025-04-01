import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaInicial = entrada.nextInt();
        int horaFinal = entrada.nextInt();
        int duracao;

            //else pros jogos que começam e terminam no mesmo dia
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
            //else pros jogos que começam num dia e terminam no outro
        } else if (horaInicial > horaFinal) {
            duracao = 24 - horaInicial + horaFinal;
        } else {
            duracao = 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        entrada.close();
    }
}
