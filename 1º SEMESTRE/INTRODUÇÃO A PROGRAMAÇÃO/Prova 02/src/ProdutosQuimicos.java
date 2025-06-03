/*eu sou técnico de laboratório e preciso criar um sistema
 * de armazenar produtos químicos
 */

/*armazeno num armário com capacidade limitada (o usuário 
 * informa a capacidade)
) */

/*cada produto possui:
 * int volume
 * String nome
 */

/*criar um menu (switch case & do while)*/

/*precisa ter opcao para sair do programa */

import java.util.Scanner;

public class ProdutosQuimicos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* solicita ao usuário o volume máximo que o armário suporta */
        System.out.print("Informe a capacidade máxima em volume do armário: ");
        int capacidadeMaxima = scanner.nextInt();

        /*
         * solicita ao usuário a quantidade máxima de produtos que podem ser armazenados
         */
        System.out.print("Informe a quantidade máxima de produtos que o armário pode armazenar: ");
        int maxProdutos = scanner.nextInt();
        scanner.nextLine();

        /* arrays para armazenar nome e volume dos produtos */
        String[] nomes = new String[maxProdutos];
        int[] volumes = new int[maxProdutos];

        /* controle da quantidade e volume pra ver se nao extrapolou */
        int quantidade = 0;
        int volumeAtual = 0;
        int opcao;

        /* menu informado com do while */
        do {
            System.out.println("===== ARMAZENAMENTO DE PRODUTOS QUÍMICOS =====");
            System.out.println("1. Inserir um produto");
            System.out.println("2. Imprimir produtos armazenados");
            System.out.println("3. Produto mais volumoso");
            System.out.println("4. Ordenar produtos");
            System.out.println("5. Excluir produto");
            System.out.println("6. Sair");
            System.out.println("==============================================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                /*
                 * adiciona o produto no armario se tiver espaço disponivel e nao
                 * tiver atingido o volume maximo
                 */
                /*
                 * se o volume do produto ultrapassa o limite total do armario (ou nao tiver
                 * mais vaga)
                 * precisa informar na tela "Armário está cheio"
                 */
                // se a quantidade de produtos for maior do que a quantidade que cabe no
                // armario,
                // então não pode adicionar mais produtos
                case 1:
                    if (quantidade >= maxProdutos) {
                        /* verifica se a quantidade máxima de produtos já foi atingida */
                        System.out.println("O armário atingiu o número máximo de produtos.");
                    } else {
                        System.out.print("Informe o nome do Produto Químico: ");
                        String nome = scanner.next();

                        // usado pra nao atrapalhar quando eu dou o enter na resposta
                        // e ele nao lê o próximo input
                        scanner.nextLine();

                        System.out.print("Informe o volume do produto: ");
                        int volume = scanner.nextInt();

                        // limpo o enter pra evitar problema na proxima leitura
                        // afim de que ele leia o que eu for colocar e nao ficar bugado
                        scanner.nextLine();

                        /*
                         * verifica se somando o volume atual com o novo ultrapassa o máximo permitido
                         */
                        // se for maior do que a capacidade maxima do armario, entao nao pode adicionar
                        if (volumeAtual + volume > capacidadeMaxima) {
                            System.out.println("Não é possível adicionar, volume excede a capacidade do armário.");
                        } else {
                            /* adiciona o produto ao armário se ele nao passa do limite */
                            // guardo o nome do produto na posicao que está a quantidade de produtos ja
                            // guardados

                            /*
                             * exemplo: se a quantidade foi 2, significa q eu ja tenho 2 produtos guardados
                             * na posicao 2 da lista, entao a gente so poe o nome na sua posicao
                             */
                            nomes[quantidade] = nome;
                            // guardo o volume do produto que estou recem adicionando na mesma posicao do
                            // nome
                            // guardo a informacao do volume ao lado do nome do devido produto
                            volumes[quantidade] = volume;
                            // aumenta a quantidade de produtos guardados
                            /*
                             * exemplo: se eu tinha 2 produtos guardados no armario,
                             * agora eu tenho 3
                             */
                            quantidade++;
                            // atualiza o volume atual do armário
                            volumeAtual = volumeAtual + volume;
                            System.out.println("Produto adicionado com sucesso!");
                            System.out.println("==============================================");
                        }
                    }
                    break;

                /*
                 * imprime produtos armazenados na seguinte regra:
                 * imprime nome do produto
                 * imprime volume do produto
                 * imprime tudo isso na ordem inversa
                 * BUBBLE SORT
                 */
                case 2:
                    /* verifica se há produtos armazenados */
                    if (quantidade == 0) {
                        /* avisa que nao tem nenhum produto add ainda se for imprimir */
                        System.out.println("Nenhum produto armazenado.");
                    } else {
                        /* percorre os produtos de trás pra frente e exibe nome e volume */
                        System.out.println("==============================================");
                        System.out.println("Produtos armazenados na ordem inversa:");
                        /*
                         * aqui ele percorre de tras p frente, entao o indice que ele vai
                         * comecar percorrendo, nao vai ser int = 0, e sim int i = quantidade -1.
                         */
                        /*
                         * int i = quantidade - 1 é o último índice do produto guardado,
                         * exemplo: se eu tenho 5 produtos guardados, o último índice é 4
                         */
                        /*
                         * como ele nao vai indo pra frente e sim diminuindo a cada vez que percorre
                         * a lista, se usa o i-- e não i++.
                         */
                        for (int i = quantidade - 1; i >= 0; i--) {
                            // aqui so imprime os valores nas posicoes que eles ficaram.
                            System.out.println("Nome: " + nomes[i]);
                            System.out.println("Volume: " + volumes[i]);
                            System.out.println("==============================================");
                        }
                    }
                    break;

                /*
                 * imprimir produto mais volumoso:
                 * mostrando qual é o produto q ocupa mais o espaço
                 * no armário e qual o seu volume
                 */
                case 3:
                    /* verifica se há produtos armazenados */
                    if (quantidade == 0) {
                        /* avisa que nao tem nenhum produto add ainda se for imprimir */
                        System.out.println("Nenhum produto armazenado.");
                    } else {
                        /*
                         * procura o índice do produto com maior volume
                         * e armazena na variavel temp q criei
                         */
                        /*declaro ela presumindo que o produto 
                         * mais valisoso ta na posicao 0.
                         */
                        int maiorIndice = 0;
                        /* percorre os produtos para encontrar o maior volume */
                        /*
                         * ele começa percorrendo apartir da posição 1
                         *porque depois no if ele compara se a posicao 1 
                         * é maior do que a posicao 0, ou seja, o primeiro produto
                         */
                        for (int i = 1; i < quantidade; i++) {
                            /*compara se o volume do produto na posicao [i] 
                             * é maior do que o volume do produto na posicao [maiorIndice]
                             */
                            if (volumes[i] > volumes[maiorIndice]) {
                                /*se for maior, ele é o produto mais volumoso */
                                maiorIndice = i;
                            }
                        }
                        System.out.println("==============================================");
                        System.out.println("Produto mais volumoso:");
                        System.out.println("Nome: " + nomes[maiorIndice]);
                        System.out.println("Volume: " + volumes[maiorIndice]);
                        System.out.println("==============================================");
                    }
                    break;

                /*
                 * devo ordenar os produtos na seguinte regra:
                 * ordenado com base no volume dos produtos
                 * do produto com maior volume para o menor >
                 * BUBBLE SORT
                 */

                /* me embabaquei muito */
                case 4:
                    /* bubble sort ordenando do maior para o menor volume */
                    for (int i = 0; i < quantidade - 1; i++) {
                        for (int j = 0; j < quantidade - 1 - i; j++) {
                            if (volumes[j] < volumes[j + 1]) {
                                /* troca volumes de lugar */
                                int tempVol = volumes[j];
                                volumes[j] = volumes[j + 1];
                                volumes[j + 1] = tempVol;

                                /* troca os nomes também */
                                String tempNome = nomes[j];
                                nomes[j] = nomes[j + 1];
                                nomes[j + 1] = tempNome;

                                System.out.println("Produtos ordenados por volume de maior para menor");
                                System.out.println("Nome: " + nomes[j]);
                                System.out.println("Volume: " + volumes[i]);
                                System.out.println("==============================================");
                            }
                        }
                    }

                    /*
                     * o bubble sort compara dois elementos
                     * e troca de lugar se tiverem na ordem errada, ai vai
                     * repetindo esse processo muitas vezes até quando tudo ficar ordenado
                     * aqui ele ordena do maior para o menor volume
                     */

                    break;

                /*
                 * excluo um produto com as informacoes:
                 * informo o nome do produto e ele é removido do vetor de nomes e volumes
                 * 
                 * 
                 * se nao for encontrado:
                 * informa que o produto nao existe
                 */
                case 5:
                    if (quantidade == 0) {
                        System.out.println("Nenhum produto armazenado.");
                    } else {
                        System.out.println("==============================================");
                        System.out.print("Informe o nome do produto a ser removido: ");
                        String nomeExcluir = scanner.next();
                        int indice = -1;

                        /* procura o índice do produto a ser excluído */
                        for (int i = 0; i < quantidade; i++) {
                            if (nomes[i].equalsIgnoreCase(nomeExcluir)) {
                                indice = i;
                                break;
                            }
                        }

                        if (indice == -1) {
                            System.out.println("Produto não encontrado.");
                        } else {
                            /* diminui o volume atual */
                            volumeAtual = volumeAtual - volumes[indice];

                            /* desloca os elementos para preencher o espaço q nao tem nada */
                            for (int i = indice; i < quantidade - 1; i++) {
                                nomes[i] = nomes[i + 1];
                                volumes[i] = volumes[i + 1];
                            }

                            /* reduz a quantidade total de produtos */
                            quantidade--;
                            scanner.nextLine();
                            System.out.println("Produto removido com sucesso.");
                            System.out.println("==============================================");
                        }
                    }
                    break;

                case 6:
                    /* opção para encerrar o programa */
                    System.out.println("Fim do Programa");
                    break;

                default:
                    System.out.println("Opção não existe.");
                    break;
            }

            /* se a opção escolhida for diferente de 6, le para */
        } while (opcao != 6);

        scanner.close();
    }
}
