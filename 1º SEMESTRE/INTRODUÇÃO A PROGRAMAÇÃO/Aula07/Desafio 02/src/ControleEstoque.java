public class ControleEstoque {
    /*
     * Atributos sendo:
     * • produtos - vetor de objetos Produto (capacidade para 30 produtos)
     * • quantidadeProdutos (int) - controla quantos produtos estão cadastrados
     */
    int vetorProdutos[] = new int[30];
    int quantidadeProdutos;

    /* Construtor padrão (inicializa o vetor e a quantidade) */
    public ControleEstoque(int vetorProdutos, int quantidadeProdutos) {
        this.vetorProdutos = vetorProdutos;
        this.quantidadeProdutos = quantidadeProdutos;

    }

    /* • cadastrarProduto(Produto produto) - adiciona um produto ao estoque */
    public int CadastrarProduto(int vetorProdutos) {
        return 0;
    }

    /*
     * • buscarProduto(int codigo) - retorna o produto com o código informado (ou
     * null se não encontrar)
     */
    public int buscarProduto(int codigoProduto) {
        return null;

    }

    /* listarTodosProdutos() - exibe todos os produtos cadastrados */

    public void listarTodosProdutos(int vetorProdutos) {
        System.out.println(" ");
    }

    /*
     * • listarProdutosPorCategoria(String categoria) - lista produtos de uma
     * categoria específica
     */

    public void listarProdutosPorCategoria(String categoriaProduto) {
        System.out.println(" ");
    }

    /*
     * • calcularValorTotalEstoque() - calcula o valor total de todos os produtos em
     * estoque
     */
    public double calcularValorTotalEstoque() {
return 0.0;
    }
