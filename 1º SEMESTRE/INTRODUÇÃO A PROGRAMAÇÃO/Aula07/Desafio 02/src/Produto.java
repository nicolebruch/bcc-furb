
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

    public int codigoProduto() {
        return codigoProduto;
    }

    public String nomeProduto() {
        return nomeProduto;
    }

    public String categoriaProduto() {
        return categoriaProduto;
    }

    public int adicionarEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = this.quantidadeEstoque + quantidadeEstoque;
        return this.quantidadeEstoque;

    } /*
       * •removerEstoque(int quantidade) - remove produtos do estoque (retorna boolean
       * indicando sucesso)
       */

    public boolean removerEstoque(int quantidadeEstoque) {
        if (this.quantidadeEstoque >= quantidadeEstoque) {
            this.quantidadeEstoque = this.quantidadeEstoque - quantidadeEstoque;
            return true;
        }
        return false;
    }

    /*
     * • calcularValorTotal() - retorna o valor total do produto em estoque
     * (quantidade × preço)
     */

    public double calcularValorTotal(int quantidadeEstoque, double precoUnitario) {
        double valorTotal = this.quantidadeEstoque * this.precoUnitario;
        return valorTotal;

    }

    /* • toString() - retorna uma representação em String dos dados do produto */
    @Override
    public String toString() {
        return "Produto [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", quantidadeEstoque="
                + quantidadeEstoque + ", precoUnitario=" + precoUnitario + ", categoriaProduto= " + categoriaProduto
                + "calcularValorTotal=" + valorTotal + "]";

    }
}
