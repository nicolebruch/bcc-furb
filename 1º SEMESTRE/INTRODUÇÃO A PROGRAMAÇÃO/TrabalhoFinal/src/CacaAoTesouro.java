import java.util.Scanner;
import java.util.Random;

public class CacaAoTesouro {

    public static void main(String[] args) {

        // cria um mapa com 8 linhas e 8 colunas, tipo uma tabela 8x8
        // cada posição guarda um caractere, que pode ser '~' pra areia, 't' pra tesouro
        // ou 'a' pra armadilha
        // esse é o mapa “real”, onde a gente esconde tudo
        char[][] mapa = new char[8][8];

        // cria outro mapa do mesmo tamanho, que é o que o jogador vai ver
        // inicialmente todo mundo vê só areia, aí conforme escava, a gente vai
        // mostrando o que tem de verdade
        char[][] visivel = new char[8][8];

        // conta quantas vezes o jogador já tentou escavar, começa zerado
        int tentativas = 0;

        // conta quantos tesouros o jogador já encontrou até agora, começa em zero
        // também
        int tesourosAchados = 0;

        // guarda a pontuação do jogador, começa com zero, pode subir ou descer
        // dependendo do que ele achar
        int pontuacao = 0;

        // scanner pra ler as entradas do usuario
        Scanner scanner = new Scanner(System.in);

        // cria um random pra sortear posições aleatórias no mapa, tipo pra colocar os
        // tesouros e armadilhas sem ser previsível
        Random random = new Random();

        /*
         * aqui a gente tá preenchendo os dois mapas com areia ('~') em todas as
         * posições
         */
        // o primeiro for anda nas linhas (de 0 a 7)
        // o segundo for anda nas colunas dentro de cada linha (de 0 a 7)
        // mapa[i][j] quer dizer: “na linha i e coluna j do mapa”
        // essa parte é tipo preparar o tabuleiro vazio antes de colocar tesouros e
        // armadilhas

        // esse for percorre as 8 linhas do mapa
        for (int i = 0; i < 8; i++)
            // esse for percorre as 8 colunas de cada linha
            for (int j = 0; j < 8; j++) {
                // preenche o mapa escondido com areia
                mapa[i][j] = '~';

                // preenche o mapa visível com areia também
                visivel[i][j] = '~';
            }

        /*
         * aqui a gente cria uma variável pra contar quantos tesouros já foram colocados
         * no mapa
         */
        // começa zerada porque ainda não tem nenhum
        int colocados = 0;

        /*
         * enquanto a gente não tiver colocado os 8 tesouros, vai ficar
         * repetindo esse bloco de código
         */
        while (colocados < 8) {

            // escolhe uma linha aleatória de 0 a 7 usando o random
            // nextInt(8) quer dizer: pega um número aleatório entre 0 e 7 (8 não entra)
            int linha = random.nextInt(8);
            // escolhe uma coluna aleatória de 0 a 7 do mesmo jeito
            int coluna = random.nextInt(8);

            // verifica se a posição escolhida ainda está vazia, ou seja, tem só areia ('~')
            if (mapa[linha][coluna] == '~') {

                // se estiver vazia, coloca um tesouro ('t') naquela posição do mapa
                /*
                 * isso quer dizer: no mapa, na linha X e coluna Y, agora tem um 't' que
                 * representa o tesouro
                 */
                mapa[linha][coluna] = 't';

                // aumenta o número de tesouros colocados em 1
                // quando chegar em 8, o while para
                colocados++;
            }
        }

        // aqui adiciono 5 armadilhas em lugares aleatórios (mas nao pode colocar em
        // cima de tesouro)
        // zera pra contar agora as armadilhas
        colocados = 0;

        // esse while vai até colocar as 5 armadilhas
        while (colocados < 5) {
            // sorteia uma linha aleatória de 0 a 7
            int linha = random.nextInt(8);
            // sorteia uma coluna aleatória de 0 a 7
            int coluna = random.nextInt(8);

            /*
             * verifica se nessa posição do mapa ainda tem só areia
             * (ou seja, não tem tesouro nem armadilha)
             */
            if (mapa[linha][coluna] == '~') {

                /*
                 * se tiver só areia, coloca uma armadilha ali
                 * ('a' é o símbolo da armadilha)
                 */
                mapa[linha][coluna] = 'a';

                /*
                 * aumenta o contador das armadilhas colocadas
                 * pra saber quantas já tem
                 */
                colocados++;
            }
        }

        // começa o jogo: roda enquanto o jogador nao tiver feito 25 escavadas ou nao
        // tiver achado os 8 tesouros
        while (tentativas < 25 && tesourosAchados < 8) {

            // mostra o texto no terminal
            System.out.println("\nMapa:");

            // mostra o mapa que o jogador pode ver
            mostrarMapa(visivel);

            // mostra a tentativa atual
            System.out.println("Tentativa " + (tentativas + 1) + "/25");

            // mostra a pontuação do jogador
            System.out.println("Pontuação atual: " + pontuacao);

            // pede pro jogador a linha
            System.out.print("Digite linha (0 a 7): ");

            // lê a linha digitada
            int linha = scanner.nextInt();

            // pede a coluna
            System.out.print("Digite coluna (0 a 7): ");

            // lê a coluna
            int coluna = scanner.nextInt();

            // verifica se o jogador digitou fora do mapa
            if (linha < 0 || linha > 7 || coluna < 0 || coluna > 7) {

                // avisa que digitou errado
                System.out.println("Coordenadas inválidas!");
                continue;
            }

            // verifica se ele já cavou nesse lugar
            if (visivel[linha][coluna] != '~') {

                // avisa que já escavou
                System.out.println("Você já escavou essa posição!");
                continue;
            }

            // aumenta o número de tentativas
            tentativas++;

            // se achou tesouro
            if (mapa[linha][coluna] == 't') {

                // marca o tesouro como achado no mapa visível
                visivel[linha][coluna] = 'T';

                // ganha 10 pontos
                pontuacao += 10;

                // aumenta a contagem de tesouros achados
                tesourosAchados++;

                System.out.println("Tesouro encontrado! +10 pontos!");
            }

            // se achou armadilha
            else if (mapa[linha][coluna] == 'a') {

                // marca a armadilha
                visivel[linha][coluna] = 'A';

                // perde 5 pontos
                pontuacao -= 5;

                System.out.println("Armadilha! -5 pontos!");
            }

            // se cavou e só tinha areia
            else {

                // marca que cavou mas não tinha nada
                visivel[linha][coluna] = 'O';

                System.out.println("Só areia...");
            }
        }

        // quando sair do while, significa que o jogo acabou
        System.out.println("\n=== FIM DE JOGO ===");

        // mostra a pontuação final
        System.out.println("Pontuação final: " + pontuacao);

        // se achou os 8 tesouros, ganhou
        if (tesourosAchados == 8) {
            System.out.println("Você venceu! Todos os tesouros foram encontrados.");
        }

        // se não, perdeu
        else {
            System.out.println("Você perdeu. Fim das escavações.");
        }

        // agora revela o mapa inteiro pro jogador
        System.out.println("\nMapa revelado:");

        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++) {

                // se tinha um tesouro escondido e o jogador não cavou ali, mostra agora
                if (mapa[i][j] == 't' && visivel[i][j] == '~')
                    visivel[i][j] = 't';

                // se tinha armadilha escondida, também revela
                if (mapa[i][j] == 'a' && visivel[i][j] == '~')
                    visivel[i][j] = 'a';
            }

        // mostra o mapa completo revelado
        mostrarMapa(visivel);

        // mostra a classificação do jogador dependendo da pontuação
        System.out.print("Classificação: ");

        if (pontuacao >= 70)
            System.out.println("Explorador Lendário!");
        else if (pontuacao >= 50)
            System.out.println("Caçador de Tesouros Experiente!");
        else if (pontuacao >= 30)
            System.out.println("Aventureiro Iniciante");
        else
            System.out.println("Precisa de mais prática na exploração");

        // fecha o scanner pra evitar vazamento de memória
        scanner.close();
    }

    // essa função mostra o mapa (linhas e colunas) na tela
    public static void mostrarMapa(char[][] mapa) {
        // mostra os números das colunas
        System.out.println("  0 1 2 3 4 5 6 7");

        for (int i = 0; i < 8; i++) {

            // mostra o número da linha
            System.out.print(i + " ");

            for (int j = 0; j < 8; j++) {

                // mostra o conteúdo da posição (areia, tesouro, armadilha, etc)
                System.out.print(mapa[i][j] + " ");
            }

            // pula pra próxima linha
            System.out.println();
        }
    }
}
