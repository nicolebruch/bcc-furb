package sistema_academia;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Giovanna", "12", 18, 48.8, 1.70);
        Aluno aluno2 = new Aluno("Douglas", "31", 36, 76.3, 1.75);
        Aluno alunoBasico = new Aluno();

       
        try {
            Aluno alunoInvalido = new Aluno("Rafaela", "17", -15, 60.2, 1.71);
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possível criar o aluno: " + e.getMessage());
        }


        PlanoTreino treino1 = new PlanoTreino("Treino para resistência", "Avançado", true);
        PlanoTreino treino2 = new PlanoTreino("Treino para força", "Intermediário", false);
        PlanoTreino treinoBasico = new PlanoTreino();

        try {
            PlanoTreino treinoInvalido = new PlanoTreino("", "Iniciante", false);
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possível criar o plano de treino: " + e.getMessage());
        }


        aluno1.adicionarPlano(treino1);
        aluno1.adicionarPlano(treino2);

        aluno2.adicionarPlano(treino2);
        aluno2.adicionarPlano(treinoBasico);
        alunoBasico.adicionarPlano(treinoBasico);

        System.out.println("\n===== Alunos Cadastrados =====");
        System.out.println(aluno1.getNome() + " | Idade: " + aluno1.getIdade());
        System.out.println(aluno2.getNome() + " | Idade: " + aluno2.getIdade());
        System.out.println(alunoBasico.getNome() + " | Idade: " + alunoBasico.getIdade());

        System.out.println("\n===== Planos de Treino do Aluno 1 =====");
        for (PlanoTreino plano : aluno1.getPlanosTreinos()) {
            System.out.println(plano.getDescricao() + " | Nivel: " + plano.getNivel() + " | Ativo: " + (plano.isAtivo()));
        }

        System.out.println("\n===== Planos de Treino do Aluno 2 =====");
        for (PlanoTreino plano : aluno2.getPlanosTreinos()) {
            System.out.println(plano.getDescricao() + " | Nivel: " + plano.getNivel() + " | Ativo: " + (plano.isAtivo()));
        }

        System.out.println("\n===== Planos de Treino do Aluno Básico =====");
        for (PlanoTreino plano : alunoBasico.getPlanosTreinos()) {
            System.out.println(plano.getDescricao() + " | Nivel: " + plano.getNivel() + " | Ativo: " + (plano.isAtivo()));
        }

        System.out.println("\n===== Alterando Ativação de Planos =====");
        treino1.desativar();
        treino2.ativar();
    }
}
