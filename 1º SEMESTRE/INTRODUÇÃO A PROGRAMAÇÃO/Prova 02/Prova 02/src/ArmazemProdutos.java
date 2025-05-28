import java.util.Scanner;

public class ArmazemProdutos {

    static final int MAX_PRODUTOS = 100; // Número máximo de produtos permitidos
    static String[] nomes = new String[MAX_PRODUTOS];
    static int[] volumes = new int[MAX_PRODUTOS];
    static int quantidade = 0;
    static int volumeAtual = 0;
    static int capacidadeMaxima;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a capacidade máxima do armário (em volume): ");
        capacidadeMaxima = scanner.nextInt();

        int opcao;
        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Inserir um produto");
            System.out.println("2 - Imprimir produtos armazenados (ordem inversa)");
            System.out.println("3 - Produto mais volumoso");
            System.out.println("4 - Ordenar os produtos por volume (maior para menor)");
            System.out.println("5 - Excluir um produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    inserirProduto(scanner);
                    break;
                case 2:
                    imprimirProdutosInverso();
                    break;
                case 3:
                    produtoMaisVolumoso();
                    break;
                case 4:
                    ordenarProdutos();
                    break;
                case 5:
                    excluirProduto(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    static void inserirProduto(Scanner scanner) {
        if (quantidade >= MAX_PRODUTOS) {
            System.out.println("O armário atingiu o número máximo de produtos.");
            return;
        }

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Volume do produto: ");
        int volume = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha

        if (volumeAtual + volume > capacidadeMaxima) {
            System.out.println("Não é possível adicionar. O armário está cheio ou o volume excede a capacidade.");
            return;
        }

        nomes[quantidade] = nome;
        volumes[quantidade] = volume;
        quantidade++;
        volumeAtual += volume;

        System.out.println("Produto adicionado com sucesso!");
    }

    static void imprimirProdutosInverso() {
        if (quantidade == 0) {
            System.out.println("Nenhum produto armazenado.");
            return;
        }

        System.out.println("\nProdutos armazenados (ordem inversa):");
        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println("Nome: " + nomes[i] + " | Volume: " + volumes[i]);
        }
    }

    static void produtoMaisVolumoso() {
        if (quantidade == 0) {
            System.out.println("Nenhum produto armazenado.");
            return;
        }

        int maiorIndice = 0;
        for (int i = 1; i < quantidade; i++) {
            if (volumes[i] > volumes[maiorIndice]) {
                maiorIndice = i;
            }
        }

        System.out.println("Produto mais volumoso:");
        System.out.println("Nome: " + nomes[maiorIndice] + " | Volume: " + volumes[maiorIndice]);
    }

    static void ordenarProdutos() {
        for (int i = 0; i < quantidade - 1; i++) {
            for (int j = i + 1; j < quantidade; j++) {
                if (volumes[i] < volumes[j]) {
                    // Troca volume
                    int tempVolume = volumes[i];
                    volumes[i] = volumes[j];
                    volumes[j] = tempVolume;

                    // Troca nome correspondente
                    String tempNome = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = tempNome;
                }
            }
        }
        System.out.println("Produtos ordenados por volume (maior para menor).");
    }

    static void excluirProduto(Scanner scanner) {
        if (quantidade == 0) {
            System.out.println("Nenhum produto armazenado.");
            return;
        }

        System.out.print("Informe o nome do produto a ser removido: ");
        String nome = scanner.nextLine();

        int indice = -1;
        for (int i = 0; i < quantidade; i++) {
            if (nomes[i].equalsIgnoreCase(nome)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("Produto não encontrado.");
            return;
        }

        volumeAtual -= volumes[indice];

        // Deslocar os elementos para esquerda
        for (int i = indice; i < quantidade - 1; i++) {
            nomes[i] = nomes[i + 1];
            volumes[i] = volumes[i + 1];
        }

        quantidade--;
        System.out.println("Produto removido com sucesso.");
    }
}
