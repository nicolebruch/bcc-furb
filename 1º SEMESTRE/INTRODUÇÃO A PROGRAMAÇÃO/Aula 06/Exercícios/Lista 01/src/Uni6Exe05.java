/*Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um respondeu um questionário com 5 perguntas, como por exemplo:

Gosta de música sertaneja?
Gosta de futebol?
Gosta de seriados?
Gosta de redes sociais?
Gosta da Oktoberfest?
A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:

se ambos deram a mesma resposta soma-se 3 pontos ao índice;
se um respondeu IND e o outro SIM ou NÃO soma-se 1;
se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça. Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar a afinidade. Por fim, escreva a afinidade considerando os seguintes intervalos: */

//sim, nao, ind podem responder sobre as perguntas (pra 2 pessoas)
//rapaz e moça respondem as mesmas perguntas
//se ambos deram a mesma resposta soma-se 3 pontos ao índice;
//se um respondeu IND e o outro SIM ou NÃO soma-se 1;
//se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
// criar um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça
// criar um método que possa ler tanto as respostas do rapaz como da moça
//criar um metodo para calcular e retornar a afinidade
//escrever a afinidade considerando os seguintes intervalos:

//15 - Casem!
//10 a 14 - Vocês têm muita coisa em comum!
//5 a 9 - Talvez não dê certo :(
//0 a 4 - Vale um encontro.
//-1 a -9 - Melhor não perder tempo
//-10 - Vocês se odeiam!

import java.util.Scanner;

public class Uni6Exe05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta da Oktoberfest?"
        };

        String[] respostasMenino = new String[5];
        String[] respostasMenina = new String[5];

        


        System.out.println("Respostas do Menino:");
        lerRespostas(scanner, perguntas, respostasMenino);

        System.out.println("Respostas da Menina:");
        lerRespostas(scanner, perguntas, respostasMenina);

        int afinidade = calcularAfinidade(respostasMenino, respostasMenina);

        calcularAfinidade(respostasMenino, respostasMenina);

        escreverAfinidade(afinidade);

        scanner.close();
    }

    public static void lerRespostas(Scanner scanner, String[] perguntas, String[] respostas) {
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + " (SIM, NÃO ou IND): ");
            respostas[i] = scanner.nextLine().toUpperCase();
        }
    }

    public static int calcularAfinidade(String[] respostasMenino, String[] respostasMenina) {
        int afinidade = 0;
        for (int i = 0; i < respostasMenino.length; i++) {
            String respostaMenino = respostasMenino[i];
            String respostaMenina = respostasMenina[i];
    
            if (respostaMenino.equals(respostaMenina)) {
                afinidade += 3;
            } else if (respostaMenino.equals("IND") || respostaMenina.equals("IND")) {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }
        return afinidade;
    }
    

    public static void escreverAfinidade(int afinidade) {
        System.out.println("\nÍndice de Afinidade: " + afinidade);
        if (afinidade >= 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }
}
