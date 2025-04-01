/*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos,
escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais,
e apenas irmãos se todas as idades forem diferentes. */

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {

        /* scanner para pegar os dados informados */
        Scanner entrada = new Scanner(System.in);

        /* peço p informar o nascimento dos irmaos */
        System.out.println("Informe o ano de nascimento do primeiro irmão: ");
        int anoNascimentoIrmao1 = entrada.nextInt();

        System.out.println("Informe o ano de nascimento do segundo irmão: ");
        int anoNascimentoIrmao2 = entrada.nextInt();

        System.out.println("Informe o ano de nascimento do terceiro irmão: ");
        int anoNascimentoIrmao3 = entrada.nextInt();

        /* fecho o scanner p/ não consumir memória */
        entrada.close();

        /*
         * caso o nascimento do irmao1 seja igual ao dos outros irmaos, eles sao
         * trigemeos
         */
        if (anoNascimentoIrmao1 == anoNascimentoIrmao2 && anoNascimentoIrmao1 == anoNascimentoIrmao3) {
            System.out.println("Os irmãos são trigêmeos");
            /*
             * caso o nascimento do irmao1 e irmao2 seja igual || irmao1 e irmao 3 igual ||
             * irmao 2 e 3 igual,
             * eles sao apenas gemeos, pois só 2 irmaos possuem o mesmo ano de nascimento
             */
        } else if (anoNascimentoIrmao1 == anoNascimentoIrmao2 || anoNascimentoIrmao1 == anoNascimentoIrmao3
                || anoNascimentoIrmao2 == anoNascimentoIrmao3) {
            System.out.println("Os irmãos são gêmeos");
            /*
             * caso nenhum dos irmaos tenha o mesmo ano de nascimento, eles sao apenas
             * irmaos
             */
        } else {
            System.out.println("Os irmãos são apenas irmãos");
        }
    }
}
