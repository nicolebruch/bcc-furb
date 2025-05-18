/*DESAFIO - Análise de Notas Escolares */

//realizar analise de notas de uma turma escolar
//permitir cadastro das notas dos alunos
//permitir calcular estatisticas basicas
//classificar os alunos baseado no desempenho deles 

/*armazenamento de no maximo 20 alunos:
- numero da matricula (int)
- nota da prova de 0 a 10 (double)
- frequencia/presença na aula de 0 a 20 (int)
 */

/* menu precisa ter essas opcoes:
Loop do-while para o menu principal do programa
Estrutura switch para o menu de opções
 1: Cadastrar aluno
 2: Exibir dados de todos os alunos
 3: Calcular estatísticas da turma
 4: Verificar situação de um aluno específico
 5: Sair 
 */

/* opção --> 1: Cadastrar aluno
Vetores para armazenar os dados dos alunos
 - pede numero da matricula dele
 - pede a nota dele
 - pede a frequencia dele
 
 usa um loop p encontrar a posicao de um aluno pelo numero da matricula
 - verifica se a matricula ja existe
 - se existir ele nao vai cadastrar o aluno
- se nao existir, ele armazena todos esses dados 1 em cada vetor
*/

/*opção --> 2: Exibir dados de todos os alunos 
Loop for para percorrer e exibir os vetores
- vai mostrar no terminal todos os alunos cadastrados
- mostra no terminal a matricula de todos os alunos 
- mostra no terminal a nota de todos os alunos 
- mostra no terminal frequencia de todos os alunos 
- mostra no terminal a situacao de aprovacao do ladinho de cada aluno
Estrutura if-else para verificar a situação dos alunos

"Aprovado" se nota >= 7.0 e frequência >= 15
"Recuperação" se nota >= 5.0 e < 7.0 e frequência >= 15
"Reprovado por nota" se nota < 5.0 e frequência >= 15
"Reprovado por frequência" se frequência < 15
*/

/* opção --> 3: Calcular estatísticas da turma
utilizar variaveis aux/temp pra calcular as estatisticas
- calcula e mostra a maior nota da turma
- calcula  e mostra a menor nota da turma 

- calcula e mostra a media das notas 

- calcula e mostra a quantidade de alunos aprovados
- calcula e mostra a quantidade alunos em recuperacao
- calcula e mostra a quantidade de alunos reprovados

- calcula e mostra quantos porcentos (%) de provacao 
aprovados / total de alunos
*/

/* opção --> 4: Verificar situação de um aluno específico
Loop while para buscar um aluno específico
  - pede o numero da matricula do aluno 
  - encontra o aluno no vetor de matriculas

  - mostro no terminal a matricula do aluno
  - mostro no terminal a nota do aluno
  - mostro no terminal a frequencia do aluno
  mostro no terminal se ele ta aprovado, de recuperacao ou reprovado 
  
  - mostro uma mensagem personalizada conforme a situacao do aluno
  EX: Que felicidade! :)
  EX: Foco nos estudos! :|
  EX: Que pena! :( 
 */

/*validacoes que precisam ter:
- notas devem estar de 0 a 10
- frequencia deve estar de 0 a 20
- nao pode ter matricula duplicada
 */

/*
===== SISTEMA DE ANÁLISE DE NOTAS =====
1. Cadastrar aluno
2. Exibir dados de todos os alunos
3. Calcular estatísticas da turma
4. Verificar situação de um aluno específico
5. Sair
Escolha uma opção: _
 */

import java.util.Scanner;

public class Uni6Exe10Desafio {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int matriculasVetor[] = new int[20];
    double notasVetor[] = new double[20];
    int frequenciasVetor[] = new int[20];

    int qntdAlunos = 0;
    int opcao = 0;
    int matricula = 0;
    int frequencia = 0;
    int qntdAprovados = 0;
    int qntdRecuperacao = 0;
    int qntdReprovados = 0;

