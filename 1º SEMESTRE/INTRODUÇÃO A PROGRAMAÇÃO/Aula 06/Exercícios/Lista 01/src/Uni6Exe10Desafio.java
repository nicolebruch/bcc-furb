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

public class Uni6Exe10Desafio {






  
}
