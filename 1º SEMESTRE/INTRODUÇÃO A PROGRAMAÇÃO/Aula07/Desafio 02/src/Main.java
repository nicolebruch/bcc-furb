import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    /* gerenciar estoque de uma loja */

    /*
     * precisa:
     * 1. cadastro de produtos
     * 2. controle de entrada e saida de mercadorias
     * 3. geracao de relatorios basicos do estoque
     */

    /*
     * na main precisa ter menu de opcoes, sendo:
     * 1. Cadastrar produto
     * 2. Entrada de mercadoria (adicionar estoque)
     * 3. Saída de mercadoria (remover estoque)
     * 4. Listar todos os produtos
     * 5. Listar produtos por categoria
     * 6. Buscar produto por código
     * 7. Sair
     */

    Produto[] vetorProdutos = new Produto[30];
    ControleEstoque controle = new ControleEstoque(vetorProdutos, 0);

    int opcao;

    // Menu principal
    do {
      System.out.println("\n===== SISTEMA DE GESTÃO DE ESTOQUES =====");
      System.out.println("1. Cadastrar produto");
      System.out.println("2. Entrada de mercadoria");
      System.out.println("3. Saída de mercadoria");
      System.out.println("4. Listar todos os produtos");
      System.out.println("5. Listar produtos por categoria");
      System.out.println("6. Buscar produto por código");
      System.out.println("7. Sair");
      System.out.println("=========================================");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        case 1:
          /*
           * Cadastrar novo produto
           */
          System.out.print("Código do produto: ");
          int codigo = scanner.nextInt();
          scanner.nextLine(); // limpar buffer
          System.out.print("Nome do produto: ");
          String nome = scanner.nextLine();
          System.out.print("Quantidade em estoque: ");
          int quantidade = scanner.nextInt();
          System.out.print("Preço unitário: ");
          double preco = scanner.nextDouble();
          scanner.nextLine(); // limpar buffer
          System.out.print("Categoria: ");
          String categoria = scanner.nextLine();

          // Cria o produto e tenta cadastrar
          Produto novoProduto = new Produto(codigo, nome, quantidade, preco, categoria);
          boolean cadastrado = controle.cadastrarProduto(novoProduto);
          if (cadastrado) {
            System.out.println("Produto cadastrado com sucesso!");
          } else {
            System.out.println("Erro: estoque cheio.");
          }
          break;

        case 2:
          /*
           * Entrada de mercadoria (adicionar ao estoque)
           */
          System.out.print("Informe o código do produto: ");
          int codEntrada = scanner.nextInt();
          System.out.print("Quantidade a adicionar: ");
          int qtdEntrada = scanner.nextInt();

          Produto prodEntrada = controle.buscarProduto(codEntrada);
          if (prodEntrada != null) {
            prodEntrada.adicionarEstoque(qtdEntrada);
            System.out.println("Estoque atualizado com sucesso.");
          } else {
            System.out.println("Produto não encontrado.");
          }
          break;

        case 3:
          /*
           * Saída de mercadoria (remover do estoque)
           */
          System.out.print("Informe o código do produto: ");
          int codSaida = scanner.nextInt();
          System.out.print("Quantidade a remover: ");
          int qtdSaida = scanner.nextInt();

          Produto prodSaida = controle.buscarProduto(codSaida);
          if (prodSaida != null) {
            boolean removido = prodSaida.removerEstoque(qtdSaida);
            if (removido) {
              System.out.println("Saída registrada com sucesso.");
            } else {
              System.out.println("Erro: estoque insuficiente.");
            }
          } else {
            System.out.println("Produto não encontrado.");
          }
          break;

        case 4:
          /*
           * Listar todos os produtos cadastrados
           */
          controle.listarTodosProdutos();
          break;

        case 5:
          /*
           * Listar produtos de uma categoria específica
           */
          System.out.print("Informe a categoria: ");
          String catBusca = scanner.nextLine();
          controle.listarProdutosPorCategoria(catBusca);
          break;

        case 6:
          /*
           * Buscar produto por código
           */
          System.out.print("Informe o código: ");
          int codBusca = scanner.nextInt();
          Produto encontrado = controle.buscarProduto(codBusca);
          if (encontrado != null) {
            System.out.println(encontrado);
          } else {
            System.out.println("Produto não encontrado.");
          }
          break;

        case 7:
          /*
           * Encerrar o programa
           */
          System.out.println("Encerrando o programa...");
          break;

        default:
          System.out.println("Opção inválida.");
          break;
      }
    } while (opcao != 7);

    scanner.close();
  }
}