    do {

      System.out.println("===== SISTEMA DE ANÁLISE DE NOTAS =====");
      System.out.println("1. Cadastrar aluno");
      System.out.println("2. Exibir dados de todos os alunos");
      System.out.println("3. Calcular estatísticas da turma");
      System.out.println("4. Verificar situação de um aluno específico");
      System.out.println("=======================================");

      System.out.println("Escolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {

        /*
         * opção --> 1: Cadastrar aluno
         * Vetores para armazenar os dados dos alunos
         * - pede numero da matricula dele
         * - pede a nota dele
         * - pede a frequencia dele
         * 
         * usa um loop p encontrar a posicao de um aluno pelo numero da matricula
         * - verifica se a matricula ja existe
         * - se existir ele nao vai cadastrar o aluno
         * - se nao existir, ele armazena todos esses dados 1 em cada vetor
         */
        case 1:

          if (qntdAlunos >= 20) {
            System.out.println("Número de alunos excedeu o limite. :/");
          } else {
            System.out.println("Informe o número da sua matrícula: ");
            matricula = scanner.nextInt();

            for (int i = 0; i < 20; i++) {
              if (matricula == matriculasVetor[i]) {
                System.out.println("A matrícula informada já possui cadastro.");
                System.out.println("Informe novamente a sua matricula: ");
                matricula = scanner.nextInt();
              }
            }

            matriculasVetor[qntdAlunos] = matricula;

            System.out.println("Informe a sua nota: ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
              System.out.println("A nota informada é inválida.");
              System.out.println("Informe novamente a sua nota: ");
              nota = scanner.nextDouble();
            }

            notasVetor[qntdAlunos] = nota;

            System.out.println("Informe a sua frequência: ");
            frequencia = scanner.nextInt();

            if (frequencia < 0 || nota > 20) {
              System.out.println("A frequência informada é inválida.");
              System.out.println("Informe novamente a sua frequência: ");
              frequencia = scanner.nextInt();
            }

            frequenciasVetor[qntdAlunos] = frequencia;

            qntdAlunos++;
          }

          break;

        /*
         * opção --> 2: Exibir dados de todos os alunos
         * Loop for para percorrer e exibir os vetores
         * - vai mostrar no terminal todos os alunos cadastrados
         * - mostra no terminal a matricula de todos os alunos
         * - mostra no terminal a nota de todos os alunos
         * - mostra no terminal frequencia de todos os alunos
         * - mostra no terminal a situacao de aprovacao do ladinho de cada aluno
         * Estrutura if-else para verificar a situação dos alunos
         */
        case 2:

          for (int i = 0; i < qntdAlunos; i++) {
            System.out.println("===== EXIBINDO DADOS DOS ALUNOS =====");
            System.out.println("Dados do aluno: " + i);
            System.out.println("Matrícula: " + matriculasVetor[i]);
            System.out.println("Nota: " + notasVetor[i]);
            System.out.println("Frequência: " + frequenciasVetor[i]);

            /*
             * "Aprovado" se nota >= 7.0 e frequência >= 15
             * "Recuperação" se nota >= 5.0 e < 7.0 e frequência >= 15
             * "Reprovado por nota" se nota < 5.0 e frequência >= 15
             * "Reprovado por frequência" se frequência < 15
             */

            if (notasVetor[i] >= 7 && frequenciasVetor[i] >= 15) {
              System.out.println("Situação: Aprovado");
              qntdAprovados++;

            } else if (notasVetor[i] >= 5 && frequenciasVetor[i] >= 15) {
              System.out.println("Situação: Recuperação");
              qntdRecuperacao++;

            } else if (notasVetor[i] < 5 && frequenciasVetor[i] >= 15) {
              System.out.println("Situação: Reprovado por nota");
              qntdReprovados++;

            } else if (frequenciasVetor[i] < 15) {
              System.out.println("Situação: Reprovado por frequência");
              qntdReprovados++;

            }

            System.out.println("=====================================");

            qntdAprovados = 0;
            qntdRecuperacao = 0;
            qntdReprovados = 0;
          }

          break;

        /*
         * opção --> 3: Calcular estatísticas da turma
         * utilizar variaveis aux/temp pra calcular as estatisticas
         * - calcula e mostra a maior nota da turma
         * - calcula e mostra a menor nota da turma
         * 
         * - calcula e mostra a media das notas
         * 
         * - calcula e mostra a quantidade de alunos aprovados
         * - calcula e mostra a quantidade alunos em recuperacao
         * - calcula e mostra a quantidade de alunos reprovados
         * 
         * - calcula e mostra quantos porcentos (%) de provacao
         * aprovados / total de alunos
         */
        case 3:

          double maiorNota = Double.MIN_VALUE;
          double menorNota = Double.MAX_VALUE;

          double soma = 0;

          for (int i = 0; i < qntdAlunos; i++) {
            if (notasVetor[i] > maiorNota) {
              maiorNota = notasVetor[i];
            }

            if (notasVetor[i] < menorNota) {
              menorNota = notasVetor[i];
            }

            soma = soma + notasVetor[i];

            if (notasVetor[i] >= 7 && frequenciasVetor[i] >= 15) {
              System.out.println("Situação: Aprovado.");
              qntdAprovados++;

            } else if (notasVetor[i] >= 5 && frequenciasVetor[i] >= 15) {
              System.out.println("Situação: Recuperação");
              qntdRecuperacao++;

            } else if (notasVetor[i] < 5 && frequenciasVetor[i] >= 15) {
              System.out.println("Situação: Reprovado por nota");
              qntdReprovados++;

            } else if (frequenciasVetor[i] < 15) {
              System.out.println("Situação: Reprovado por frequência");
              qntdReprovados++;

            }

          }

          System.out.println("===== EXIBINDO ESTÁTISTICA DA TURMA ====");
          System.out.println("Maior nota: " + maiorNota);
          System.out.println("Menor nota: " + menorNota);
          System.out.println("Média das notas: " + (soma / qntdAlunos));
          System.out.println("Quantidade de alunos Aprovados: " + qntdAprovados);
          System.out.println("Quantidade de alunos em Recuperação: " + qntdRecuperacao);
          System.out.println("Quantidade de alunos Reprovados: " + qntdReprovados);
          System.out.println("Porcentagem de Aprovação dos alunos: " + (qntdAprovados / qntdAlunos));
          System.out.println("=======================================");

          qntdAprovados = 0;
          qntdRecuperacao = 0;
          qntdReprovados = 0;

          break;

        /*
         * opção --> 4: Verificar situação de um aluno específico
         * Loop while para buscar um aluno específico
         * - pede o numero da matricula do aluno
         * - encontra o aluno no vetor de matriculas
         * 
         * - mostro no terminal a matricula do aluno
         * - mostro no terminal a nota do aluno
         * - mostro no terminal a frequencia do aluno
         * mostro no terminal se ele ta aprovado, de recuperacao ou reprovado
         * 
         * - mostro uma mensagem personalizada conforme a situacao do aluno
         * EX: Que felicidade! :)
         * EX: Foco nos estudos! :|
         * EX: Que pena! :(
         */
        case 4:
          System.out.println("===== EXIBINDO SITUAÇÃO DE ALUNO ====");
          System.out.println("Informe o número da sua matrícula: ");
          int matriculaSituacao = scanner.nextInt();

          for (int i = 0; i < 20; i++) {
            if (matriculasVetor[i] == matriculaSituacao) {
              System.out.println("Nota: " + notasVetor[i]);
              System.out.println("Frequência" + frequenciasVetor[i]);

              if (notasVetor[i] >= 7 && frequenciasVetor[i] >= 15) {
                System.out.println("Situação: Aprovado.");

              } else if (notasVetor[i] >= 5 && frequenciasVetor[i] >= 15) {
                System.out.println("Situação: Recuperação");

              } else if (notasVetor[i] < 5 && frequenciasVetor[i] >= 15) {
                System.out.println("Situação: Reprovado por nota");

              } else if (frequenciasVetor[i] < 15) {
                System.out.println("Situação: Reprovado por frequência");

              }
            }
          }

          System.out.println("=======================================");

          break;

        default:
          System.out.println("Opção não é válida.");
          break;

      }

    } while (opcao != 5);
    System.out.println("Fim do programa.");

    scanner.close();
  }

}