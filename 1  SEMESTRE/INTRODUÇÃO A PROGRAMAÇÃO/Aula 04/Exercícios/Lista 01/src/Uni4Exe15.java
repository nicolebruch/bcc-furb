/*Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário.
A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos de 12 meses.
Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste.
O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido. */

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {

        /* scanner para pegar os dados informados */
        Scanner entrada = new Scanner(System.in);

        /* pedindo para o usuário informar os meses e o salário dele */
        System.out.println("Informe a quantidade de meses que o funcionário foi admitido: ");
        int mesesAdmitido = entrada.nextInt();

        System.out.println("Informe o seu salário: ");
        double salario = entrada.nextDouble();

        /* fecho o scanner para nao consumir memoria */
        entrada.close();

        /*
         * /*
         * aqui é pro método main conseguir mostrar a mensagem dizendo se recebeu
         * reajuste
         * ou não
         */
        mostrarReajuste(mesesAdmitido, salario);
    }

    /*
     * crio um método para validar se o funcionário recebeu reajuste
     * onde, caso nao entre nessas condições, o funcionário não recebeu reajuste
     * e retorna "0"
     */
    public static double reajusteSalario(int mesesAdmitido, double salario) {
        /*
         * se ele foi admitido faz menos de 12 meses, ele ganha um reajuste
         * de 5% do salário
         */
        if (mesesAdmitido < 12) {
            return salario * 0.05;
            /*
             * se ele foi admitido entre 13 a 48 meses, ele ganha um reajuste
             * de 7% do salário
             */
        } else if (mesesAdmitido >= 13 && mesesAdmitido <= 48) {
            return salario * 0.07;
            /*
             * caso nao seja nenhuma dessas condicoes,
             * ele nao recebe reajuste
             */
        } else {
            return 0;
        }
    }
    /*
     * crio um método void que serve apenas para eu mostrar
     * no terminal as respostas da condição que eu criei
     */
    public static void mostrarReajuste(int mesesAdmitido, double salario) {
        double reajuste = reajusteSalario(mesesAdmitido, salario);
        System.out.println("O reajuste do salário é de: R$ " + reajuste);
        System.out.println("O novo salário será: R$ " + (salario + reajuste));
    }
}
