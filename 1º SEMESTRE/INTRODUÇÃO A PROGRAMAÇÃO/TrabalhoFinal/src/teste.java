import java.util.Scanner;
import java.util.Random;

public class teste {

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
        for (int i = 0; i < 8; i++) {
            // esse for percorre as 8 colunas de cada linha
            for (int j = 0; j < 8; j++) {
                // preenche o mapa escondido com areia
                mapa[i][j] = '~';
                // preenche o mapa visível com areia também
                visivel[i][j] = '~';
            }
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

        // loop "principal" do jogo, ele vai rodar enquanto:
        /*
         * o jogador ainda não tiver feito 25 escavadas
         * E ainda não tiver achado todos os 8 tesouros
         */
        // se um desses dois acontecer, o jogo acaba

        while (tentativas < 25 && tesourosAchados < 8) {

            /*
             * mostra o texto “Mapa:” na tela pra indicar que vai exibir
             * o mapa visível pro jogador
             */
            System.out.println("\nMapa:");
            // imprime o mapa que o jogador pode ver
            /*
             * imprime a primeira linha com os números de 0 a 7
             * representando as COLUNAS
             * do mapa
             * esse "  " no começo é só pra alinhar com os números
             * das LINHAS que vão aparecer depois
             */
            System.out.println("  0 1 2 3 4 5 6 7");

            // percorre as LINHAS do mapa (de 0 até 7)
            for (int i = 0; i < 8; i++) {
                // imprime o número da LINHA atual
                System.out.print(i + " ");
                // percorre as COLUNAS dessa linha
                for (int j = 0; j < 8; j++) {
                    // imprime o conteúdo da posição [i][j] do mapa visível
                    /*
                     * pode ser '~', 'T', 'A', 'O', etc., seguido de um espaço pra organizar
                     * visualmente
                     */
                    System.out.print(visivel[i][j] + " ");
                }
                // depois de imprimir a linha inteira, quebra a linha pra começar a próxima
                System.out.println();
            }

            // mostra o número da tentativa atual, de 1 até 25
            /*
             * como tentativas começa do zero, precisa colocar +1
             * pra mostrar certinho pro jogador
             */
            System.out.println("Tentativa " + (tentativas + 1) + "/25");
            // mostra quantos pontos o jogador tem naquele momento
            System.out.println("Pontuação atual: " + pontuacao);
            // pede pro jogador digitar o número da linha que ele quer escavar
            System.out.print("Digite linha (0 a 7): ");
            // lê o número digitado e guarda na variável linha
            int linha = scanner.nextInt();
            // pede agora o número da coluna
            System.out.print("Digite coluna (0 a 7): ");
            // lê o número digitado e guarda na variável coluna
            int coluna = scanner.nextInt();

            // aqui verifica se o jogador digitou algo fora do mapa
            // se for menor que 0 ou maior que 7, é inválido
            if (linha < 0 || linha > 7 || coluna < 0 || coluna > 7) {
                /*
                 * se for inválido, avisa o jogador e pula pro próximo loop
                 * (não conta como tentativa)
                 */
                System.out.println("Coordenadas inválidas!");
                // aqui verifica se o jogador já escavou esse lugar antes
                // se já tiver qualquer coisa diferente de '~', é porque ele já cavou ali
            } else if (visivel[linha][coluna] != '~') {
                /*
                 * se já cavou, avisa o jogador e volta pro começo do loop
                 * (também não conta como tentativa)
                 */
                System.out.println("Você já escavou essa posição!");
            } else {
                /*
                 * se chegou aqui, a escavada é válida, então aumenta o número de
                 * tentativas em 1
                 */
                tentativas++;

                // se o jogador cavou e achou um tesouro
                if (mapa[linha][coluna] == 't') {
                    /*
                     * mostra no mapa visível que ali tem um tesouro com T maiúsculo
                     * (pra destacar)
                     */
                    visivel[linha][coluna] = 'T';
                    // ganha 10 pontos por encontrar um tesouro
                    pontuacao = pontuacao + 10;
                    // aumenta o número de tesouros achados
                    tesourosAchados++;
                    System.out.println("Tesouro encontrado! +10 pontos!");

                    // se não tinha tesouro, mas tinha uma armadilha ali
                    // o símbolo 'a' quer dizer armadilha
                } else if (mapa[linha][coluna] == 'a') {
                    /*
                     * marca com A maiúsculo no mapa visível pra mostrar que o jogador
                     * caiu numa armadilha
                     */
                    visivel[linha][coluna] = 'A';
                    // perde 5 pontos por ter caído na armadilha
                    pontuacao = pontuacao - 5;
                    System.out.println("Armadilha! -5 pontos!");
                    // se não tinha nem tesouro nem armadilha, ou seja, só areia
                } else {
                    /*
                     * marca com 'O' no mapa visível,
                     * indicando que escavou mas não tinha nada ali
                     */
                    visivel[linha][coluna] = 'O';
                    System.out.println("Só areia...");
                }
            }
        }

        // quando sair do while, significa que o jogo acabou
        System.out.println("\n=== FIM DE JOGO ===");
        // mostra a pontuação final
        System.out.println("Pontuação final: " + pontuacao);

        // aqui verifica se o jogador achou os 8 tesouros
        // se achou os 8 tesouros, ganhou
        if (tesourosAchados == 8) {
            System.out.println("Você venceu! Todos os tesouros foram encontrados.");
            // se não, mostra que perdeu (acabaram as tentativas)
        } else {
            System.out.println("Você perdeu. Fim das escavações.");
        }

        /*
         * mostra o texto dizendo que agora o mapa real vai ser mostrado
         * (com todos os tesouros e armadilhas)
         */
        System.out.println("\nMapa revelado:");
        // esse for percorre todas as posições do mapa (linha por linha)
        for (int i = 0; i < 8; i++) {
            // esse for percorre todas as posições do mapa (coluna por coluna)
            for (int j = 0; j < 8; j++) {
                /*
                 * se naquela posição tinha um tesouro escondido
                 * e o jogador não cavou ali, mostra o 't' agora
                 */
                if (mapa[i][j] == 't' && visivel[i][j] == '~') {
                    visivel[i][j] = 't';
                }
                /*
                 * mesma ideia: se tinha armadilha escondida e
                 * o jogador não descobriu, mostra agora
                 */
                if (mapa[i][j] == 'a' && visivel[i][j] == '~') {
                    visivel[i][j] = 'a';
                }
            }
        }

        /* mostra o mapa completo revelado, imprimindo o número das colunas */
        System.out.println("  0 1 2 3 4 5 6 7");
        // começa o for que vai passar por cada linha do mapa (de 0 até 7)
        for (int i = 0; i < 8; i++) {
            // antes de mostrar o conteúdo da linha, imprime o número da linha
            // esse número fica do lado esquerdo
            System.out.print(i + " ");
            // agora outro for que vai andar pelas colunas dessa linha
            for (int j = 0; j < 8; j++) {
                // imprime o símbolo que tá nessa posição do mapa visível
                // pode ser areia (~), tesouro (T), armadilha (A), vazio (O), etc.
                // o espaço depois do símbolo é só pra ficar bonitin
                System.out.print(visivel[i][j] + " ");
            }
            // depois de imprimir os 8 símbolos da linha, pula pra próxima linha
            System.out.println();
        }

        // mostra a classificação do jogador dependendo da pontuação
        System.out.print("Classificação: ");
        // se for maior ou igual a 70 pontos
        if (pontuacao >= 70)
            System.out.println("Explorador Lendário!");
        // se for maior ou igual a 50 pontos
        else if (pontuacao >= 50)
            System.out.println("Caçador de Tesouros Experiente!");
        // se for maior ou igual a 30 pontos
        else if (pontuacao >= 30)
            System.out.println("Aventureiro Iniciante");
        // se nao for maior que nenhum, significa que ele é menor que todos
        else
            System.out.println("Precisa de mais prática na exploração");

        scanner.close();
    }
}
