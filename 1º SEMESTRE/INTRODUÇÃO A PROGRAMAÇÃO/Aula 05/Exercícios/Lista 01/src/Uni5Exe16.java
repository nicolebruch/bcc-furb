/*Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do sexo (sexo = 'M' ou sexo = 'm' para masculino e sexo = 'F' 
e sexo = 'f' para feminino) de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.*/

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double somaAlturaGrupo = 0;
        double somaAlturaMulher = 0;
        int contadorAlturaGrupo = 0;
        int contadorAlturaMulher = 0;

        System.out.println("Informe a sua altura(Ou 0 para encerrar): ");
        double altura = entrada.nextDouble();

        while (altura != 0) {
            System.out.println("Informe o seu sexo digitando 'M' para Masculino e 'F' para Feminino: ");
            char sexo = entrada.next().charAt(0);

            somaAlturaGrupo = somaAlturaGrupo + altura;
            contadorAlturaGrupo++;

            if (sexo == 'M' || sexo == 'm') {
                somaAlturaMulher = somaAlturaMulher + altura;
                contadorAlturaMulher++;

            }

        }

    }

}

//falta terminar, mas estou sem bateria :(