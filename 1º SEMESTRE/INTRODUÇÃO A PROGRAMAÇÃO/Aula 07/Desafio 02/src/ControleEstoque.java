public class ControleEstoque {

    /*
     * Atributos sendo:
     * • produtos - vetor de objetos Produto (capacidade para 30 produtos)
     * • quantidadeProdutos (int) - controla quantos produtos estão cadastrados
     */
    Produto[] produtos = new Produto[30]; 
    int quantidadeProdutos;

    /*
     * Construtor padrão (inicializa o vetor e a quantidade)
     */
    public ControleEstoque() {
        produtos = new Produto[30];
        quantidadeProdutos = 0;
    }

    /*
     * • cadastrarProduto(Produto produto) - adiciona um produto ao estoque
     */
    public boolean cadastrarProduto(Produto produto) {
        if (quantidadeProdutos < produtos.length) {
            produtos[quantidadeProdutos] = produto;
            quantidadeProdutos++;
            return true;
        }
        return false; // estoque cheio
    }

    /*
     * • buscarProduto(int codigo) - retorna o produto com o código informado
     * (ou null se não encontrar)
     */
    public Produto buscarProduto(int codigo) {
        for (int i = 0; i < quantidadeProdutos; i++) {
            if (produtos[i].getCodigoProduto() == codigo) {
                return produtos[i];
            }
        }
        return null; // não encontrado
    }

    /*
     * • listarTodosProdutos() - exibe todos os produtos cadastrados
     */
    public void listarTodosProdutos() {
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println(produtos[i]);
        }
    }

    /*
     * • listarProdutosPorCategoria(String categoria) - lista produtos de uma
     * categoria específica
     */
    public void listarProdutosPorCategoria(String categoria) {
        for (int i = 0; i < quantidadeProdutos; i++) {
            if (produtos[i].getCategoriaProduto().equalsIgnoreCase(categoria)) {
                System.out.println(produtos[i]);
            }
        }
    }

    /*
     * • calcularValorTotalEstoque() - calcula o valor total de todos os produtos em estoque
     */
    public double calcularValorTotalEstoque() {
        double total = 0.0;
        for (int i = 0; i < quantidadeProdutos; i++) {
            total += produtos[i].calcularValorTotal();
        }
        return total;
    }
}
