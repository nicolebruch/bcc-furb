import java.util.Scanner;
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

public class ProdutosQuimicos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a capacidade MÁXIMA (em volume) do armário: ");
        int capacidadeMaxima = scanner.nextInt();

        System.out.print("Informe a quantidade MÁXIMA de produtos que o armário pode armazenar: ");
        int maxProdutos = scanner.nextInt();
        scanner.nextLine();

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
                case 1:
                    /*
                     * informa a quantidade de produtos mas se for maior doq comporta nao pode add
                     */
                    if (quantidade >= maxProdutos) {
                        System.out.println("O armário atingiu o número máximo de produtos.");
                    } else {
                        System.out.print("Informe o nome do Produto Químico: ");
                        String nome = scanner.nextLine();

                        System.out.print("Informe o volume do produto: ");
                        int volume = scanner.nextInt();

                        if (volumeAtual + volume > capacidadeMaxima) {
                            System.out.println("Não é possível adicionar. O volume excede a capacidade do armário.");
                        } else {
                            nomes[quantidade] = nome;
                            volumes[quantidade] = volume;
                            quantidade++;
                            volumeAtual += volume;
                            System.out.println("Produto adicionado com sucesso!");
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
                    if (quantidade == 0) {
                        System.out.println("Nenhum produto armazenado.");
                    } else {
                        System.out.println("Produtos armazenados (na ordem inversa):");
                        for (int i = quantidade - 1; i >= 0; i--) {
                            System.out.println("Nome: " + nomes[i]);
                            System.out.println("Volume: " + volumes[i]);
                        }
                    }
                    break;

                /*
                 * imprimir produto mais volumoso:
                 * mostrando qual é o produto q ocupa mais o espaço
                 * no armário e qual o seu volume
                 */
                case 3:
                    if (quantidade == 0) {
                        System.out.println("Nenhum produto armazenado.");
                    } else {
                        /* variavel temporária para armazenar o maior indice */
                        int maiorIndice = 0;
                        for (int i = 1; i < quantidade; i++) {
                            if (volumes[i] > volumes[maiorIndice]) {
                                maiorIndice = i;
                            }
                        }
                        System.out.println("Produto mais volumoso:");
                        System.out.println("Nome: " + nomes[maiorIndice]);
                        System.out.println("Volume: " + volumes[maiorIndice]);
                    }
                    break;

                /*
                 * devo ordenar os produtos na segguinte regra:
                 * ordenado com base no volume dos produtos
                 * do produto com maior volume para o menor >
                 * BUBBLE SORT
                 */
                case 4:
                    for (int i = 0; i < quantidade - 1; i++) {
                        for (int j = 0; j < quantidade - 1 - i; j++) {
                            if (volumes[j] < volumes[j + 1]) {
                                /* faco bubble sort pra volume */
                                int tempVol = volumes[j];
                                volumes[j] = volumes[j + 1];
                                volumes[j + 1] = tempVol;

                                /* faço bubble sort pra nome */
                                String tempNome = nomes[j];
                                nomes[j] = nomes[j + 1];
                                nomes[j + 1] = tempNome;
                            }
                        }
                    }
                    System.out.println("Produtos ordenados por volume (maior para menor).");
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
                        System.out.print("Informe o nome do produto a ser removido: ");
                        String nomeExcluir = scanner.nextLine();
                        int indice = -1;

                        for (int i = 0; i < quantidade; i++) {
                            if (nomes[i].equalsIgnoreCase(nomeExcluir)) {
                                indice = i;
                                break;
                            }
                        }

                        if (indice == -1) {
                            System.out.println("Produto não encontrado.");
                        } else {
                            volumeAtual -= volumes[indice];
                            /* aqui eu removo o produto */
                            for (int i = indice; i < quantidade - 1; i++) {
                                nomes[i] = nomes[i + 1];
                                volumes[i] = volumes[i + 1];
                            }
                            quantidade--;
                            System.out.println("Produto removido com sucesso.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Fim do Programa");
                    break;

                default:
                    System.out.println("Opção não existe.");
                    break;
            }

        } while (opcao != 6);

        scanner.close();
    }
}
