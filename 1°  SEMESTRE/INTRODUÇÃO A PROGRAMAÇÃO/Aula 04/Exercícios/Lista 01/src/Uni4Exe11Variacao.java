/*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos,
escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais,
e apenas irmãos se todas as idades forem diferentes. */

import java.util.Scanner;

public class Uni4Exe11Variacao {
    public static void main(String[] args) {
            
            /*scanner para pegar os dados informados */
            Scanner entrada = new Scanner(System.in);

        /*peço p informar o nascimento dos irmaos */
        System.out.println("Informe o ano de nascimento do primeiro irmão: ");
        int anoNascimentoIrmao1 = entrada.nextInt();

        System.out.println("Informe o ano de nascimento do segundo irmão: ");
        int anoNascimentoIrmao2 = entrada.nextInt();

        System.out.println("Informe o ano de nascimento do terceiro irmão: ");
        int anoNascimentoIrmao3 = entrada.nextInt();

    }
}
