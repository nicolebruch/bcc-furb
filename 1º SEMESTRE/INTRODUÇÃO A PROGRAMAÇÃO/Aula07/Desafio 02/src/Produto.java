
public class Produto {

    /*
     * Atributos sendo:
     * 
     * • codigo (int) - código único do produto
     * • nome (String) - nome do produto
     * • quantidade (int) - quantidade em estoque
     * • preco (double) - preço unitário
     * • categoria (String) - categoria do produto
     * 
     */

    int codigoProduto;
    String nomeProduto;
    int quantidadeEstoque;
    double precoUnitario;
    String categoriaProduto;

    /*
     * Métodos:
     * • Construtor com todos os parâmetros
     */
public produto(int codigoProduto, String nomeProduto, int quantidadeEstoque, double precoUnitario, String categoriaProduto) {
    this.codigoProduto = codigoProduto;
    this.nomeProduto = nomeProduto;
    this.quantidadeEstoque = quantidadeEstoque;
    this.precoUnitario = precoUnitario;
    this.categoriaProduto = categoriaProduto;


 
} /* • adicionarEstoque(int quantidade) - adiciona produtos ao estoque */

    public int adicionarEstoque(int quantidadeEstoque) {
        return 0;

    } /* • adicionarEstoque(int quantidade) - adiciona produtos ao estoque */

    public int removerEstoque(int quantidadeEstoque) {
        return false;

    } /*
       * • calcularValorTotal() - retorna o valor total do produto em estoque
       * (quantidade × preço)
       */

    public double calcularValorTotal(int quantidadeEstoque, double precoUnitario) {
        return 0;

    }

    /* • toString() - retorna uma representação em String dos dados do produto */
    @Override
    public String toString() {
        return " ";

    }
}
